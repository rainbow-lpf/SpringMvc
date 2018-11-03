package com.java1234.model;

public class Student {

	
	public Student() {
		super();
	}

	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Student(int id,String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.id=id;
	}


	private int id;
	
	private String name;
	
	private int age;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	
}
