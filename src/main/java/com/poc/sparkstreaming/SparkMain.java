package com.poc.sparkstreaming;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.sql.DataFrame;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SQLContext;
import org.apache.spark.sql.hive.HiveContext;
import org.apache.spark.storage.StorageLevel;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaPairDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.kafka.KafkaUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.poc.datamodel.ServiceNowModel;

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
		
		final JavaStreamingContext jssc = new JavaStreamingContext(sparkConf , Durations.milliseconds(5000));
		final SQLContext sqlContext = new SQLContext(jssc.sparkContext());
		final HiveContext hiveContext = new org.apache.spark.sql.hive.HiveContext(jssc.sparkContext());
		
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
				
		
//		kafkaStream.foreachRDD(new Function<JavaPairRDD<String,String>, Void>() {
//			
//			public Void call(JavaPairRDD<String, String> rdd) throws Exception {
//				
//				rdd.foreachPartitionAsync(new VoidFunction<Iterator<Tuple2<String,String>>>() {
//					
//					public void call(Iterator<Tuple2<String, String>> ti) throws Exception {
//						JSONParser p = new JSONParser();
//						while (ti.hasNext()) {
//							Tuple2<java.lang.String, java.lang.String> tuple2 = (Tuple2<java.lang.String, java.lang.String>) ti
//									.next();
////							System.out.println(tuple2._1() + " : " + tuple2._2());
//							String jsonMsgString = tuple2._2();
//							
//							JSONObject snowJson = (JSONObject) p.parse(jsonMsgString);
//							
//							System.out.println(snowJson);
//						}
//						
//					}
//				});
//				
//				return null;
//			}
//		});
		
		kafkaStream.map(new Function<Tuple2<String,String>, String>() {

			public String call(Tuple2<String, String> v1) throws Exception {
				return v1._2();
			}
		})
		.foreachRDD(new Function<JavaRDD<String>, Void>() {
			
			public Void call(JavaRDD<String> rdd) throws Exception {
				// TODO Auto-generated method stub
				JavaRDD<ServiceNowModel> serviceNowRDD = 
				rdd.map(new Function<String, ServiceNowModel>() {

					public ServiceNowModel call(String jsonString) throws Exception {
						ObjectMapper mapper = new ObjectMapper();
						ServiceNowModel sn = mapper.readValue(jsonString, ServiceNowModel.class);
						return sn;
					}
				});
				
				DataFrame serviceNowDF = sqlContext.createDataFrame(serviceNowRDD, ServiceNowModel.class);
				
				DataFrame serviceNowDF2 = hiveContext.createDataFrame(serviceNowRDD, ServiceNowModel.class);
				String dest = "C:/INTEG/temp/snow/"+System.currentTimeMillis();
				
				serviceNowDF2.printSchema();
				
				// create a new hive context from the spark context
//				HiveContext hiveContext = new HiveContext (jssc.sparkContext() );
//				df = hiveContext.createDataFrame(rdd);
				
//				serviceNowDF.write().mode(SaveMode.Append).format("orc").save("C:/INTEG/temp/snow");
				
//				serviceNowDF.write()
//					.format("com.databricks.spark.csv")
//					.option("header", "false")
//					.save(dest);
//				serviceNowDF.write()
//				.text(dest);

//				serviceNowDF.createOrReplaceTempView("mytempTable");
				
//				serviceNowDF2.select("number","state", "active").save(dest, "org.apache.spark.sql.hive.orc", SaveMode.Append);
//				serviceNowDF2.registerTempTable("snowtable");
//				DataFrame results = sqlContext.sql("select * from snowtable");
//				results.show(10);
				serviceNowDF.show(10);
				Row[] rows = serviceNowDF2.collect();
				for (Row row : rows) {
					System.out.println(row.toString());
				}
				return null;
			}
		});
		
//		kafkaStream
//		.print();

		jssc.start();
		jssc.awaitTermination();
	}

}
