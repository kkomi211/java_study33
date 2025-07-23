package day6;

import java.util.Arrays;

public class BubbleSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 5, 1, 4, 2, 3, 4, 2, 4, 56, 6, 1, 23, 7546 };

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

			System.out.println(Arrays.toString(arr));
		}
	}

}
