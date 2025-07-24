package day7;

public class FruitMain {

	public static void fruitBoxing(Fruit fruit, int num) {
		System.out.println(fruit.name + "를 " + num + "개 포장했습니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Apple apple = new Apple("사과", 1000);
		fruitBoxing(apple, 3);

		Orange orange = new Orange("오렌지", 1500);
		fruitBoxing(orange, 5);

		Banana banana = new Banana("바나나", 500);
		fruitBoxing(banana, 10);

		Fruit goldenApple = new Apple("황금사과", 20000);
		Fruit jejuOrange = new Orange("제주오렌지", 5000);
		Fruit goldenbanana = banana;

		fruitBoxing(goldenbanana, 3);
		fruitBoxing(apple, 8);

	}

}
