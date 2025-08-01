package day12;

public class FoodMain {
	
	public static void foodBoxing(Food f) {
		System.out.println(f.name + "를 포장했습니다.");
		int takeOutPrice = 0;
		
		if(f instanceof Pizza) {
			takeOutPrice = 3000;
		} else if(f instanceof Burger) {
			takeOutPrice = 2000;
		} else if(f instanceof Salad){
			takeOutPrice = 1000;
		}
		
		System.out.println(f.name + "는 포장비 "+ takeOutPrice + "원 입니다.");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pizza pizza = new Pizza("불고기 피자");
		System.out.println(pizza);
		
//		Food f = pizza;
//		foodBoxing(pizza);
//		
//		Burger burger = new Burger("햄부기");
//		foodBoxing(burger);
//		
//		Salad salad = new Salad("샐러드");
//		foodBoxing(salad);
		
		
	}

}
