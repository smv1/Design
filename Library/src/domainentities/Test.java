package domainentities;


import constants.UserType;
import domainentities.user.User;

public class Test {
public static void main(String[] args) {
	User user = new User("Shreesh","Shreesh", UserType.ADMIN);
	String userId = user.getUserId();
	System.out.println(userId);
}
}
