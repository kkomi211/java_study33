package review_day3;

public class Book_Test {
	String title;
	String author;
	int price;

	Book_Test() {
		title = "제목 없음";
		author = "저자 미상";
		price = 0;
	};

	Book_Test(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	void bookInfo() {
		System.out.println("책 제목: " + title + ", 저자: " + author + ", 가격: " + price + "원");
	}
	
	void setInfo(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void discount(int price) {
		
		if(this.price - price < 0) {
			System.out.println("할인 금액이 너무 큽니다. 가격은 0으로 설정됩니다.");
			this.price = 0;
		} else {
			this.price -= price;
		}
			
	}
	
	int getPrice() {
		return price;
	}
}
