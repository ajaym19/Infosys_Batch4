package Basics;

public class DataTypeDemo {

	public static void main(String[] args) {
		/*
		 * Data Type: what kind of data you want to store in that variable
		 * 
		 * 1. Primitive(8):
		 * 	byte, short, int, long >> 4, 45, 101
		 * 	float, double >> 34.55, 87.66
		 * 	char >> a, %, &, 3
		 * 	boolean >> yes/no
		 * 
		 * 2. Non Primitive:
		 * 
		 */
		
		String emp_name = "Mamatha";
		
		
		byte b1 = 32; //-128 to 127
		System.out.println(b1);
		
		short s1 = 232;
		System.out.println(s1);
		
		int i1 = 34354;
		System.out.println(i1);
		
		double d1 = 45.5567;
		System.out.println(d1);
		
		//double  by default
		float f1 = 65.33f;
		System.out.println(f1);
		
		//character
		//for char use single quotes
		//for string use double quotes
		
		char c3 = 'X';
		System.out.println(c3);
		
//		boolean b3 = False;
		boolean b3 = false;
		//boolean b4 = 1;
		//boolean b5 = 0;
		System.out.println(b3);
		
		
	}
}
