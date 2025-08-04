package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MapEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.print("이름 : ");
			String name = s.next();
			map.put("name", name);
			System.out.print("나이 : ");
			int age = s.nextInt();
			map.put("age", age);
			System.out.print("주소 : ");
			String addr = s.next();
			map.put("addr", addr);
			list.add(map);
		}
		System.out.println(list);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).get("name"));
		}
		
		System.out.print("검색할 사람 입력 : ");
		String name = s.next();
		
		for(int i=0; i<list.size(); i++) {
			if(name.equals(list.get(i).get("name"))) {
				System.out.println("찾았다!");
			}
		}
	
	}

}
