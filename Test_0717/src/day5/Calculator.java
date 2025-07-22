package day5;

public class Calculator {

	void intro() {
		System.out.println("계산기 입니다!");
	}

	int returnNumber() {

		return 10;
	}

	int sum(int x , int y) {
		return x + y;
	}
	
	int sum() {
		return 0;
	}
	
	int max(int x, int y) {
		if(x>=y) return x;
		else return y;
	}

}
