package day8;

public class CarMain {

	public static void main(String[] args) {
		Car sonata = new Car("현대", "쏘나타", 2022); // brand(String), model(String), year(int)
		sonata.startEngine(); // 결과 : 현대 쏘나타의 엔진을 시동합니다.
		sonata.showInfo(); // 결과 : 차량 정보 : 2022년식 현대 쏘나타
		
		ElectricCar ioniq = new ElectricCar("현대", "아이오닉5", 2023, 80); // 80은 batteryCapacity(int)
		ioniq.startEngine(); // 결과 : 현대 아이오닉5의 전기 모터를 시동합니다.
		ioniq.showInfo(); // 결과 : 차량 정보 : 2023년식 현대 아이오닉5 (배터리 용량: 77kWh)
		
		int battery = ioniq.getBatteryCapacity();
		System.out.println(battery + "kWh"); // 77kwh
	}

}
