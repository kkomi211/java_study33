package day3;

import java.util.Random;
import java.util.Scanner;

public class Random_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		System.out.print("원하는 문제수를 입력해 주세요 : ");
		int test = s.nextInt();
		System.out.println(test + "문제 풀이를 시작합니다. 정답에 0을 입력하면 종료됩니다.");
		int count = 0;
		int i;
		for(i=1; i<=test; i++) {
			int x = ran.nextInt(8) + 2;
			int y = ran.nextInt(9) + 1;
			
			System.out.print(i + "번 : " + x + " * " + y + " = ");
			int ans = s.nextInt();
			if(ans == 0) {
				System.out.println("0을 입력하여 종료됩니다..");
				break;
			}
			else if(ans == (x*y)) {
				System.out.println("정답 입니다.");
				count++;
			}
			else
				System.out.println("틀렸습니다!");
		}
		System.out.println("총 " + (i-1) + "문제 중 " + count + "문제를 맞추셨습니다.");
	}

}
