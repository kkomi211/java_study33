package day12;

public class TV implements PowerControl{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV 전원 켜짐");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV 전원 꺼짐");
	}

}
