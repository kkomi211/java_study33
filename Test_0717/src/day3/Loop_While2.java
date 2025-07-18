package day3;

import java.util.Random;
import java.util.Scanner;

public class Loop_While2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 랜덤 구구단 문제 출력
		// 사용자가 5문제를 맞추면 "5문제를 맞추셨습니다" 출력하고 종료
		
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		int count = 0;
		System.out.println("랜덤 구구단 문제 풀이(0을 누르면 종료됩니다.)");

		while(true) {
			int x = ran.nextInt(8) + 2;
			int y = ran.nextInt(9) + 1;
			
			System.out.print(x + " * " + y + " = ");
			int ans = s.nextInt();
			
			if(ans == (x*y)) {
				System.out.println("정답!");
				count++;
			}else if(ans == 0)
				break;
			else
				System.out.println("오답!");
			
			if(count == 5) 
				break;
		}
		
		System.out.println(count + "문제를 맞추셨습니다.");
		
	}

}
