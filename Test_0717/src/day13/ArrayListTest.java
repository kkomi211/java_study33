package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		while (true) {
			System.out.print("[ (1) 추가 (2) 확인 (3) 삭제 (4) 종료 ] : ");
			int user = s.nextInt();

			if (user == 1) {
				System.out.print("이름 : ");
				String name = s.next();
				System.out.print("나이 : ");
				int age = s.nextInt();
				System.out.print("주소 : ");
				String addr = s.next();
				System.out.println("---------------------");
				HashMap<String, Object> map = new HashMap<>();
				map.put("name", name);
				map.put("age", age);
				map.put("addr", addr);
				list.add(map);
			} else if (user == 2) {
				System.out.println("---------------------");
				for (int i = 0; i < list.size(); i++) {
					System.out.println((i + 1) + ". 이름 : " + list.get(i).get("name") + ", 나이 : " + list.get(i).get("age")
							+ ", 주소 : " + list.get(i).get("addr"));
				}
				System.out.println("---------------------");
			} else if (user == 3) {
				System.out.println("---------------------");
				System.out.print("삭제할 사용자의 이름을 입력해주세요 : ");
				String name = s.next();
				boolean flg = false;
				for (int i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).get("name"))) {
						list.remove(i);
						i--;
						System.out.println("삭제되었습니다.");
						flg = true;
					}
				}
				if (!flg) {
					System.out.println("해당 이름을 가진 사용자가 존재하지 않습니다.");
				}
				System.out.println("---------------------");
			} else if (user == 4) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("1~4중에 선택해 주세요.");
			}

		}
	}

}
