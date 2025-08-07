package day16;

import java.util.Arrays;
import java.util.Random;

public class ArrayManager {
	public static int arrdiff(int[] arr) {
		

		Arrays.sort(arr);

		return arr[arr.length-1] - arr[0];
	}
	
	public static int[] ranarr() {
		int arr[] = new int[5];
		Random ran = new Random();
		for(int i=0; i<5; i++) {
			arr[i] = ran.nextInt(31) - 15;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[] = ranarr();
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arrdiff(arr));
	}
}
