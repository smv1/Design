package exception;

public class UserException extends Exception{

	enum ErrorCode{
		USER_ALREADY_THERE,USER_CANNOT_BE_CREATED,USER_NOT_FOUND;
	}
	String errorMessage;
	public UserException(int errorCode,String error) {
		
	}
}
