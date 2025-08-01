package quiz;

public class EBook extends Book{
	
	private double filesize;
	
	EBook(){
		this("Unknown", "Unknown", 0);
	}
	
	EBook(String title, String author, double filesize){
		super(title, author);
		this.filesize = filesize;
	}
	
	void setFileSize(double filesize) {
		this.filesize = filesize;
	}
	
	void printInfo() {
		System.out.println(getTitle() + " - " + getAuthor() + ", 파일 크기: " + filesize + "MB");
	}
	
}
