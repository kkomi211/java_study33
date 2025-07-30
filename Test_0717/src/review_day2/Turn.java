package review_day2;

import java.util.Arrays;
import java.util.Scanner;

public class Turn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("수 암거나 입력하세요");
		int n = s.nextInt();

		int arr[][] = new int[n][n];
		int k = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = k++;
			}
			System.out.println(Arrays.toString(arr[i]));
		}

		int arrturn[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arrturn[j][n - 1 - i] = arr[i][j];
			}
		}

		for (int i = 0; i < n; i++) {
			
				System.out.println(Arrays.toString(arrturn[i]));
			
		}
	}

}
