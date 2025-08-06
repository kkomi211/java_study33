package day15;

import java.util.Random;
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		
		System.out.println("구구단 문제 나가요");
		while (true) {
			int score = 0;
			for(int i=0; i<5; i++) {
				int x = ran.nextInt(8)+2;
				int y = ran.nextInt(9)+1;
				System.out.print(x + " * " + y + " = ");
				int ans = s.nextInt();
				if(ans == (x*y)) {
					System.out.println("정답!");
					score++;
				}else
					System.out.println("오답!");
			}
			if(score>=3) {
				System.out.println(score + " 문제 맞추셨어요 수고요");
				break;
			}else
				System.out.println(score + " 문제 맞춰서 함더 ㄱ");
		}
		
		
		
	}

}
