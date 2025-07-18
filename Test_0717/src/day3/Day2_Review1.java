package day3;

public class Day2_Review1 {

	public static void main(String[] args) {
		
		// 연산자
		int num1 = 10;
		// num1에 3을 더해서 다시 저장해라
		num1 = num1 + 3;
		// num1 += 3;
		
		// > < ==
		
		int num2 = 5;
		int num3 = 10;
		// 비교연산자
		System.out.println(num2 > num3);
		System.out.println(num2 < 10);
		System.out.println(num2 >= 5);
		System.out.println(num3 <= 10);
		System.out.println(num2 == num3);
		System.out.println(num2 != num3);
		
		// 논리연산자 and &&, or ||
		System.out.println(num2 > num3 || num2 > 3);
		System.out.println(num2 > num3 && num2 > 3);
		
		
		
		
		
	}

}
