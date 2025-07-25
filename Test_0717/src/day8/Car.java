package day8;

public class Car {
	private String brand, model;
	private int year;
	
	Car(String brand, String model, int year){
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	void startEngine() {
		System.out.println(brand + " " + model + "의 엔진을 시동합니다.");
	}
	
	void showInfo() {
		System.out.println("차량 정보 : " + year + "년식 " + brand + " " + model);
	}
	
}
