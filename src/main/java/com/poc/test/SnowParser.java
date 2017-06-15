package com.poc.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.poc.datamodel.ServiceNowModel;


public class SnowParser {

	public SnowParser() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		byte[] jsonData = Files.readAllBytes(Paths.get("C:/INTEG/temp/service_now.json"));
		String jsonString = "{\"id\":101,\"name\":\"ravi\",\"age\":10}";
		//create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();
		
		//convert json string to object
		ServiceNowModel snow = objectMapper.readValue(jsonData, ServiceNowModel.class);
		
		System.out.println("SNOW Object\n"+snow);

	}

}
