package day5;

public class Day4_Review3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,1,4,2};
		
		// 가장 작은 값 찾기
		
		int min = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min || i == 0)
				min = arr[i];
		}
		
		System.out.println("가장 작은 값 : " + min);
	}

}
