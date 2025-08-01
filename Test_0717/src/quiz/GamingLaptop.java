package quiz;

public class GamingLaptop extends Laptop{
	String grap;
	
	GamingLaptop(String brand, double weight, String grap){
		super(brand, weight);
		this.grap = grap;
	}
	
	@Override
	void printSpecs() {
		System.out.println(getBrand() + " 브랜드의 " + getWeight() + "kg " + grap + " 게이밍 노트북");
	}
}
