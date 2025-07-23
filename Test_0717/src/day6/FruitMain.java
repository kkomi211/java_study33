package day6;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit banana = new Fruit("바나나", 1000);

		banana.setPrice(999999);
		
		int price = banana.getPrice();
		System.out.println(price);
		
		
		
	}

}
