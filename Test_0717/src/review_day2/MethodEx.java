package review_day2;

public class MethodEx {
	public static String testA() {
		String name = "홍길동";
		return name;
	}

	public static void testB() {
		System.out.println("void라서 리턴 안됨 출력하고 끝");
	}

	public static int testC(int num) {
		return num * 2;
	}

	public static double testD(double num1, double num2) {
		return num1 * num2;
	}
}
