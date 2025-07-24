package day7;

public class IPTV extends ColorTV{

	String addr;
	
	IPTV(String addr, int size, int color){
		super(size,color);
		this.addr = addr;
	}
	
	@Override
	void printProperty() {
		System.out.print("나의 IPTV는 " + addr + " 주소의 ");
		super.printProperty();
	}

}
