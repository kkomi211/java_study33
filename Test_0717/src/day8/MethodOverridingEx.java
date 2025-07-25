package day8;

public class MethodOverridingEx {
	static void paint(Shape p) {
		p.draw(); // p가 가리키는 객체 내에 오버라이딩된 draw() 호출.
		// 동적 바인딩
	}

	public static void main(String[] args) {
		Shape start, last, obj;
		// 링크드 리스트로 도형 생성하여 연결
		start = new Line(); // Line 객체 연결
		last = start;
		
		System.out.println(last);
		obj = new Rect();
		last.next = obj; // Rect 객체 연결
		last = obj;
		System.out.println(last);
		obj = new Line(); // Line 객체 연결
		last.next = obj;
		last = obj;
		System.out.println(last);
		obj = new Circle(); // Circle 객체 연결
		last.next = obj;
		System.out.println(last);
		// 모든 도형 출력
		Shape p = start;
		while (p != null) {
			p.draw();
			p = p.next;
		}
	}
}
