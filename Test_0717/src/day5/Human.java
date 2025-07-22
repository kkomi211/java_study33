package day5;

public class Human {
	String name;
	int age;
	String addr;
	
	Human(String name, int age, String addr){
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void eat() {
		System.out.println(name + "(이)가 밥을 먹는다!");
	}
	
	void study() {
		System.out.println(name + "(이)가 공부 한다!");
	}
	
	
	

}
