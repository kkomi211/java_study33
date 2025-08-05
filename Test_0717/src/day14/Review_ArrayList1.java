package day14;

import java.util.ArrayList;
import java.util.Random;

public class Review_ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();

		// list에 랜덤한 숫자 5개를 넣기
		// 랜덤 숫자의 범위는 1~30, 중복은 일단 상관 x

		Random ran = new Random();
		for (int i = 0; i < 5; i++) {
			list.add(ran.nextInt(30) + 1);
		}

		System.out.println(list);

	}

}
