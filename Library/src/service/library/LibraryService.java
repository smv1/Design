package service.library;

import domainentities.Book;
import domainentities.FineInfo;
import exception.BookException;
import exception.LibraryUserException;

/*
 * Library : manages Books data, how many are there
 * Where book is kept, shelf number 
 * LibraryId is passed through REST APIs exposed for each of these below APIs
 */
public interface LibraryService {
	
	//return transactionId
	String addBook(Book book,int copies)throws BookException;
	
	//return transactionId
	
	String removeBook(Book book,int copies)throws BookException;
	//return bookId
	void removeBookById(String bookId)throws BookException;
	
	//return bookId
	Book allotBook(String bookName,String studentId)throws LibraryUserException;
	
	Book allotBookById(String bookId)throws LibraryUserException;
	
	//return requestId	
	String requestBook(String bookName,String studentId)throws LibraryUserException;
	
	void returnBook(String bookId,String studentId)throws LibraryUserException;
	
	void acceptFine(String studentId,int money)throws LibraryUserException;
	FineInfo calculateFine(String studentId)throws LibraryUserException;
}
