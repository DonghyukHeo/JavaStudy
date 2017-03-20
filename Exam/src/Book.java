
public class Book {
	private String title;	//글 제목
	private int price;	//가격
	private String author;	//저자
	private String publisher;	//출판사 
	private String pubDate;	//출간일
	
	public Book(String title, int price, String author, String publisher, String pubDate) {
		super();
		this.title = title;
		this.price = price;
		this.author = author;
		this.publisher = publisher;
		this.pubDate = pubDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	
	public String toString() {
		return "Book [title=" + this.title + ", price=" + this.price + ", author=" + this.author + ", publisher=" + this.publisher
				+ ", pubDate=" + this.pubDate + "]";
	}
	
	
	
	
}
