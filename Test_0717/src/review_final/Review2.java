package review_final;

public class Review2 {
	public static void main(String[] args) {
		int a = 10, b = 5;
		String str = "홍길동";
		String str2 = new String("홍길동");
		System.out.println(a>b && str.equals("홍길동"));
		System.out.println(a<b || str.equals(str2));
	}
}
