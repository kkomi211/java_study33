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
		int max = 100;
		int min = 1;
		while(true) {
			System.out.print("숫자 입력 : ");
			int ans = s.nextInt();
			if(ans >= max || ans <= min) {
				System.out.println(min + "부터 " + max + "까지의 수를 입력해 주세요.");
				continue;
			}
			count++;
				
			if(x > ans) {
				System.out.println("Up");
				min = ans + 1;
			}
			else if(x < ans) {
				System.out.println("Down");
				max = ans - 1;
			}
	
			else{
				System.out.println("정답입니다!");
				break;
			}
		}
		
		System.out.println(count + "번 만에 맞췄어요");
	}

}
