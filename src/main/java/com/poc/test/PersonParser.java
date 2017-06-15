package com.poc.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PersonParser {

	public PersonParser() {
		// TODO Auto-generated constructor stub
	}
	
	public static class Person {
		@JsonProperty("id")
		private Integer id;
		@JsonProperty("name")
		private String name;
		@JsonProperty("age")
		private Integer age;
		private final static long serialVersionUID = -1154881047048171946L;
		public Person() {
		}		
		public Person(Integer id, String name, Integer age) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			}

			@JsonProperty("id")
			public Integer getId() {
			return id;
			}

			@JsonProperty("id")
			public void setId(Integer id) {
			this.id = id;
			}

			@JsonProperty("name")
			public String getName() {
			return name;
			}

			@JsonProperty("name")
			public void setName(String name) {
			this.name = name;
			}

			@JsonProperty("age")
			public Integer getAge() {
			return age;
			}

			@JsonProperty("age")
			public void setAge(Integer age) {
			this.age = age;
			}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//read json file data to String
		byte[] jsonData = Files.readAllBytes(Paths.get("C:/INTEG/temp/person.txt"));
		String jsonString = "{\"id\":101,\"name\":\"ravi\",\"age\":10}";
		//create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();
		
		//convert json string to object
		Person p = objectMapper.readValue(jsonString, Person.class);
		
		System.out.println("Person Object\n"+p);
	}

}
