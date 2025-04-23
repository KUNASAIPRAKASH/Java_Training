package oops_practice;

public class TransactionProcessor {

	private Transaction transaction;

	public TransactionProcessor(Transaction transaction) {
		super();
		this.transaction = transaction;
	}
	
	public void process() {
		transaction.execute();
	}

	
}

