package day6;

public class Car_Test {
	private String name;
	private String color;
	private int speed;
	
	Car_Test(String name, String color, int speed){
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	Car_Test(){
		this("기본차", "하얀색", 0);
	}
	
	void carInfo(){
		System.out.println("자동차의 이름은 " + name + ", 색상은 " + color + " 입니다.");
	}
	
	void setInfo(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed; 
	}
	
	void speedUp(int speed) {
		if((this.speed + speed) > 200) {
			System.out.println("200 이상의 속도는 불가합니다. 200으로 변경됩니다.");
			this.speed = 200;
		}
		
		else {
			this.speed += speed;
		}
	}
	
	void speedDown(int speed) {
		if((this.speed - speed) < 0) {
			System.out.println("0 미만의 속도는 불가합니다. 0으로 변경됩니다.");
			this.speed = 0;
		}
		
		else {
			this.speed -= speed;
		}
	}
	
	int getSpeed() {
		return speed;
	}
}
