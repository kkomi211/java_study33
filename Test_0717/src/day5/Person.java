package day5;

public class Person {
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person(){}
	
	@Override
	public String toString() {
		return "이름은 " + name + ", 나이는 " + age;
	}
}
