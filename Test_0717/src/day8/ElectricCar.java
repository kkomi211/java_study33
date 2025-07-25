package day8;

public class ElectricCar extends Car{

	private int batteryCapacity;
	
	ElectricCar(String brand, String model, int year, int batteryCapacity) {
		super(brand, model, year);
		this.batteryCapacity = batteryCapacity;
	}
	
	@Override
	void startEngine() {
		System.out.println(getBrand() + " " + getModel() + "의 전기 모터를 시동합니다.");
	}
	
	@Override
	void showInfo() {
		System.out.println("차량 정보 : " + getYear() + "년식 " + getBrand() + " " + getModel() + " (배터리 용량: " + batteryCapacity + "kWh)");
	}
	
	int getBatteryCapacity() {
		return batteryCapacity;
	}
	
}
