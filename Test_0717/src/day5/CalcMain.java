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
	}

}
