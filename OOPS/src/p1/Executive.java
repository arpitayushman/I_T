package p1;

public class Executive extends Employee {
	private double incentive;

	public Executive() {
	}

	public Executive(String empName, double salary, double incentive) {
		super(empName, salary);
		this.incentive = incentive;
	}

	@Override
	public void payslip() {
		super.payslip();
		System.out.println("Incentive " + incentive);
	}

	@Override
	public double getSalary() {
		return super.getSalary() + incentive;
	}

}
