package exception;

public class BookException extends Exception{

	enum ErrorCode{
		NO_BOOK_FOUND("no book found");
		ErrorCode(String errorCode){
			
		}
	}
	String errorMessage;
	public BookException(ErrorCode errorCode,String error) {
		
	}
}
