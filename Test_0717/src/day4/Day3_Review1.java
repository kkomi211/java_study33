package day4;

import java.util.Scanner;

public class Day3_Review1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
//		int i=1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
//		

		Scanner s = new Scanner(System.in);
		int count = 0;
		while(true) {
			System.out.print("양의 정수를 입력해주세요 : ");
			int sum = s.nextInt();
			if(sum <= 0) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			count++;
			if(count >= 5)
				break;
		}
	}

}
