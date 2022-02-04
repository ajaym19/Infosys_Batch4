package Abstractiondemo;

public class ICICIBank implements RBI {

	@Override
	public void depositMoney() {
		System.out.println("Depositing Money");

	}

	@Override
	public void withdrawMoney() {
		System.out.println("Withdrawing Money");
	}

}
