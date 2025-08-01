package review_day3;

public class Employee {
	private int empId;
	private String empName;
	private String department;
	private int salary;
	private String position;
	
	public Employee (int empId, String empName, String department) {
		this.empId = empId;
		this.empName = empName;
		this.department = department;
	}
	
	public Employee (int empId, String empName) {
		this(empId, empName, "");
	}
	
	public void setDetails(int salary, String position) {
		this.salary = salary;
		this.position = position;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void empInfo() {
		System.out.println(empName + " 사원의 사번은 " + empId + ", 직급은 " + position + ", 급여는 " + salary + "원 입니다.");
	}
	
	
}
