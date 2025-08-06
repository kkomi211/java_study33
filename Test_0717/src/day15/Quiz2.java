package day15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		HashMap<Integer, Integer> map = new HashMap<>();

		int arr[] = new int[20];
		String many = "";
		int howmany = 0;
		for (int i = 0; i < arr.length; i++) {
			int num = ran.nextInt(10) + 1;
			arr[i] = num;

			if (map.containsKey(num)) {
				int value = map.get(num);
				map.put(num, value + 1);
			} else {
				map.put(num, 1);
			}
		}
		System.out.println(Arrays.toString(arr));

		for (int num : map.keySet()) {

			if (map.get(num) > howmany) {
				howmany = map.get(num);
				many = "" + num;
			} else if (map.get(num) == howmany) {
				many = many + ", " + num;
			}
			System.out.println(num + "은 " + map.get(num) + " 개");

		}

		System.out.println("가장 많은 수 : " + many + "\n 개수 : " + howmany);
	}

}
