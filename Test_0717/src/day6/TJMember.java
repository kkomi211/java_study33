package day6;

public class TJMember {
	String name;
	int age;
	String stuNo;
	int money; //개인돈
	static int classMoney; //회비
	
	TJMember(String name, int age, String stuNo, int money){
		this.name = name;
		this.age = age;
		this.stuNo = stuNo;
		this.money = money;
	}
	
	static void test() {
		System.out.println("static 테스트");
	}
}
