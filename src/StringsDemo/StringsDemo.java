package StringsDemo;

public class StringsDemo {

	/*
	 * String
	 * it is a non primitive data type
	 * it is a class in JAVA
	 * String objects are immutable in JAVA
	 * 
	 * ways to declare a string
	 * 1. String literal
	 * Rule1:
	 * 	Object is created >> String Constant Pool SCP
	 * Rule2:
	 * 	If there is a string with same value already exists,
	 * 	then no new object will be created
	 * 	the new variable will be pointing to the existing object
	 * Rule3:
	 * 	If there is no matching string a new object is created
	 * Rule4:
	 * 	new keyword is not used here
	 * 
	 * 2. String object
	 * Rule1:
	 * 	Objects are created in Heap Memory
	 * Rule2: 
	 * 	new keywords are used to create objects
	 * Rule3:
	 * 	Even if there is a matching string present or no
	 * 	Still a new object will be created
	 */
	
	public static void main(String[] args) {
		String name = "Ajay";
		System.out.println(name);
		name = name.concat("Trainer");
		
		System.out.println(name); //
		System.out.println(name.length());
		
		System.out.println(name.charAt(3));
		
//		to print all the characters one by one using for loop
		//to print all the characters in reverse
		//eg Ajay >> yaja
		
		System.out.println("Learning String Buffer");
		StringBuffer sb = new StringBuffer("AJay");
		System.out.println(sb);
		sb.append(" Trainer");
		System.out.println(sb);
//		System.out.println(sb.reverse());
		sb.insert(2, 'Z');
		System.out.println(sb);
		sb.replace(0, 2, "jjj");
		System.out.println(sb);
		
		StringBuilder builder = new StringBuilder("Ajay");
		
		String job = "Trainer";//String literal
		String title = new String("HR"); //strin gobject
	}
}
