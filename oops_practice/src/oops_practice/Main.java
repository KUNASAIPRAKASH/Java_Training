package oops_practice;

public class Main {

	
	public static void main(String[] args) {
		Account acc=new SavingsAccount("prakash", 1000);
		Transaction transaction=new WithdrawTransaction(acc, 100);
		TransactionProcessor processor=new TransactionProcessor(transaction);
		
		System.out.println("Account Holder: "+acc.holderName);
		System.out.println("Balance: "+acc.balance);
		
		processor.process();
		
		System.out.println(acc.balance);
	}
}
