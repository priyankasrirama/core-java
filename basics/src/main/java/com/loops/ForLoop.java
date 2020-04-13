package com.loops;

public class ForLoop {

	public static void main(String[] args) {
		ForLoop forLoop = new ForLoop();
		forLoop.method1();
	}

	public void method1() {
		int[] intArray = new int[5];
		intArray[0] = 10;
		intArray[1] = 12;
		intArray[2] = 15;
		intArray[3] = 20;
		intArray[4] = 25;

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

}
