package review_day2;

import java.util.Arrays;
import java.util.Random;

public class ArrayFunc {

	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static int indexValue(int[] arr, int index) {
		return arr[index];
	}

	public static double avg(int[] arr) {
		double avgArr = (double) sum(arr) / arr.length;

		return avgArr;
	}

	public static void minusArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -arr[i];
		}
	}

	public static void descSort(int[] arr) {
		minusArr(arr);
		Arrays.sort(arr);
		minusArr(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void randomArr(int[] arr, int start, int end) {
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(end - start + 1) + start;
		}

	}
}
