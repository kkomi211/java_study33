package day5;

public class MethodEx2 {
	
	// 동일한 메서드 여러개 쓰는거 : 오버로딩
	int sum(int x, int y) {
		return x + y;
	}
	public MethodEx2() {
		
	}
	
	double sum(double x, double y) {
		return x+y;
	}
	
	double sum(double x, int y) {
		return x+y;
	}
	
	int sum(int x, int y, int z) {
		return x+y+z;
	}
	
	void sum() {
		System.out.println("입력 안했음");
	}
}
