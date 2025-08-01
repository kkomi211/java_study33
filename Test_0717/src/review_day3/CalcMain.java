package review_day3;

public class CalcMain {

	public static int max(int x, int y) {
		return x > y ? x : y;
	}

	public static double max(double x, double y) {
		return x > y ? x : y;
	}

	public static int max(int x, int y, int z) {
		int max = x > y ? x : y;
		return max > z ? max : z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		max(1,2);
		max(1.5,3.5);
		max(1,3,2);
		int arr[] = {1,5,3,2,4};
		
	}
}
