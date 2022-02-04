package Abstractiondemo;

public class App {

	public static void main(String[] args) {
		//RBI a = new RBI();
		
		//you cannot create an object of Interface
		
		HDFCBank hdfc = new HDFCBank();
		hdfc.depositMoney();
		hdfc.homeLoan();
		
		ICICIBank ic = new ICICIBank();
		ic.depositMoney();
		
		Bike bike = new Bike();
		bike.refillFuel();
		bike.seatingArrangement();
		
		
	}
}
