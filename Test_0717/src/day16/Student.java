package day16;

public class Student extends Human {

	int stuNo;

	// 해당 클래스는 Human클래스를 상속받는 클래스
	// 1. name, age, gender, height, stuNo를 받아서 초기화 해주는 생성자 만들기
	// 2. name, age, height, stuNo를 받아서 초기화 해주는 생성자 만들기
	// 3. 코드가 오류가 발생하지 않도록 작성하기
	// 기타. 메소드의 구현이 필요할 경우 메소드 내용이나 문구는 자유롭게 할 것
	public Student(String name, int age, String gender, double height, int stuNo) {
		super(name, age, height, gender);
		this.stuNo = stuNo;
	}

	Student(String name, int age, double height, int stuNo) {
		super(name, age, height);
		this.stuNo = stuNo;
	}

	public void introduce() {
		System.out.println("제 학번은 " + stuNo + "입니다");
	}

	public static void main(String[] args) {
		Student kim = new Student("김철수", 24, "남", 180.5, 20258348);
		
		kim.introduce();
	}
}
