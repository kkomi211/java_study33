package quiz;

public class Laptop extends Computer {
	
	private double weight;
	
	Laptop (String brand, double weight){
		super(brand);
		this.weight = weight;
	}
	
	void printSpecs() {
		System.out.println(getBrand() + " 브랜드의 " + weight + "kg 노트북");
	}
	
	double getWeight() {
		return weight;
	}
}
