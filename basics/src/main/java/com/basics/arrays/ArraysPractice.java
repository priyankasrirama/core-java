package com.basics.arrays;

import com.basics.model.Student;

public class ArraysPractice {

	// int array declaration
	private int[] intArray;
	// intialization of int array size 10
	private int[] intArray2 = new int[10];
	// initialization of int array with values of size 3
	private int[] intArray3 = { 1, 2, 3 };
	private int[] intArray4 = {};
	private float[] floatArray1 = { 1.2f, 2.3f, 5.4f };
	private Student[] studentArray = new Student[20];

	public void method1() {
		int[] intArray = new int[10];
		intArray[0] = 10;
		intArray[1] = 20;

	}

	public void method2() {
		Student[] studentArray = new Student[20];
		Student student = new Student();
		studentArray[0] = student;
		Student student2 = new Student();
		studentArray[1] = student2;

	}

}
