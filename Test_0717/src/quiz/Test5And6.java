package quiz;

public class Test5And6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 7, 10, 6, 15, 2 };

		// 5번문제
		int sum = 0, avr;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		avr = sum / arr.length;

		System.out.println("배열의 합 : " + sum);
		System.out.println("배열의 평균 : " + avr);

		// 6번문제
		int maxIndex = 0;
		for (int i = 1; i < arr.length; i++) 
			maxIndex = arr[i] > arr[maxIndex] ? i : maxIndex;
		

		System.out.println("가장 큰 값의 위치 : " + maxIndex);

	}

}
