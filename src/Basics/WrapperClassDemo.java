package Basics;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		/*
		 * Wrapper Class:
		 * it provides a mechanism
		 * to convert primitive into object based and vice-versa
		 * 
		 * There are 8 wrapper class
		 * 
		 * Autoboxing:
		 * conversion of primitive data type to its corresponding wrapper class
		 * 
		 * Unboxing:
		 * converstion of wrapper type to primitive ty[e
		 * 
		 */
		int i =12;
		Integer i1 = Integer.valueOf(i); //converting int to Integer explicitly
		Integer i2 = i; //autoboxing, compiler will internally call Integer.value of(int)
		
		Integer i3 = new Integer(10);
		int i4 = i3.intValue();
		int i5 = i3; //unboxing
		
		
	}
}
