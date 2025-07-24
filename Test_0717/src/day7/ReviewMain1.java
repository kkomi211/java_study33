package day7;

public class ReviewMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit_Review1 apple = new Fruit_Review1("사과", 1000);
		
		System.out.println(apple.getPrice());
		
		apple.setPrice(0);
		System.out.println(apple.getPrice());
	}

}
