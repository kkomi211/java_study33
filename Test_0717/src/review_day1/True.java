package review_day1;

import java.util.Random;
import java.util.Scanner;

public class True {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner s = new Scanner(System.in);

		// 메뉴 1을 선택하면 랜덤 구구단 3문제
		// 2를 선택하면 업앤다운 게임
		// 1~2외의 값을 선택하면 종료
		while (true) {
			System.out.println("1을 선택하면 랜덤 구구단, 2를 선택하면 업앤 다운, 나머지는 종료!");
			int choice = s.nextInt();
			if (choice == 1) {
				int count = 0;
				System.out.println("랜덤 구구단 게임!");
				for (int i = 1; i <= 3; i++) {
					int x = ran.nextInt(8) + 2;
					int y = ran.nextInt(9) + 1;
					System.out.print(x + " * " + y + " = ");
					int ans = s.nextInt();

					if (ans == (x * y)) {
						System.out.println("정답!");
						count++;
					} else {
						System.out.println("오답!");
					}
				}
				System.out.println("총 " + count + "문제 맞추셨습니다.");
			}
			else if (choice == 2) {
				int x = ran.nextInt(30) + 1;
				int count = 0;
				while(true) {
					System.out.print("1~30까지의 수를 입력해 보세요! ");
					int ans = s.nextInt();
					count++;
					if(x == ans) {
						System.out.println("정답입니다! " + count + "번만에 맞추셨습니다");
						break;
					}
					else if(x < ans) {
						System.out.println("down");
					}
					else {
						System.out.println("up");
					}
					
				}
			
			}
			else {
				System.out.println("시스템을 종료합니다");
				break;
			}

		}

	}

}
