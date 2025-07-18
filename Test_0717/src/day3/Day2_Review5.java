package day3;

import java.util.Scanner;

public class Day2_Review5 {

	public static void main(String[] args) {
		
//		// 1. 숫자를 하나 입력바당서 홀수면 홀수 짝수면 짝수 출력
//		Scanner s = new Scanner(System.in);
//		System.out.print("수 입력 : ");
//		int num = s.nextInt();
//		
//		if(num % 2 == 0)
//			System.out.println("짝수");
//		else
//			System.out.println("홀수");
//		
		// 2. 숫자를 5번 입력받아서 해당 숫자들의 합을 출력
		Scanner s1 = new Scanner(System.in);
		int sum = 0;
		for(int i=1; i<=5; i++) {
			System.out.print(i + "번째 수 입력 : ");
			int num1 = s1.nextInt();
			sum += num1;
		}
		System.out.println("합 : " + sum);
		
		// 3. 숫자를 5번 입력받아서 입력받은 수 중에서 가장 큰 수만 출력
		Scanner s2 = new Scanner(System.in);
		int max = 0;
		for(int i=1; i<=5; i++) {
			System.out.print(i + "번째 수 입력 : ");
			int num1 = s2.nextInt();
			if(i == 1)
				max = num1;
			if(max < num1)
				max = num1;
		}
		System.out.println("가장 큰 수 : " + max);
		
		
	}

}
