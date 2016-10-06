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
	
	 public String getName()
	 {
         return this.name;
	 }
	 
	 public int getX()
	 {
         return this.x;
	 }
	 
	 public int getY()
	 {
		 return this.y;
	 }
	 
	 public int getSpeed()
	 {
		 return this.getSpeed();
	 }
	 
	 public int getOrientation()
	 {
		 return this.orientation;
	 }
	 
	public String newOrientation()
	{
		if((this.orientation == 360) || (this.orientation == -360))
		{
			this.orientation = 0;
		}
		if((this.orientation==0) || (this.orientation == 360))
		{
			return "north";
		}
		else if((this.orientation==90) || (this.orientation ==-270 ))
		{
			return "east";
		}
		else if((this.orientation==180) || (this.orientation == -180))
		{
			return "south";
		}
		else if((this.orientation==270) || (this.orientation == -90))
		{
			return "west";
		}
		else
			return "Invalid direction";
	}
	
	public String positionOfXY()
	{
		if(newOrientation()=="north")
		{
			this.y = y+speed;	
		}
		else if(newOrientation()=="east")
		{
			this.x = x+speed;
		}
		else if(newOrientation()=="south")
		{
			this.y = y-speed;
		}
		else if(newOrientation()=="west")
		{
			this.x = x-speed;
		}
		return "("+x+","+y+")";
		
		}
	public String Position(String direction)
	{
		if(direction=="left")
		{
			orientation = orientation - 90;
			return  " If the Robot " +this.name+" turns "+ direction + " then the New Position = " + positionOfXY()+" and Orientation = "+newOrientation();
		}
		if(direction=="right")
		{
			orientation = orientation + 90;
			return " If the Robot "+this.name+" turns "+ direction + " then the New Position = " +positionOfXY()+" and Orientation = "+newOrientation();	
		}
		else return "Invalid Position";	
	}
	public double distance(Robot a1)
	{
		double dist = Math.sqrt((double)(Math.pow((this.x-a1.x), 2))+(Math.pow((this.y-a1.y), 2)));
		return dist;
	}
	public String toString() 
	{
		return "Robot [Name=" + this.name + ", Position= [" + this.x+", " +this.y+"], Speed=" + this.speed + ", Orientation="
				+ newOrientation() + "]";
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
		System.out.println("Enter the direction (left or right) for the Robot to turn ");
		String dir = sc.nextLine();
		//System.out.println(dir);
		//System.out.println(a1.Position(dir));
		
	}

}
