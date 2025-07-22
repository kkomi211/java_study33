package quiz;

import java.util.Arrays;
import java.util.Random;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];

		Random ran = new Random();

		for (int i = 0; i < 5; i++) {
			arr[i] = ran.nextInt(30) + 1;
			if (arr[i] % 2 == 0)
				i--;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}