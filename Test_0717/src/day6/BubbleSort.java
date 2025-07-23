package day6;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 4, 5, 7, 1, 3 };
		for (int j = 1; j < arr.length; j++) {
			for (int i = 0; i < arr.length - j; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}

			System.out.println(Arrays.toString(arr));
		}
	}

}
