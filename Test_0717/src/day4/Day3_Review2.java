package day4;

import java.util.Random;
import java.util.Scanner;

public class Day3_Review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		int num = ran.nextInt(10)+1;
		int i = 0;
		for(;;) {
			System.out.print("숫자 입력 : ");
			int input = s.nextInt();
			i++;
			// 사용자가 입력한 숫자보다 랜덤 숫자가 더 크면 'up'
			// 작으면 'down'
			// 같으면 'oo번만에 맞추셨습니다.'
			if(num > input)
				System.out.println("up");
			else if (num < input)
				System.out.println("down");
			else {
				System.out.println(i + "번만에 맞추셨습니다.");
				break;
			}
		}
	}

}
