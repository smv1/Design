package exception;

public class LibraryUserException extends Exception{

	enum ErrorCode{
		BookAllotLimitExceed,PreviousFineDue;
	}
	String errorMessage;
	public LibraryUserException(ErrorCode errorCode,String error) {
		
	}
}
