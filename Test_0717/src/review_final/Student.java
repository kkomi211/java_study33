package review_final;

public class Student extends Person {
	int stuNo;

	public Student(String name, int age, double height, int stuNo) {
		super(name, age, height);
		this.stuNo = stuNo;
	}

	public void study() {
		System.out.println("공부 중");
	}

	@Override
	public void eat() {
		System.out.println("학식을 먹는다.");

	}

	@Override
	public boolean equals(Object obj) {
		Student stu = (Student) obj;
		if (this.getName() == stu.getName() && this.getAge() == stu.getAge() && this.getHeight() == stu.getHeight()) {
			return true;
		}

		return false;
	}
}
