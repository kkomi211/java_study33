package day7;

public class Person {
	String name;
	int age;
	String addr;
	double height;
	String gender;
	
	Person(){
		System.out.println("Person 클래스 기본 생성자 호출");
	}
	// 5개의 값을 모두 받아서 초기화 하는 생성자
	Person(String name, int age, String addr, double height, String gender){
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.height = height;
		this.gender = gender;
	}
	
	// gender(성별)을 제외한 4개의 값을 받아서 초기화 하는 생성자
	Person(String name, int age, String addr, double height){
		this(name, age, addr, height, "");
	}
	
	void eat() {
		System.out.println(name + "이(가) 밥을 먹는다");
	}
	
	void speak() {
		System.out.println(name + "이(가) 말을 한다.");
	}
}
