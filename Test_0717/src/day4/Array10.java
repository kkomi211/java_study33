package day4;

import java.util.Arrays;

public class Array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 배열에 있는 수를 모두 절대값(음수 -> 양수)으로 바꾸쇼.
		int arr[] = {3,5,-15,10,-8};
		for(int i=0; i<arr.length; i++) {
//			arr[i] = arr[i]<0 ? -arr[i] : arr[i];
//			System.out.println(Arrays.toString(arr));
			
			arr[i] = Math.abs(arr[i]);
		
		
		
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
