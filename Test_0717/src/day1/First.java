package day1;

public class First {
	public static void main(String[] args) {
		// 문자열 표현 => String
		// 숫자(정수-소수점x) => int, 단 21억이 넘는 숫자는 long
		// 숫자(실수-소수점o) => double
		// 참 or 거짓 => boolean
		
		String name = "홍길동";
		int age = 30;
		double height = 170.5;
		boolean married = false;
		
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + (age + 5));
		
		System.out.println(name + "의 나이는 " + age + ", 키는 " + height + " 입니다.");
		
	}// main
}// first