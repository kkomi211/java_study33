package day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test7 {

	public static void getSetPoint(HashMap<String, Object> map, String pm) {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.print(pm + "할 포인트 : ");
			int point = s.nextInt();
			if (point < 0) {
				System.out.println("음수는 불가능 합니다. 다시 입력해주세요.");
				continue;
			}
			
			
			if (pm.equals("적립")) {
				map.put("point", point);
			} else {
				if ((int) map.get("point") - point < 0) {
					System.out.println("차감할 수 있는 포인트는 " + map.get("point") + " 입니다");
					continue;
				}
				map.put("point", (int)map.get("point") - point);
			}
			
			System.out.println(map.get("name") + "님의 포인트가 " + point + "만큼 " + pm + "되었습니다.");
			break;
		}
	}

	public static int findPeople(ArrayList<HashMap<String, Object>> list, String name) {
		int find = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).get("name").equals(name)) {
				find = i;
			}
		}

		return find;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		System.out.println("======= 포인트 관리 프로그램 =======");
		while (true) {
			System.out.print("[ (1)사용자 등록 (2)포인트 적립 (3)포인트 차감 (4)포인트 확인 (5)종료 ] : ");
			int menu = s.nextInt();
			if (menu == 1) {
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("이름 : ");
				String name = s.next();
				int find = findPeople(list, name);
				if (find != -1) {
					System.out.println("이미 등록된 사용자입니다");
					continue;
				}
				map.put("name", name);
				System.out.print("나이 : ");
				int age = s.nextInt();
				map.put("age", age);
				list.add(map);
				System.out.println(name + "님이 등록되었습니다.");
			} else if (menu == 2) {
				System.out.print("포인트 적립할 사용자 이름 : ");
				String name = s.next();
				int find = findPeople(list, name);
				if (find == -1) {
					System.out.println("해당 사용자가 존재하지 않습니다.");
					continue;
				}
				getSetPoint(list.get(find), "적립");

			} else if (menu == 3) {
				System.out.print("포인트 차감할 사용자 이름 : ");
				String name = s.next();

				int find = findPeople(list, name);
				if (find == -1) {
					System.out.println("해당 사용자가 존재하지 않습니다.");
					continue;
				}

				getSetPoint(list.get(find), "차감");
			} else if (menu == 4) {
				System.out.print("포인트 확인할 사용자 이름 : ");
				String name = s.next();
				int find = findPeople(list, name);
				if (find == -1) {
					System.out.println("해당 사용자가 존재하지 않습니다.");
					continue;
				}
				System.out
						.println(list.get(find).get("name") + "님의 현재 포인트는 " + list.get(find).get("point") + "포인트 입니다.");
			} else if (menu == 5) {
				System.out.println("종료되었습니다");
				break;
			} else {
				System.out.println("1~5 사이의 수를 입력해주세요");
			}

		}
	}

}
