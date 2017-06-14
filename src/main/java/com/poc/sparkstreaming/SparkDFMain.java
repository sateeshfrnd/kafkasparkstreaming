package com.poc.sparkstreaming;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.sql.DataFrame;
import org.apache.spark.sql.SQLContext;
import org.apache.spark.sql.types.StructType;
import org.apache.spark.storage.StorageLevel;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaPairDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.kafka.KafkaUtils;

import com.poc.utils.KafkaMsgProducer;

import kafka.serializer.StringDecoder;
import scala.Tuple2;

public class SparkDFMain {

	public SparkDFMain() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws IOException{
		
		
//        String topic = args[0];
//        String consumergroup = args[1];
//        String zkquorum = args[2];		
		
		SparkConf sparkConf = new SparkConf();
		
		sparkConf.setAppName("StreamingKafka");
		String master = "local[*]";
//        if (args.length > 3) {
//            String master = args[3];
            sparkConf.setMaster(master);
//        }		
		
//		JavaStreamingContext jssc = new JavaStreamingContext(sparkConf , Durations.milliseconds(5000));
        JavaSparkContext jsc = new JavaSparkContext(sparkConf);
		SQLContext sqlContext = new SQLContext(jsc);
		
		String jsonFilepath = SparkDFMain.class.getResource("/service_now.json").getFile();
		
		DataFrame df = sqlContext.read().json(jsonFilepath).toDF();
	    df.registerTempTable("df");
	    StructType schema = df.schema();
	    Class<? extends StructType> sc = schema.getClass();
	    System.out.println(schema);
	    
	    df.printSchema();

//		jssc.start();
//		jssc.awaitTermination();
	}
}
