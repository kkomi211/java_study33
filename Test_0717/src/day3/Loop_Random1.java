package day3;

import java.util.Random;
import java.util.Scanner;

public class Loop_Random1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x = ran.nextInt(10); // 0~9
//		int y = ran.nextInt(10) + 1; // 1~10
		
		// 랜덤한 구구단 문제를 출제
		// 맞췄을 때 점수를 준다거나, 맞춘 개수를 판단 한다거나

		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		int x = ran.nextInt(8) + 2;
		int y = ran.nextInt(9) + 1;
		System.out.println("랜덤 구구단 문제 풀이");
		System.out.print(x + " * " + y + " = ");
		
		int ans = x * y;
		int user_ans = s.nextInt();
		
		if(ans == user_ans)
			System.out.println("정답입니다");
		else
			System.out.println("오답입니다.");
	}

}
