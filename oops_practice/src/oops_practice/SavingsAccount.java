package oops_practice;

public class SavingsAccount extends Account{

	public SavingsAccount(String holderName, double balance) {
		super(holderName, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount<=balance) {
			balance-=amount;
			System.out.println(amount+"withdrwan.");
		}else {
			System.out.println("Insufficient balcnce");
		}
	}

}
