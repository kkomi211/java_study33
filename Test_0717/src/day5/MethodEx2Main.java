package day5;

import java.util.Random;

public class MethodEx2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodEx2 m = new MethodEx2();
		
		System.out.println(m.sum(1,2.5));
		System.out.println(m.sum(2.5,3));
		System.out.println(m.sum(1,2,4));
		
		Random ran = new Random();
		ran.nextInt();
		
		m.sum();
	}

}
