package review_day2;

import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4*5 배열에 랜덤한 숫자를 넣으면 좋겠다
		// 랜덤한 숫자의 범위는 10~50 사이면 좋겠다
		// ArrayFunc클래스의 randomArr() 함수를 쓰면 좋겠다
		int arr3[][] = new int[4][5];
		
		for(int i=0; i<arr3.length;i++) {
			ArrayFunc.randomArr(arr3[i], 10, 50);
			System.out.println(Arrays.toString(arr3[i]));
		}
		
	}


}
