package day2;

import java.util.Scanner;

public class Loop_For2 {

	public static void main(String[] args) {
		//1~10 합을 구하시오
		
//		int sum = 0;
//		
//		for(int i=1; i<=10; i++) {
//			sum += i;
//		}
//		System.out.println("합 : " + sum);
		
		// 수를 1개 입력받아서
		// 1부터 입력받은 숫자까지 모두 더하기
		// ex) 20을 입력하면 1~20까지의 합 출력
		Scanner s = new Scanner(System.in);
		System.out.print("수 입력 ㄱ : ");
		int num = s.nextInt();
		s.close();
		
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");
	}

}
