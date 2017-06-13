package com.poc.sparkstreaming;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.function.ForeachFunction;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.VoidFunction;
//import org.apache.spark.sql.SQLContext;
import org.apache.spark.storage.StorageLevel;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaPairDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.kafka.KafkaUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import kafka.serializer.StringDecoder;
import scala.Tuple2;
public class SparkMain {

	public SparkMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
        String topic = args[0];
        String consumergroup = args[1];
        String zkquorum = args[2];		
		
		SparkConf sparkConf = new SparkConf();
		sparkConf.setAppName("StreamingKafka");
        if (args.length > 3) {
            String master = args[3];
            sparkConf.setMaster(master);
        }		
		
		JavaStreamingContext jssc = new JavaStreamingContext(sparkConf , Durations.milliseconds(5000));
		
		
		HashMap<String, String> kafkaParams = new HashMap<String, String>();
		kafkaParams.put("zookeeper.connect", zkquorum);
		kafkaParams.put(ConsumerConfig.GROUP_ID_CONFIG, consumergroup);
		kafkaParams.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
		kafkaParams.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "1000");
		kafkaParams.put(ConsumerConfig.SESSION_TIMEOUT_MS, "30000");
		kafkaParams.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "smallest");		
//		kafkaParams.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
//		kafkaParams.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
		
		
		
	    HashMap<String, Integer> topicParams = new HashMap<String, Integer>();
	    topicParams.put(topic, 1);
	    
		JavaPairDStream<String, String> kafkaStream = KafkaUtils.createStream(jssc,
				String.class,
				String.class,
				StringDecoder.class,
				StringDecoder.class,
				kafkaParams,
				topicParams,
				StorageLevel.MEMORY_AND_DISK_SER()); 
				
		
		kafkaStream.foreachRDD(new Function<JavaPairRDD<String,String>, Void>() {
			
			public Void call(JavaPairRDD<String, String> rdd) throws Exception {
				
				rdd.foreachPartitionAsync(new VoidFunction<Iterator<Tuple2<String,String>>>() {
					
					public void call(Iterator<Tuple2<String, String>> ti) throws Exception {
						JSONParser p = new JSONParser();
						while (ti.hasNext()) {
							Tuple2<java.lang.String, java.lang.String> tuple2 = (Tuple2<java.lang.String, java.lang.String>) ti
									.next();
//							System.out.println(tuple2._1() + " : " + tuple2._2());
							String jsonMsgString = tuple2._2();
							
							JSONObject snowJson = (JSONObject) p.parse(jsonMsgString);
							
							System.out.println(snowJson);
						}
						
					}
				});
				
				return null;
			}
		});
		
//		kafkaStream
//		.print();

		jssc.start();
		jssc.awaitTermination();
	}

}
