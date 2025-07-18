package day3;

import java.util.Scanner;

public class Loop_For4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 9단 => 2단
		// 구구단 역순으로 출력
		Scanner s = new Scanner(System.in);
		System.out.print("구구단을 원하면 1, 별쌓기를 원하면 2를 입력하세요 :");
		int choose = s.nextInt();
		
		if(choose == 1) {
			for(int i=9; i>=2; i--) {
				System.out.println("====== " + i + "단 ======");
				for(int j=9; j>=1; j--) {
					System.out.println(i + " * " + j + " = " + (i*j));
				}
			System.out.println();
			}
		}
		
		// 숫자를 하나 입력받아서 해당 숫자만큼 늘어나는 별찍기
		else if(choose == 2) {
			System.out.print("몇 줄로 별을 쌓을까요? ");
			int star = s.nextInt();
			for(int i=1; i<=star; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else
			System.out.println("잘못입력하여 프로그램 종료");
	}

}
