package oops_practice;

public class WithdrawTransaction implements Transaction {

	private Account account;
	private double amount;

	public WithdrawTransaction(Account account, double amount) {
		super();
		this.account = account;
		this.amount = amount;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		account.withdraw(amount);
	}

}
