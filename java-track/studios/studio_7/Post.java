package studio_7;

import java.util.ArrayList;
import java.util.Date;

public class Post 
{
	private String body;
	private String title;
	private String author;
	private final Date created;
	private Date modified;
	private static ArrayList<Post> PostList;
	
	public Post(String body, String title, String author) 
	{
		this.body = body;
		this.title = title;
		this.author = author;
		Date d = new Date();
		this.created = d;
		this.modified = d;
	}
	 public static void addPostList(Post newPost)
	 {
		 PostList.add(newPost);
	 }
		
	public static ArrayList<Post> getPostList()
	{
		return PostList;
	}
	
	
}
	