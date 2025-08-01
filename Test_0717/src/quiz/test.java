package quiz;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EBook defaultEBook = new EBook();  // 제목과 저자 Unknown, 파일 크기 0.0
	    defaultEBook.printInfo();

	    EBook ebook = new EBook("재밌는 오라클", "김철수", 4.5);
	    ebook.setFileSize(6.0);
	    ebook.printInfo();
	}

}
