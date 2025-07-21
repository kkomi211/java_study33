package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 사용자로부터 숫자 5개를 입력받아서 배열에 저장
		// 단, 0이하의 숫자를 입력할 경우 다시 입력하도록
		// Arrays.toString(arr)
		int arr[] = new int[5];
		
		Scanner s = new Scanner(System.in);
		System.out.println("1 이상의 정수를 입력하세요");
		int i=0;
		while(true) {
			if(i==5)
				break;
			System.out.print((i+1) + "번째 수 : ");
			arr[i] = s.nextInt();
			
			if(arr[i] < 1) {
				System.out.println("잘못된 입력입니다");
				continue;
			}
			i++;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
