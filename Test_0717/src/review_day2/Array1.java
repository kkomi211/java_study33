package review_day2;

import java.util.Arrays;
import java.util.Random;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 공간은 10개
		// random 숫자범위 1~30
		Random ran = new Random();
		int arr[] = new int[10];
		int odd = 0, even = 0, j = 0, k = 0;
		int arrodd[] = new int[arr.length];
		int arreven[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(30) + 1;
			if (arr[i] % 2 == 0) {
				arrodd[j] = arr[i];
				even++;
				j++;
			} else {
				arreven[k] = arr[i];
				odd++;
				k++;
			}
		}
		System.out.println("arr = " + Arrays.toString(arr));

		// 홀수배열
		// 짝수배열 구분해서 따로 저장
		// oddArr
		// evenArr
		int oddArr[] = new int[odd];
		int evenArr[] = new int[even];
		for (int i = 0; i < oddArr.length; i++) {
			oddArr[i] = arrodd[i];
		}
		for (int i = 0; i < evenArr.length; i++) {
			evenArr[i] = arreven[i];
		}

		System.out.println("evenArr = " + Arrays.toString(evenArr));
		System.out.println("oddArr = " + Arrays.toString(oddArr));

	}

}
