package day12;

import java.util.Scanner;

public class SubStr {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String word = s.nextLine();
		for (int i = 0; i < word.length(); i++) {
			char first = word.charAt(0);
			word = word.substring(1);
			word = word + first;
			
			System.out.println(word);
		}

	}
}
