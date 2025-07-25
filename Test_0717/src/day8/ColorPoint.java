package day8;

public class ColorPoint extends Point {

	private String color;

	ColorPoint() {
		this(0, 0, "BLACK");
	}

	ColorPoint(int x, int y) {
		this(x, y, "BLACK");
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	void setXY(int x, int y) {
		move(x, y);
	}

	void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		String str = color + "색의 (" + getX() + "," + getY() + ")의 점";

		return str;
	}

	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색 점
		System.out.println(zeroPoint.toString() + "입니다.");
		ColorPoint cp = new ColorPoint(10, 10); // (10,10) 위치의 BLACK 색 점
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}
}
