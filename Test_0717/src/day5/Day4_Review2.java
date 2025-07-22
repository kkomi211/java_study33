package day5;

public class Day4_Review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,2,4,1};
		// 가장 작은 값의 위치 찾기(index)
		int a = 0;
		int min = 0;
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i] || i == 0) {
				min = arr[i];
				a = i;
			}
		}
		System.out.println("가장 작은값 위치 : " + a);

		int temp = arr[0];
		arr[0] = arr[a];
		arr[a] = temp;
	}

}
