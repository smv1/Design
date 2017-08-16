package service.library;

import domainentities.Book;
import domainentities.Library;
import exception.BookException;
import exception.LibraryCrudException;
import exception.LibraryUserException;

/*
 * LibraryCrudService : creating library
 */
public interface LibraryCrudService {
	
	//return libraryId
	String createLibrary(String name,String title,String address)throws LibraryCrudException;
	
	Library updateLibrary(String libraryId, String name,String title,String address)throws LibraryCrudException;
	void deleteLibrary(String libraryId)throws LibraryCrudException;
	Library getLibrary(String libraryId)throws LibraryCrudException;
	
	
}
