package quiz;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("1~ 10까지 수 중 하나를 입력하세요: ");
		int num = s.nextInt();

		if (num <= 0 || num > 10)
			System.out.println("계산할 수 없습니다");
		else if (num % 2 == 0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
	}

}
