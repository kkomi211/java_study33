package day16;

import java.util.HashMap;
import java.util.Random;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int arr[] = new int[20];

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < 20; i++) {
			arr[i] = ran.nextInt(10) + 1;
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}

		}
		
		for(int key : map.keySet()) {
			if(map.get(key) >= 3) {
				System.out.println(key + " => " + map.get(key) + "개");
			}
		}

	}

}
