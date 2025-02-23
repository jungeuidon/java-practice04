package prob02;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	
	
	
	public int getBookNo() {
		return bookNo;
	}


	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public Book(int bookNo,String title,String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
	}
	
	public void rent() {
		stateCode= 0 ;
		System.out.println( getTitle() +  "이 대여되었습니다.");
	}
	
	public void print() {
		System.out.println(
			"책 제목:" + title +
			", 작가:" + author +
			", 대여 유무:" + ( stateCode == 1 ? "재고있음" : "대여중" ) );
	}
	
	
}