package day12;

public class ArrayFunc {
	
	static int[] concat(int[] arr1, int[] arr2) {
		int length = arr1.length + arr2.length;

		int arr3[] = new int[length];
		int i = 0, j = 0;
		for (; i < arr3.length; i++) {
			if (i < arr1.length)
				arr3[i] = arr1[i];
			else 
				arr3[i] = arr2[j++];
			
		}

		return arr3;
	}
}
