import static org.junit.Assert.*;

import org.junit.Test;

public class RobotTest
{

	@Test
	public void testNewOrientation()
	{
		Robot a = new Robot("Jim", 0, 0, 0, 90);
		assertTrue("Problem setting orientation in constructor", a.getOrientation()== 90);
		assertTrue("problem rotating 90 degrees", a.newOrientation() == "east");
		
	}

	@Test
	public void testPositionOfXY()
	{
		Robot b = new Robot("Alice", 0, 5, 5, 90);
		b.positionOfXY();
		assertTrue(b.getX() == 5);
		assertTrue(b.getY() == 5);
		
		
	}
}