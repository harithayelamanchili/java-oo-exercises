import java.util.Arrays;
import java.util.Scanner;

public class Robot
{
	private String name;
	private int x;
	private int y;
	private int speed;
	private int orientation;
	
	public Robot(String name, int x, int y, int speed, int orientation)
	{
		this.name = name;
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.orientation = orientation;
	}
	public String getOrientation(int orientation)
	{
		if((orientation == 360) || (orientation == -360))
		{
			orientation = 0;
		}
		if((orientation==0) || (orientation == 360))
		{
			return "north";
		}
		else if((orientation==90) || (orientation ==-270 ))
		{
			return "east";
		}
		else if((orientation==180) || (orientation == -180))
		{
			return "south";
		}
		else if((orientation==270) || (orientation == -90))
		{
			return "west";
		}
		else
			return "Invalid direction";
		
	}
	public String positionOfXY(int x, int y, int speed, int orientation)
	{
		if(getOrientation(orientation)=="north")
		{
			x = x;
			y = y+speed;
			
		}
		else if(getOrientation(orientation)=="east")
		{
			x = x+speed;
			y = y;
		}
		else if(getOrientation(orientation)=="south")
		{
			x = x;
			y = y-speed;
		}
		else if(getOrientation(orientation)=="west")
		{
			x = x-speed;
			y = y;
		}
		return "("+x+","+y+")";
		
		}
	public String Position(String direction)
	{
		if(direction=="left")
		{
			orientation = orientation - 90;
			return  " If the Robot " +this.name+" turns "+ direction + " then the New Position = " + positionOfXY(this.x,this.y,this.speed,this.orientation)+" and Orientation = "+getOrientation(this.orientation);
		}
		if(direction=="right")
		{
			orientation = orientation + 90;
			return " If the Robot "+this.name+" turns "+ direction + " then the New Position = " +positionOfXY(this.x,this.y,this.speed,this.orientation)+" and Orientation = "+getOrientation(this.orientation);	
		}
		else return "Invalid Position";	
	}
	public double distance(Robot r)
	{
		double dist = Math.sqrt((Math.pow((this.x-r.x), 2))+(Math.pow((this.y-r.y), 2)));
		return dist;
	}
	public String toString() 
	{
		return "Robot [Name=" + this.name + ", Position= [" + this.x+", " +this.y+"], Speed=" + this.speed + ", Orientation="
				+ getOrientation(this.orientation) + "]";
	}


	public static void main(String[] args)
	{
		Robot r = new Robot("Charlie", 3, 4, 5, 90);
	
		Robot s = new Robot("Bod", -3, 7, 2,  180);
	
		Robot t = new Robot("Emma", -7, -1, 5,  0);
		
		System.out.println(r);
		System.out.println(s);
		System.out.println(t);
		
		System.out.println(r.Position("left"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the Robot ");
		String n = sc.nextLine();
		System.out.println("Enter the x postion of the Robot ");
		int x = sc.nextInt();
		System.out.println("Enter the y postion of the Robot ");
		int y = sc.nextInt();
		System.out.println("Enter the speed of the Robot ");
		int speed = sc.nextInt();
		System.out.println("Enter the orientation (0, 90, 180, 360) of the Robot ");
		int ori = sc.nextInt();
		Robot a1 = new Robot(n,x,y,speed,ori);
		System.out.println("Your robot details are " + a1);
		System.out.println(r.name + " is at a distance of "+r.distance(a1)+" from " + a1.name);
//		System.out.println("Enter the direction (left or right) for the Robot to turn ");
//		String dir = sc.nextLine();
//		System.out.println(dir);
//		System.out.println(a1.Position(dir));
		
	}

}
