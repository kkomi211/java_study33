package day3;

import java.util.Scanner;

public class Loop_For1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2. 숫자를 5번 입력받아서 해당 숫자들의 합을 출력
		// 조건 1. 음수가 들어오면 숫자 다시 입력
		// 조건 2. 0을 입력하면 더이상 입력받지 않고 종료
		Scanner s1 = new Scanner(System.in);
		int sum = 0;
		for(int i=1; i<=5; i++) {
			System.out.print(i + "번째 수 입력 : ");
			int num1 = s1.nextInt();
			if(num1 < 0) {
				System.out.println("음수 ㄴ");
				i--;
				continue;
			}
			else if(num1 == 0) {
				break;
			}
			sum += num1;
		}
		System.out.println("합 : " + sum);
	}
}
