package day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz {


	public static void changescore(int num, HashMap<String, Object> map) {
		Scanner s = new Scanner(System.in);
		if (num == 1) {
			map.remove("국어");
			System.out.print("새로운 점수를 입력하세요 : ");
			int score = s.nextInt();
			map.put("국어", score);
			System.out.println("점수가 수정되었습니다.");
		} else if (num == 2) {
			map.remove("영어");
			System.out.print("새로운 점수를 입력하세요 : ");
			int score = s.nextInt();
			map.put("영어", score);
			System.out.println("점수가 수정되었습니다.");
		} else if (num == 3) {
			map.remove("수학");
			System.out.print("새로운 점수를 입력하세요 : ");
			int score = s.nextInt();
			map.put("수학", score);
			System.out.println("점수가 수정되었습니다.");
		} else {
			System.out.println("잘못된 과목 번호입니다.");
			System.out.println();
		}

	}
	
	public static void inputscore(String name, HashMap<String, Object> map) {
		Scanner s = new Scanner(System.in);
		System.out.print(name + " 점수 : ");
		int score = s.nextInt();
		map.put(name, score);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		while (true) {
			System.out.print("[ (1) 추가 (2) 확인 (3) 점수수정 (4) 종료 ] : ");
			int menu = s.nextInt();
			if (menu == 1) {
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("이름 : ");
				String name = s.next();
				map.put("name", name);
				inputscore("국어", map);
				inputscore("영어", map);
				inputscore("수학", map);
				list.add(map);
				System.out.println("---------------------------------------");
			} else if (menu == 2) {
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> map = list.get(i);
					double avr = (double) ((int) map.get("국어") + (int) map.get("영어") + (int) map.get("수학")) / 3;
					map.put("평균", avr);
					avr = Math.round(avr * 100) / 100.0;
					System.out.println((i + 1) + ". 이름 : " + map.get("name"));
					System.out.println("   국어 : " + map.get("국어") + ", 영어 : " + map.get("영어") + ", 수학 : " + map.get("수학")
							+ ", 평균 : " + avr);

				}
				System.out.println("---------------------------------------");
			} else if (menu == 3) {
				int check = -1;
				System.out.print("점수를 수정할 학생의 이름을 입력해주세요 :");
				String name = s.next();
				for (int i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).get("name"))) {
						check = i;
						break;
					}
				}
				if(check == -1) {
					System.out.println("존재하지 않는 학생입니다.");
					System.out.println("---------------------------------------");
					continue;
				}
				System.out.print("수정할 과목을 선택하세요 (1. 국어 2. 영어 3. 수학) : ");
				int num = s.nextInt();
				changescore(num, list.get(check));
				System.out.println("---------------------------------------");

			} else if (menu == 4) {
				System.out.println("시스템 종료됩니다.");
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}

		}
	}

}
