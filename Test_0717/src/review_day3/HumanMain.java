package review_day3;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		hong.name = "홍길동";
//		hong.eat();
//		hong.money = 100000;
//		
//		kim.name = "김철수";
//		System.out.println(kim.money);
		Human hong = new Human("홍길동", 30, "인천", 20000);
		System.out.println(hong.name);
		Human kim = new Human("김철수", 25, "서울", 1503020);
		
		Human park = new Human("박영희", 20000);
		Human yu = new Human("유재석", 40, "제주도");
	}

}
