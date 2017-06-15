package com.poc.test;

public class Person {

	public Person() {
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", " + (name != null ? "name=" + name + ", " : "") + "age=" + age + "]";
	}
	
	
}
