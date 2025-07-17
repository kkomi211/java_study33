package day2;

import java.util.Scanner;

public class IF_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 학년과 점수는 사용자로부터 입력을 받는다.
		// 1~3학년은 점수가 60점 이상이면 합격
		// 4~6학년은 점수가 80점 이상이면 합격
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("학년 입력 : ");
		int grade = s.nextInt();
		System.out.print("점수 입력 : ");
		int score = s.nextInt();

		if(grade >= 1 && grade <= 3) {
			if(score >= 60 && score <= 100) 
				System.out.println("합격!");
			else if (score >= 0 && score < 60)
				System.out.println("불합격!");
			else
				System.out.println("입력이 잘못되었습니다.");
		} // 1~3학년
		
		else if(grade >= 4 && grade <= 6) {
			if(score >= 80 && score <= 100) 
				System.out.println("합격!");
			else if(score >= 0 && score < 80)
				System.out.println("불합격!");
			else
				System.out.println("입력이 잘못되었습니다.");
		} // 4~6학년
		
		else System.out.println("입력이 잘못되었습니다."); 
		
	}

}
