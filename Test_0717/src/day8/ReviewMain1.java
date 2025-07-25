package day8;

public class ReviewMain1 {
	
	static void varParameter(int age, String name) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	static void objParameter(Animal_Review animal) {
		System.out.println("이름 : " + animal.getName());
	}

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Animal_Review cat = new Animal_Review("고양이", 3);
//		cat.eat();
//		cat.speak();
////		cat.walk();
//		
//		Dog_Review dog = new Dog_Review("강아지", 5, "푸들");
//		dog.eat();
//		dog.speak();
//		dog.walk();
		
		int a = 20;
		String b = "홍길동";
		
		varParameter(a, b);
		
		Animal_Review cat = new Animal_Review("고양이", 3);
		objParameter(cat);
		
		Dog_Review dog = new Dog_Review("강아지", 5, "푸들");
		objParameter(dog);
		
	}

}
