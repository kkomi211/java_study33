package day3;

import java.util.Scanner;

public class Day2_Review3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int num1 = s.nextInt();

		if(num1 >= 90 && num1 <= 100)
			System.out.println("A 학점");
		else if(num1 >= 80)
			System.out.println("B 학점");
		else if(num1 >= 70)
			System.out.println("C 학점");
		else if(num1 >= 60)
			System.out.println("D 학점");
		else if(num1 >= 0)
			System.out.println("F 학점");
		else
			System.out.println("입력 다시 ㄱ");
	
	
	}

}
