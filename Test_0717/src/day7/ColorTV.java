package day7;

public class ColorTV extends TV {

	private int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
		// TODO Auto-generated constructor stub
	}
	
	int getColor() {
		return color;
	}

	void printProperty() {
		System.out.println(getSize() + "인치 " + color + "컬러");
	}

}
