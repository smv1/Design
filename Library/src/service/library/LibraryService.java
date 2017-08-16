package service.library;

import domainentities.Book;

/*
 * Library -manages Books data, how many are there
 * 
 */
public interface LibraryService {
	
	void addBook(Book book,int copies);
	void removeBook(Book book);
	void issueBook(String bookName);
	void issueForBookId(String bookId);
}
