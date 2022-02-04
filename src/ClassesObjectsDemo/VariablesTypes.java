package ClassesObjectsDemo;

public class VariablesTypes {

	/*
	 * Types of Variables:
	 * 1. Global: any variable declared
	 * inside the class and outside the method
	 * 	a. Static: using static keyword 
	 * 	b. Instance: without using static
	 * 
	 * 2. Local: any variable declated
	 * inside the class but inside the method
	 * 
	 * 
	 * Types of Methods
	 * 1. Static: from here you can only access static variables
	 * 2. Instance: from here you can access both static and instance
	 */
	
	//inside a class
	//outside a method
	
	int id;
	String empName;
	static String companyName;
	
	public void getInfo() {
		//inside a class
		//inside a method
		int i = 5;
		System.out.println(i);
		System.out.println(id);
		System.out.println(empName);
		System.out.println(companyName);
	}
	
	public void instanceExample() {
		
		System.out.println(companyName);
		System.out.println(empName);
	}
	
	public static void staticExample() {
		System.out.println(companyName);
		System.out.println();
	}
	
	public static void showDisclaimer() {
		
		System.out.println("Generic Information");
	}
}
