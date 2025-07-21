package day4;

import java.util.Scanner;

public class Array9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"자바","오라클","html/css","js","jsp"};
		// 스캐너로 입력받아서 해당과목이 있으면 있다 출력, 없으면 없다 출력
		System.out.print("과목 입력 : ");
		Scanner s = new Scanner(System.in);
		String subject = s.next();
		boolean flg = false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals(subject)) {
				flg = true;
				break;
			}
		}
		
		String result = flg ? "있다" : "없다";
		System.out.println(result);
		
		
		
//		if(!flg) {
//			System.out.println("없다.");
//		}
//		else {
//			System.out.println("있다.");
//		}
		
	}

}
