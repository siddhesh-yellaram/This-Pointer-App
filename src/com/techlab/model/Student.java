package com.techlab.model;

public class Student {
	private int id,age;
	private String name;
	
	public Student(int id, String name) {
		this(id,name,25);
	}
	
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Student whoIsElder(Student obj) {
		if(this.age > obj.age)
			return this;
		else
			return obj;
	}
	
	public int getId() {
		return id;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
}
