package day5;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc = new Calculator();
		calc.intro();
		int num = calc.returnNumber();
		System.out.println(num);
		System.out.println(calc.sum(723,104));
		
		int max = calc.max(5, 8);
		
		System.out.println(max);
		
		int arrrr[] = {3,5,1,4,2};
		int arrSum = calc.arrSum(arrrr);
		
		calc.intro2("홍길동", 30, 170.9);
		System.out.println(arrSum);
	}

}
