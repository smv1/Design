package exception;

public class LibraryCrudException extends Exception{

	enum ErrorCode{
		LibraryAlreadyPresent,LibraryCannotBeRemoved,LibraryNotFound;
	}
	String errorMessage;
	public LibraryCrudException(ErrorCode errorCode,String error) {
		
	}
}
