package day4;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. arr 배열에서 가장 큰 값 찾기
		int[] arr = {1,5,10,25,3};
		int max = 0;
//		
//		for (int i=0; i<arr.length; i++) {
//			if(max < arr[i] || i == 0) {
//				max = arr[i];
//		 	}
//		}
//		System.out.println("가장 큰 값 : " + max);
		
		// 2. arr 배열에서 가장 큰 값의 위치(index) 찾기
		int maxIndex = 0;
		for (int i=0; i<arr.length; i++) {
			if(arr[i] > arr[maxIndex])
				maxIndex = i;
		}
		System.out.println("위치 : " + (maxIndex+1) + "번째");
		
	}

}
