package day5;

import java.util.Arrays;

public class SelectionSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,1,4,2};
		// 11111111111111
		
//		int minIndex = 0;
//		
//		for(int i=1; i<arr.length; i++) {
//			if(arr[i] < arr[minIndex]) {
//				minIndex = i;
//				min = arr[i];
//			}
//		}
//		int temp = arr[0];
//		arr[0] = arr[minIndex];
//		arr[minIndex] = temp;
//		System.out.println(Arrays.toString(arr));
		
		//222222222222
//		minIndex = 1;
//		
//		for(int i=2; i<arr.length; i++) {
//			if(arr[i] < arr[minIndex]) {
//				minIndex = i;
//			}
//		}
//		temp = arr[1];
//		arr[1] = arr[minIndex];
//		arr[minIndex] = temp;
//		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			int minIndex = i;
			
			for(int j=i; i<arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			System.out.println(Arrays.toString(arr));
		}
	}

}
