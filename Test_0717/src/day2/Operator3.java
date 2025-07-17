package day2;

public class Operator3 {

	public static void main(String[] args) {
		
		// 논리 연산자
		// not, or, and, nor
		// or(||) => 둘중 하나라도 만족하면 true
		// and(&&) => 둘다 만족하면 true
		System.out.println((true || true));
		System.out.println((true || false));
		System.out.println((false || false));
		
		int num1 = 5;
		int num2 = 10;
		System.out.println(num1 > 8 || num2 > 8);
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(num1 > 8 && num2 > 8);
		
		
	}

}
