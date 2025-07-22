package day5;

import java.util.Scanner;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong = new Human("홍길동", 30, "인천");
	
		hong.eat();
		System.out.println(hong.name);

		Human kim = new Human("김철수", 25, "서울");
	
		kim.study();
		System.out.println(kim.name);
		
		Human park = new Human("박영희", 20);
		park.eat();
		System.out.println(hong);
		System.out.println(kim);
		Scanner s = new Scanner(System.in);
	}

}
