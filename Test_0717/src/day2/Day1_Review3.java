package day2;

public class Day1_Review3 {

	public static void main(String[] args) {
		
		int num1 =  5;
		num1++; // 6
		++num1; // 7
		System.out.println(num1);
		
		
		// 후위연산자 (++, -- 뒤에 붙었을 때)
		// 본인의 값(num2)을 먼저 num3에 넣고 그다음 본인의 값(num2)을 1 증가
		int num2 = 3;
		int num3 = num2++; // num2 = 4, num3 = 3
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		
		// 선위연산자 (++, -- 앞에 붙었을 때)
		// 본인의 값(num4)을 먼저 1 증가시키고 num5에 값을 넣음
		int num4 = 3;
		int num5 = ++num4; // num4 = 4, num5 = 4
		System.out.println("num4 : " + num4);
		System.out.println("num5 : " + num5);
		
	}

}
