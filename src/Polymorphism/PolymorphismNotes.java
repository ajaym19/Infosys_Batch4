package Polymorphism;

public class PolymorphismNotes {

	/*
	 * Parent class
	 * common method
	 * 
	 * 10 child class
	 * 9/10 child class - are OK with the implementation
	 * 1/10 child class - is not OK
	 * 
	 * 
	 * Polymorphism:
	 * same method with different behaviors
	 * 1. Static : can be achieved by method overloading
	 * 2. Dynamic: can be achieved by method overriding
	 * 
	 */
	
	public static void main(String[] args) {
		ChildDemo child = new ChildDemo();
		child.dinner(); //10
		child.doExercise();//30 mins
		Parentdemo parent = new Parentdemo();
		parent.dinner(); //7
		parent.doExercise(); //30 mins
		
		System.out.println("Learning Method Overloading");
		MethodOverloadingDemo obj = new MethodOverloadingDemo();
		obj.add(10, 20);
		obj.add(1, 2, 3, 4);
		obj.add(1, 3);
		obj.add(1.5f, 3.4f);
		//obj.add(1.6, 3.5); no method with double data type defined
		obj.add(10.4f, 3);
		
		System.out.println("Learning Dynamic Dispatch");
		//you will not be allowed to call a method
		//which is only present in child class
		
		Parentdemo objParent = new ChildDemo();
		
		//ChildDemo o1 = new Parentdemo();
		
	}
}
