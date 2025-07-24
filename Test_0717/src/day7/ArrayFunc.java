package day7;

public class ArrayFunc {

	static int maxArr(int[] arr) {
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	static double avgArr(int[] arr) {
		double sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		return sum / arr.length;
	}
	
	static int[] oddArr(int[] arr) {
		int testArr[] = new int[arr.length];
		int j = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 != 0) {
				testArr[j++] = arr[i];
			}
		}
		int oddArr[] = new int[j];
		for(int i=0; i<j; i++) {
			oddArr[i] = testArr[i];
		}
		return oddArr;
		
		
//		int odd = 0;
//		
//		for(int value : arr) {
//			if(value % 2 == 1)
//				odd++;
//		}
//		
//		int oddArr[] = new int[odd];
//		int j = 0;
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i] % 2 == 1) {
//				oddArr[j++] = arr[i];
//			}
//		}
//		
//		return oddArr;
	}
	
	// ArrayFunc 클래스 안에 bigNumArr 메소드 만들기
	// 배열에서 8이상의 숫자만 따로 떼서 리턴해주는 bigNumArr 메소드 구현
	static int[] bigNumArr(int[] arr) {
		int over = 0;
		
		for(int value : arr) {
			if(value >= 8) {
				over++;
			}
		}
		
		int bigNumArr[] = new int[over];
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= 8) {
				bigNumArr[count++] = arr[i];
			}
		}
		return bigNumArr;
	}
	
	
}
