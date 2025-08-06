package day15;

import java.util.HashMap;
import java.util.Set;

public class MapKeySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Object> scoreMap = new HashMap<>();
		scoreMap.put("java", 95);
		scoreMap.put("oracle", 90);
		scoreMap.put("html", 93);
		scoreMap.put("name", "홍길동");

		Set<String> keys = scoreMap.keySet();
		for(String key : keys) {
			System.out.println(key);
			System.out.println(scoreMap.get(key));
		}
	
	}

}
