package quiz;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		System.out.print("원하는 구구단을 입력해보아용 ㅎ :");
		int num = s.nextInt();

		for (int i = 9; i >= 1; i--) {
			System.out.println(num + "*" + i + "=" + (num * i));
		}
	}

}
