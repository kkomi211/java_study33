package day2;

import java.util.Scanner;

public class Loop_For4 {
	public static void main(String[] args) {
		// 숫자를 하나 입력받아서 해당 숫자의 구구단을 출력
		
		Scanner s = new Scanner(System.in);
		System.out.print("원하는 구구단 숫자 입력하세요 : ");
		int dan = s.nextInt();
		
		for(int i=9; i>0; i--) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		
		
	}
}
