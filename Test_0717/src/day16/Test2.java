package day16;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		while (true) {
			System.out.print("몇문제 푸실건가요 ? ");
			int test = s.nextInt();
			if (test < 3 || test > 10) {
				System.out.println("3 ~ 10 문제만 가능합니다");
				continue;
			}
			int score = 0;
			for (int i = 0; i < test; i++) {
				int x = ran.nextInt(8) + 2;
				int y = ran.nextInt(9) + 1;
				System.out.print(x + " * " + y + " = ");
				int ans = s.nextInt();
				if(ans == (x*y)) {
					System.out.println("정답 입니다");
					score++;
				}else {
					System.out.println("오답 입니다");
				
				}
				
				
			}
			if(score > (test-score)) {
				System.out.println("통과 입니다");
				break;
			}else {
				System.out.println("재도전 하시겠습니까?");
				String reset = s.next();
				if (reset.equals("네")) {
					continue;
				}else
					break;
			}
		}
	}
}
