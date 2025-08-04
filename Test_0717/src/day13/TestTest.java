package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TestTest {
	
	public static int scoreFunc(String subject, int max) {
		Scanner s = new Scanner(System.in);
		int score = 0;
		while(true) {
			System.out.print(subject + " >> ");
			score = s.nextInt();
			if(score < 0 || score > max) {
				System.out.println(subject + "의 범위는 0부터 " + max + "까지 입니다.");
			} else {
				break;
			}
		}
		
		return score;
	}

	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> testscore = new ArrayList<>();
		Scanner s = new Scanner(System.in);

		System.out.println("======= 성적관리 시스템 =======");

		System.out.print("인원수 입력 : ");
		int human = s.nextInt();
		int sum;
		for (int i = 0; i < human; i++) {
			HashMap<String, Object> student = new HashMap<>();
			sum = 0;
			System.out.print("이름 >> ");
			String name = s.next();
			student.put("name", name);
			
			student.put("java",scoreFunc("자바", 40));
			student.put("oracle",scoreFunc("오라클", 35));
			student.put("html",scoreFunc("html", 25));
			
			System.out.println("--------------------------------------------------");
		}
		
		for(int i=0; i<human; i++) {
			sum = (int)testscore.get(i).get("java") + (int)testscore.get(i).get("oracle") + (int)testscore.get(i).get("html");
			System.out.println("이름 : " + testscore.get(i).get("name") + ", 총점 : " + sum);
		}

	}

}
