
package InheritanceDemo;

public class App {

	public static void main(String[] args) {
		Students obj = new Students();
		obj.lunch();
		obj.learn();
		
		Teachers t1 = new Teachers();
		t1.lunch();
		
		Admin a1 = new Admin();
		a1.lunch();
	}
}
