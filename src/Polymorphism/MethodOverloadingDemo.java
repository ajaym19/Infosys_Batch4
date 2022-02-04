package Polymorphism;

public class MethodOverloadingDemo {

	/*
	 * Method Overloading
	 * Same method name in one class
	 * can be achieved in 2 ways
	 * 1. By different number of parameters
	 * 2. by different data types
	 */
	public void add(int a, int b) {
		System.out.println("Adding 2 int numbers");
	}
	
	public void add(float a, float b) {
		System.out.println("Adding 2 float numbers");
	}
	
	public void add(int a, int b, int c) {
		System.out.println("Adding 3 int numbers");
	}
	
	public void add(int a, int b, int c, int d) {
		System.out.println("Adding 4 int numbers");
	}
}
