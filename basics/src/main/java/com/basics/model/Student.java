package com.basics.model;

// outer class
// concrete class
public class Student {

	// instance variable
	private String name;

	public String course;

	// static variable
	public static int age;

	protected double grade;

	String rank;

	// zero argument constructor
	public Student() {
	}

	// argumented constructor
	public Student(String name) {

	}

	public void method1(int i) {
		System.out.println(name);
	}

	// inner class
	class Address {
	}
}
