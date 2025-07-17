package day2;

public class Loop_For3 {

	public static void main(String[] args) {
		
		// 1부터 100까지 홀수들의 합을 출력
		int oddSum = 0;
//		for(int i=1; i<=100; i+=2) {
//			oddSum += i;
//		}
		for(int i=1; i<=100; i++) {
			if(i % 2 == 1)
				oddSum += i;
		}
		
		System.out.println("합은 : " + oddSum);
		
	}

}
