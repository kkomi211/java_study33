package day1;

public class Var2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10;
		System.out.println((double) number);
		//더 큰 개념(double)에서 더 작은 개념(int)로 바꾸는 경우 데이터 소실 발생
		//10.5 -> 10 소수점 자리의 데이터 소실 발생
		double number2 = 10.5;
		System.out.println((int) number2);
	}

}
