package day6;

import java.util.Arrays;

public class ValueAndRefMain {

	public static void main(String[] args) {
		
		ValueAndRef v = new ValueAndRef();
		int x = 10;
		v.valueTest(x);
		System.out.println(x);
		
		x = v.valueTest2(x);
		System.out.println(x);
		
		int arr[] = {1,2,3,4,5};
		v.refTest(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr); //[I@49097b5d
	}

}
