package quiz;

import java.util.Random;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		int score = 0;
		int nodab = 0;

		System.out.println("******* 랜덤 구구단 문제 *******");
		while (true) {
			System.out.println("======== 메뉴 선택 ========");
			System.out.print("[ (1)문제풀이 (2)현재스코어 (3)종료 ] : ");
			int choice = s.nextInt();
			if (choice == 1) {
				System.out.println("문제풀이를 선택하셨습니다. 정답에 0을 입력하면 메뉴로 이동합니다.");
				while (true) {
					int x = ran.nextInt(8) + 2;
					int y = ran.nextInt(9) + 1;
					int ans = x * y;
					System.out.print(x + " * " + y + " = ");
					int input = s.nextInt();
					if (input == 0) {
						System.out.println("0을 입력하셨으므로 메뉴로 이동합니다.");
						break;
					} else if (input == ans) {
						System.out.println("정답입니다 !");
						score++;
					} else {
						System.out.println("오답입니다 ! 정답은 " + ans + " 입니다.");
						nodab++;
					}

				}
			} // 1번 선택 문제풀이

			else if (choice == 2) {
				System.out.println("현재까지 맞춘 정답 개수 : " + score);
				System.out.println("현재까지 틀린 정답 개수 : " + nodab);
			} // 2번 선택 현재스코어

			else if (choice == 3) {
				System.out.println("종료되었습니다.");
				break;
			} else
				System.out.println("1~3중에 선택해주세요.");

		}
	}

}
