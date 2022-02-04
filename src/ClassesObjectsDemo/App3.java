package ClassesObjectsDemo;

public class App3 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.empName = "Umar";
		e1.companyName = "Infosys";
		
		System.out.println(e1.empName);
		System.out.println(e1.companyName);
		
		Employee e2 = new Employee();
		e2.empName = "Mayuri";
		
		////////
		e2.companyName = "Wipro";
		
		System.out.println(e2.empName); //
		System.out.println(e2.companyName); //w
		System.out.println(e1.companyName); //w
		
		
	}
}
