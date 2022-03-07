package p1;

public class Account {
	private int actNo;
	private String holder;
	private double balance;
	public Account(int actNo, String holder, double balance) {
		this.actNo = actNo;
		this.holder = holder;
		this.balance = balance;
	}
	public void summary() {
		System.out.println("A/C No: "+ actNo );
		System.out.println("Holder: "+ holder );
		System.out.println("Balance: "+ balance );
	}
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		if(amount<=balance)balance -= amount;
		else System.out.println("Insufficient Balance");
	}
	
}	
