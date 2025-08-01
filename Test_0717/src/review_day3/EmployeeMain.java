package review_day3;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee kim = new Employee(1001, "김철수");
		Employee park = new Employee(2002, "박영희", "인사부");
		
		kim.setDetails(3000000, "대리");
		kim.getSalary();
		park.empInfo();
	}

}
