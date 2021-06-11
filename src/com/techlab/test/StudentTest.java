package com.techlab.test;

import com.techlab.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student(12,"Sam",24);
		Student s2 = new Student(19,"Bob",19);
		Student s3 = new Student(2,"Peter");
		
		System.out.println("Student 1 Details: ");
		createStudent(s1);
		System.out.println("\nStudent 2 Details: ");
		createStudent(s2);
		System.out.println("\nStudent 3 Details: ");
		createStudent(s3);
		Student elder = s1.whoIsElder(s2);
		System.out.println("Elder Age: "+elder.getAge());
		System.out.println("Student 1 Hashcode: "+s1.hashCode());
		System.out.println("Student 2 Hashcode: "+s2.hashCode());
		System.out.println("Elder Hashcode: "+elder.hashCode());
	}
	public static void createStudent(Student obj) {
		System.out.println("Id: "+obj.getId());
		System.out.println("Name: "+obj.getName());
		System.out.println("Age: "+obj.getAge());
	}
}
