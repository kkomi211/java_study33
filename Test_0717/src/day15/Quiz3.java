package day15;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열을 입력받아서 문자열 빈도 찾기
		// 대소문자 구분없이 같이 카운팅
		// 결과 : s : 1, h : 2, o : 2
		Scanner s = new Scanner(System.in);
		System.out.print("문자를 입력해 보세요 : ");
		String words = s.nextLine();
		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < words.length(); i++) {

			String word = Character.toString(words.charAt(i));
			word = word.toLowerCase();
			if (word.equals(" "))
				continue;

			if (map.get(word) != null) {
				int value = map.get(word) + 1;
				map.put(word, value);
			} else {
				map.put(word, 1);
			}
		}
		int size = 0;
		for (String key : map.keySet()) {
			System.out.print("[" + key + " : " + map.get(key) + "]");
			size++;
			if (map.size() > size) {
				System.out.print(", ");
			}
		}
	}

}
