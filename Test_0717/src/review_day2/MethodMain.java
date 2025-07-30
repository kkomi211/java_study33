package review_day2;

import java.util.Arrays;
import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("달팽이 크기 입력 : ");
		int n = s.nextInt();

		int arr[][] = new int[n][n];
		int right = -1, bottom = 0;
		int print = n;
		int k = 1;
		int top = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < print; j++) {
				right += top;
				arr[bottom][right] = k++;
			}
			
			print--;
			
			for(int j=0; j<print; j++) {
				bottom += top;
				arr[bottom][right] = k++;
			}
			
			top *= -1;
		}
		
		
		
		for(int i=0; i< n; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}
