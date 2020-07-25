package lampda;



import java.util.ArrayList;
import java.util.List;

public class Book {
	
	private int bookId;
	private String bookName;
	private List<String> authors = new ArrayList<String>();
	public Book(int bookId, String bookName, List<String> authors) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authors = authors;
	}
	public Book() {
		super();
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	

}
