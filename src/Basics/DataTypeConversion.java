package Basics;

public class DataTypeConversion {

	/*
	 * Bucket Water Theory
	 * Bucket1 >> 5 L >>
	 * Bucket2 >> 3 L >>
	 * Task: Transfer water from one bucket to anothers
	 * Case1: B1 --> B2
	 * Case2: B2 --> B1
	 */
	
	public static void main(String[] args) {
		int a1 = 45;
		float f1 = 55.50f;
		f1 = a1;
		System.out.println(a1);
		System.out.println(f1);
		//a1 = f1;
		
		int a2 = 45;
		float f2 = 55.87f;
		a2 = (int) f2;
		System.out.println("Data change");
		System.out.println(f2);
		System.out.println(a2);
		
		/*
		 * byte >> short, int, long, float, double
		 * float >> int, double, short
		 */
		
		//char to int
		char c1 = 'a';
		int i3 = c1;
		System.out.println("Character is "+c1);
		System.out.println("Integer value is "+i3);
		
		//int to char
		/*
		 * char a >> ascii 97
		 */
		int i4 = 97;
		char c2 = (char) i4;
		System.out.println("Character is "+c2);
		System.out.println("Integer value is "+i4);
		
		//Integer to string
		int i6 = 345;
		String s2 =Integer.toString(i6);
		System.out.println(s2);
		
		
		//String to integer
		String name = "123";
		int i5 = Integer.parseInt(name);
		System.out.println(i5);
		
		//double to string
		double d1 = 34.55;
		String s12 = Double.toString(d1);
		
		
		
		
		
	}
}
