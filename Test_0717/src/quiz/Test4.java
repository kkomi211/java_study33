package quiz;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2; i<=9;i++) {
			for(int j=1; j<=9; j++) {
				if(i == 5 || i == 8)
					break;
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
	}

}
