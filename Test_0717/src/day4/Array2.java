package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. arr1안에 있는 값들의 평균값 구하기
		int arr1[] = {1,5,4,2,10};
		int sum = 0;
		int avr = 0;
		for(int i=0; i<arr1.length; i++) {
			sum += arr1[i];
		}
		avr = sum / arr1.length;
		System.out.println("평균값 : " + avr);
		
		//2. 사용자로부터 값을 5개 입력받아서 순서대로 arr2에 넣기
		int arr2[] = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.println("5개 값을 입력해 주세요");
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = s.nextInt();
			
		}
		System.out.println(Arrays.toString(arr2));
	}
	
}
