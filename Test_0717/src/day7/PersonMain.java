package day7;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person hong = new Person("홍길동", 30, "인천", 170.1, "남");
		hong.eat();
		
		Student kim = new Student("김철수", 20, "서울", 175, 202058108);
		kim.eat();
		kim.study();
		
		Worker park = new Worker("박영희", 4, "제주", 182);
	}

}
