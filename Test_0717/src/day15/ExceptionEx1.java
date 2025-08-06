package day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("숫자 입력 1 : ");
				int num1 = s.nextInt();
				System.out.print("숫자 입력 2 : ");
				int num2 = s.nextInt();
				System.out.println(num1 / num2);

			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌수 없음");
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해라");
				s.nextLine();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("예상못한 에러가 발생했음");
			}
		}

	}

}
