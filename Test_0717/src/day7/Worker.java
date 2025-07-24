package day7;

public class Worker extends Person {

	Worker() {
		System.out.println("worker 기본생성자");
	}

	Worker(String name, int age, String addr, double height) {
		super(name, age, addr, height);
		System.out.println("worker 매개변수 4개 생성");
	}
}
