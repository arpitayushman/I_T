package twentyFiveFeb;

public interface Bank {
	int INIT_ACNT_NO = 101001;
	double MIN_SAVINGS_BAL = 1000;
	double INIT_CURRENT_BAL = 0;
	double MIN_CURRENT_BAL = 0;
	double OVERDRAFT_LIMIT = 10000;
	
//	..application interface
	
	void deposite(double amount);
	void withdraw(double amount);
	void summary();
	
}
