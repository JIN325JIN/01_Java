package collection.com.hw3.model.dto;

public class Book {

	private int bookNum;
	private String bookname;
	private String author;
	private int price;
	private String publisher;
	
	public Book() {}

	public Book(int bookNum, String bookname, String author, int price, String publisher) {
		super();
		this.bookNum = bookNum;
		this.bookname = bookname;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "Book [bookNum=" + bookNum + ", bookname=" + bookname + ", author=" + author + ", price=" + price
				+ ", publisher=" + publisher + "]";
	}
	public int getBookNum() {
		return bookNum;
	}
	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}
