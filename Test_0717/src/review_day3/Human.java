package review_day3;

public class Human {
	// 필드 영역
	String name;
	int age;
	String addr;
	int money;

	// 생성자
	public Human(String name, int age, String addr, int money) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.money = money;
		System.out.println(name + "객체 생성!");
	}
	
	public Human(String name, int money) {
		this(name ,0, "", money);
	}
	
	public Human(String name, int age, String addr) {
		this(name, age, addr, 0);
	}

	// 메소드 영역
	public void eat() {
		System.out.println("밥을 먹는다.");
	}

	public void sleep() {
		System.out.println("잔다.");
	}
}
