package day2;

import java.util.Scanner;

public class Switch_1 {

	public static void main(String[] args) {
		// 1~6사이 값을 입력받아 입력한 수 + "학년 입니다."로 출력
		Scanner s = new Scanner(System.in);
		
		System.out.print("학년을 입력하세요 : ");
		int num = s.nextInt();
		s.close();
		
		
		switch (num) {
			case 1:	
				System.out.println("1학년은 30점 이상 합격");
				break;
			case 2:		
				System.out.println("2학년은 40점 이상 합격");
				break;
			case 3:		
				System.out.println("3학년은 50점 이상 합격");
				break;
			case 4:		
				System.out.println("4학년은 60점 이상 합격");
				break;
			case 5:		
				System.out.println("5학년은 70점 이상 합격");
				break;
			case 6:		
				System.out.println("6학년은 80점 이상 합격");
			default:
				System.out.println("잘못 입력함");
		}
	}

}
