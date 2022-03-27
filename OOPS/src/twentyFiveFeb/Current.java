package twentyFiveFeb;

public class Current extends Account {
	private double overdraft;
	public Current() {
	}
	
	public Current(int acntNo, String holder) {
		super(acntNo, holder, 5000);
		overdraft = 1000;
		
	}
	@Override
	public void summary() {
		super.summary();
		System.out.println("Overdraft: "+ overdraft);
	}
	
	public void deposit(double amount) {
		overdraft += amount;
		if(overdraft > 10000) {
			balance += (overdraft - 10000);
		}
	}
	public void withdraw(double amount) {
		if(amount <= (balance + overdraft)) {
			balance -= amount;
			if(balance < 0) {
				overdraft += balance;
				balance = 0;
			}
		}else {
			System.out.println("Insufficient Balance");
		}
	} 
}
