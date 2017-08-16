package domainentities.user;

import java.util.Date;
import java.util.UUID;

import constants.UserType;

public class User {

	private UUID userId;
	private String name;
	private String userName;
	private UserType userType;
	private Date userCreatedTime;

	public User(String name,String userName, UserType userType) {
		super();
		this.userId = UUID.randomUUID();
		this.name = name;
		this.userName=userName;
		this.userType = userType;
	}
	
	public String getUserId() {
		return userId.toString();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getUserCreatedTime() {
		return userCreatedTime;
	}
	public void setUserCreatedTime(Date userCreatedTime) {
		this.userCreatedTime = userCreatedTime;
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
