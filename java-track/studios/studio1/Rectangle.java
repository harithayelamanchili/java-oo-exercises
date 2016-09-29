package studio1;


public class Rectangle
{
	private double width, length, area, perimeter;
	
	public  Rectangle(double width, double  length)
	{
	 this.width = width;
	 this.length = length;
	 this.area = width*length;
	 this.perimeter = 2*(length+width);
	}

	public double getWidth()
	{
		return width;
	}

	public void setWidth(double width) 
	{
		this.width = width;
	}

	public double getLength()
	{
		return length;
	}

	public void setLength(double length)
	{
		this.length = length;
	}
	
	public String isSquare(double width, double length)
	{
		this.width = width;
		this.length = length;
		if(width==length)
		{
			return "It's a square";
		}
		else
			return "It's not a square";
	}
	public String toString() 
	{
		return "Rectangle [width=" + width + ", length=" + length + ", area=" + area + ", perimeter=" + perimeter + "If it's a square = "+isSquare(width,length)+"]";
	}
	public boolean isSmaller(Rectangle t)
	{
		if(this.area<t.area)
		{
			return true;
		}
		else
			return false;
	}
	
	public static void main(String args[])
	{
		Rectangle r = new Rectangle(4.5,6.9);
		System.out.println("1st "+r);
		Rectangle s = new Rectangle(7.4,7.4);
		System.out.println("2nd "+s);
		System.out.println("The 1st rectangle is smaller than 2nd rectangle: " + r.isSmaller(new Rectangle(7.4,1.2)));
			
	}
}
