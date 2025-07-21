package day4;

import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 숫자에 맞게 별쌓기
		
		int arr[] = {2,4,5,3,1};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	
	
	
	}

}
