package service.user;

import constants.UserType;
import domainentities.user.User;
import exception.UserException;

public interface UserService {

	void createUser(String name,UserType userType)throws UserException;
	User getUser(String userId)throws UserException;
	User updateUser(String userId,UserType userType)throws UserException;
	void deleteUser(String userId)throws UserException;
}
