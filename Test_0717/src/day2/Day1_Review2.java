package day2;

public class Day1_Review2 {

	public static void main(String[] args) {

		// 문자 + 숫자 => 문자
		String name = "홍길동";
		int age = 30;
		
		System.out.println(name + age);
		System.out.println(age + 5);
		System.out.println(name + age + 5);
		System.out.println(name + (age + 5));
	
		// 정수 + 정수 => 정수
		// 정수 + 실수 => 실수
		int num1 = 10;
		int num2 = 4;
		
		System.out.println(num1 / num2);
		System.out.println((double)num1 / num2);
		double num3 = 4.0;
		System.out.println(num1 / num3);
		
		int num4 = 10;
		System.out.println(num4 % 2);
		System.out.println(num4 % 3);
		System.out.println(num4 % 4);
		
		
		
	}

}
