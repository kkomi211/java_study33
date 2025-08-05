package day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Review_ListMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// map 하나만 가지고 관리를 하게 되면
		// map 하나당 사람 한명만 관리가 가능
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.print((i+1) + "번째 사람의 이름을 입력하세요 : ");
			String name = s.next();
			map.put("name", name);
			System.out.print((i+1) + "번째 사람의 나이를 입력하세요 : ");
			int age = s.nextInt();
			map.put("age", age);
			list.add(map);
		}
		
		System.out.println(list);
		for(int i=0; i<list.size(); i++) {
			HashMap<String, Object> user = list.get(i);
			System.out.println(user.get("name"));
		}
		
		
	}

}
