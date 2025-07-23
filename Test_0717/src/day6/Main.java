package day6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//// 백준 10989번 문제
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int arr[] = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = s.nextInt();
		}

//		Arrays.sort(arr);

		for (int j = 0; j < num - 1; j++) {
			int minIndex = j;

			for (int i = 1; i < num; i++) {
				if (arr[minIndex] > arr[i]) {
					minIndex = i;
				}
				System.out.println(arr[minIndex]);
			}
		}

	}
}
