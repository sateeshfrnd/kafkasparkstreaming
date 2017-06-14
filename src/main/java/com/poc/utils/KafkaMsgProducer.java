package com.poc.utils;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class KafkaMsgProducer {
    public static void main(String[] args) throws IOException, ParseException {
        String topic = args[0];
        String brokers = args[1];

        Properties props = new Properties();
        props.put("bootstrap.servers", brokers);
        props.put("client.id", "KafkaMsgProducer");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        Random rnd = new Random();
        KafkaProducer<String, String> producer = new KafkaProducer<String, String>(props);
        
        InputStream jsonInputStream = KafkaMsgProducer.class.getResourceAsStream("/service_now.json");
        
//        FileReader jsonFileReader = new FileReader(KafkaMsgProducer.class.getResource("service_now.json").getFile());
        JSONParser parser = new JSONParser();

        JSONObject jsonObject = (JSONObject) parser.parse( new InputStreamReader(jsonInputStream, "UTF-8"));
        System.out.println(jsonObject);
        
        JSONArray jsonArray = (JSONArray) jsonObject.get("result");
        Iterator<JSONObject> iterator = jsonArray.iterator();
        
        
        while (iterator.hasNext()) {
        	String msg = iterator.next().toJSONString();
            System.out.println(msg);
            try {
                //async
//                producer.send(new ProducerRecord<String, String>(topic, "key", msg), new Callback() {
//					public void onCompletion(RecordMetadata recordMetadata, Exception e) {}
//				});
                //sync
            	for (int i = 0; i < 1000; i++) {
            		String key = Integer.toString(rnd.nextInt(255));
            		producer.send(new ProducerRecord<String, String>(topic, key, msg)).get();
					
				}
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        producer.close();
    }
}