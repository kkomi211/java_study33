package day4;

import java.util.Arrays;

public class Array11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열에 있는 값들을 절대 값(음수=>양수)을 기준으로
		// 가장 큰 숫자 찾기
		// 정답은 15
		int arr[] = {3,5,-15,10,-8};
		int max=0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = Math.abs(arr[i]);
			max = arr[i]>max ? arr[i]:max;
			
//			max = Math.max(max, i);
		}
		
		System.out.println("가장 큰 절대값 : " + max);
		
	}

}
