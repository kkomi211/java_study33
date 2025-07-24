package day7;

import java.util.Arrays;

public class ReviewMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit_Review1 orange = new Fruit_Review1("오렌지", 1000);
		Fruit_Review1 jejuOrange = new Fruit_Review1("제주 오렌지", 1200);
		
		System.out.println(orange.getPrice());
		jejuOrange.setPrice(2000);
		System.out.println(orange.getPrice());
		
		int arr[] = {1,3,2,4,5};
		int arr2[] = new int[arr.length];
		arr2[2] = 9999;
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length; i++) {
			arr2[i] = arr[i];
		}
		arr[2] = 2403;
		
		System.out.println(Arrays.toString(arr2));
		
	}

}
