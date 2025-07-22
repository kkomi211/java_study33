package day5;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong = new Human();
		hong.name = "홍길동";
		hong.age = 30;
		hong.addr = "서울";
		hong.eat();
		hong.study();
		
		System.out.println(hong.name);
		Human kim = new Human();
		kim.name = "김철수";
		kim.age = 5;
		kim.addr = "제주";
		System.out.println(kim.name);
		
	}

}
