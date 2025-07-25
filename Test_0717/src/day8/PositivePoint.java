package day8;

public class PositivePoint extends Point {

	public PositivePoint() {
		super(0, 0);
	}

	PositivePoint(int x, int y) {
		super(0, 0);
		if (x < 0) {
			x = 0;
		}
		if (y < 0) {
			y = 0;
		}
		super.move(x, y);
	}

	@Override
	protected void move(int x, int y) {
		if (x >= 0 && y >= 0) {
			super.move(x, y);
		}

	}
	
	@Override
	public String toString() {
		String str = "(" + getX() + "," + getY() + ") 의 점";

		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		p.move(-5, 5); // 객체 p는 음수 공간으로 이동되지 않음
		System.out.println(p.toString() + "입니다.");
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");
	}

}
