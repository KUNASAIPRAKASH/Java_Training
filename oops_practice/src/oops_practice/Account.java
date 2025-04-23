package oops_practice;

public abstract class Account {

	protected String holderName;
	protected double balance;

	public Account(String holderName, double balance) {
		super();
		this.holderName = holderName;
		this.balance = balance;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public abstract void withdraw(double amount);

}
