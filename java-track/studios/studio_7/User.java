package studio_7;

import java.util.regex.Pattern;
import java.util.ArrayList;

public class User 
{
	private String username;
	private String password;
	private static ArrayList<User> userList;
	
	public User(String username, String password)
	{
		this.password = password;
		if(isValidUsername(username))
		{
			this.username = username;
		}
		else throw new IllegalArgumentException();
	}
	
	
	public static String hashPassword(String password)
	{
		String hashedPassword = password;
		return hashedPassword;
	}
	
	public boolean isValidPassword(String password)
	{
		String hashedPassword = hashPassword(password);
		{
			if(this.password.equals(hashedPassword))
			return true;
		}
		
	}
	
	public static boolean isValidUsername(String username)
	{
		boolean ans = Pattern.matches(username,"[a-zA-Z][a-zA-Z0-9_-]{4,11}" );
		return ans;
	}
	
	public static void addUserList(User newUser)
	{
		userList.add(newUser);
	}
	
	public static ArrayList<User> getUserList()
	{
		return userList;
	}
	
}
