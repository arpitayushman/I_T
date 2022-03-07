package twentyFiveFeb;

public abstract class Account  implements Bank {
	private int acntNo;
	private String holder;
	protected double balance;
	private static int autogen = INIT_ACNT_NO;
	public Account() {
	}

	public Account(int acntNo, String holder, double balance) {
		this.acntNo = acntNo;
		this.holder = holder;
		this.balance = balance;
	}
	public void summary() {
		System.out.println("Acount number: "+ acntNo);
		System.out.println("Acount Holder: "+ holder);
		System.out.println("Acount Balance: "+ balance);
	}
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		balance -= amount;
	}
}
