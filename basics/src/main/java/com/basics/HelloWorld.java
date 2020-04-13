package com.basics;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("hello world");
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.method1();
		helloWorld.method2(10);
		helloWorld.method3(10, 12.7f);
		helloWorld.method4(10, 12.7f, 13.5);
		int a = helloWorld.method5();
		System.out.println(a);
		int c = helloWorld.method6(20, 30);
		System.out.println(c);
		float d = helloWorld.method7(12.7f, 13.8f);
		System.out.println(d);
	}

	public void method1() {
		System.out.println("method1");
	}

	public void method2(int i) {
		System.out.println(i);
	}

	public void method3(int i, float j) {
		System.out.println(i);
		System.out.println(j);
	}

	public void method4(int i, float j, double k) {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}

	public int method5() {
		return 20;
	}

	public int method6(int a, int b) {
		return a + b;
	}

	public float method7(float i, float j) {
		return i * j;
	}
}
