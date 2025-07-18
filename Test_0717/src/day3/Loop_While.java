package day3;

import java.util.Scanner;

public class Loop_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int i = 0;
//		while(i<10) {
//			System.out.println(i);
//			i++;
//		}
		
		Scanner s = new Scanner(System.in);
		// 1부터 사용자가 입력한 숫자까지 합을 구하기
		System.out.print("숫자 입력하세요 : ");
		int num = s.nextInt();
		int i = 1;
		int sum = 0;
		
		while(i <= num) {
			sum += i;
			i++;
		}
		System.out.println("1부터 " + num + "까지의 합 : " + sum);
		
		
		
		// 구구단짜기
		int j = 2;
		while(j <= 9) {
			int k = 1;
			System.out.println("====== " + j + "단 ======");
			while(k <= 9) {
				System.out.println(j + " * " + k + " = " + (j*k));
				k++;
			}
			System.out.println();
			j++;
		}
	}

}
