package day3;

public class Loop_For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 중첩 for문
		for(int i=2; i<10; i++) {
			System.out.println("====== " + i + "단 ======");
			for(int j=1; j<10; j++) {
				 System.out.println(i + " * " + j + " = " + (i*j));
			}
			System.out.println();
		}
	}

}
