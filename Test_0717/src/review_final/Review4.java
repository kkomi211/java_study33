package review_final;

import day16.Student;

public class Review4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = { "java", "oracle", "html", "javascript", "jsp" };
		// 가장 길이가 긴 문자 출력
		
		String max = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i].length() > max.length()) {
				max = arr[i];
			}
		}
		
		System.out.println(max);
		
		Student stuArr[] = new Student[5];
		stuArr[0] = new Student("홍길동", 30, "인천", 1234, 14);
		
		
	}

}
