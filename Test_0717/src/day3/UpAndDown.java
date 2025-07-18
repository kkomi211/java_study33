package day3;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Up & Down Game Start");
		int x = ran.nextInt(100) + 1;
		int count = 0;
		while(true) {
			System.out.print("숫자 입력 : ");
			int ans = s.nextInt();
			if(ans > 100 || ans < 0) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요");
				continue;
			}
			count++;
			if(x > ans)
				System.out.println("Up");
			else if(x < ans)
				System.out.println("Down");
			else{
				System.out.println("정답입니다!");
				break;
			}
		}
		
		System.out.println(count + "번 만에 맞췄어요");
	}

}
