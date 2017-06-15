package com.poc.sparkstreaming;

import java.io.IOException;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.sql.DataFrame;
import org.apache.spark.sql.SQLContext;
import org.apache.spark.sql.hive.HiveContext;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.poc.datamodel.ServiceNowModel;
import com.poc.test.Person;

public class SparkDFMain {

	public SparkDFMain() {
		// TODO Auto-generated constructor stub
	}
	

	public static void main(String[] args) throws IOException, ParseException{
		
		
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
		HiveContext hiveContext = new org.apache.spark.sql.hive.HiveContext(jsc.sc());
		
		String jsonFilepath = SparkDFMain.class.getResource("/service_now.json").getFile();
		
		JavaRDD<String> jrdd = jsc.textFile("C:/INTEG/temp/person.txt"); 
		JavaRDD<String> snowrdd = jsc.textFile("C:/INTEG/temp/service_now.json");
		
        
//		DataFrame df = sqlContext.read().json(jsonFilepath).toDF();
//	    df.registerTempTable("df");
//	    StructType schema = df.schema();
//	    Class<? extends StructType> sc = schema.getClass();
//	    System.out.println(schema);
//	    df.printSchema();
		
		JavaRDD<Person> prdd = jrdd.map(new Function<String, Person>() {
			public Person call(String v1) throws Exception {
				ObjectMapper mapper = new ObjectMapper();
				Person p = mapper.readValue(v1, Person.class);
				System.out.println(p);
				return p;
			}
		});
		
		DataFrame pdf = hiveContext.createDataFrame(prdd, Person.class);
		
		pdf.printSchema();
		pdf.show();
		
		
//		JavaRDD<ServiceNowModel> snowrdd2 = snowrdd.map(new Function<String, ServiceNowModel>() {
//
//			public ServiceNowModel call(String v1) throws Exception {
//				ObjectMapper objectMapper = new ObjectMapper();
//				ServiceNowModel snow = objectMapper.readValue(v1, ServiceNowModel.class);		
//				System.out.println(snow);
//				return snow;
//			}
//		});
//		DataFrame snowdf = hiveContext.createDataFrame(snowrdd2, ServiceNowModel.class);
//		
////		snowdf.printSchema();
//		
//		DataFrame newDF = snowdf.coalesce(1);
//		
//		newDF.printSchema();
//		newDF.show();
//		snowdf.show();
		
//		jssc.start();
//		jssc.awaitTermination();
	}
}
