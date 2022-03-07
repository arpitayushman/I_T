package p1;

public class Employee {
	private int empNo;
	private String empName;
	private double salary;
	static int kk = 1001;
	public Employee() {
	}
	public Employee(String empName, double salary) {
		this.empNo = kk++;
		this.empName = empName;
		this.salary = salary;
	}
	public void payslip() {
		System.out.println("Emp No:" + empNo );
		System.out.println("Emp Name:" + empName );
		System.out.println("Emp Salary:" + salary );
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
