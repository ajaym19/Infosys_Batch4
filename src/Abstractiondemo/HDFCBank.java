package Abstractiondemo;

public class HDFCBank implements RBI{

	@Override
	public void depositMoney() {
		System.out.println("Depositing Money");

	}

	@Override
	public void withdrawMoney() {
		System.out.println("Withdrawing Money");

	}
	
	public void homeLoan() {
		System.out.println("Give Home Loan");
	}
}
