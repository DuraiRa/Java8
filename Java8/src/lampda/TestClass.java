package org.cap.predicate;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

	public static void main(String[] args) {
		
		List<Book> books=new ArrayList<Book>();
		
		Book book=new Book();
			book.setBookId(1);
			book.setBookName("Java Complete ref");
			book.getAuthors().add("Robert Froust");
			book.getAuthors().add("Jackson Paul");
		
			Book book1=new Book();
			book1.setBookId(2);
			book1.setBookName("Oracle Complete ref");
			book1.getAuthors().add("Robert Froust");
			book1.getAuthors().add("Annie Jerk");
			
			Book book2=new Book();
			book2.setBookId(23);
			book2.setBookName("Animation in Demand");
			book2.getAuthors().add("Paul thomson");
			book2.getAuthors().add("Annie Jerk");
			
			books.add(book);books.add(book1);books.add(book2);
			
			
			books.parallelStream()
				.flatMap((bok) -> bok.getAuthors().stream())
				.distinct()
				.forEach(System.out::println);

		
	}

}
