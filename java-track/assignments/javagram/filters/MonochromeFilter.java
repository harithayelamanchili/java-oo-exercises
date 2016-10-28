package javagram.filters;

import javagram.Picture;
import java.awt.Color;
import java.util.Scanner;

public class MonochromeFilter implements Filter{

	public Picture process(Picture original) {
		
		Picture processed = new Picture(original.width(), original.height());
		Scanner sc = new Scanner(System.in);
  	  System.out.println("What color do you want in the MonoChrome image : (1.Monochrome red, 2.Monochrome green, 3.Monochrome blue)");
        int monochrome = sc.nextInt();
	    //get each pixel one by one
	    for (int i = 0; i < original.width(); i++) {
	      for (int j = 0; j < original.height(); j++) {
	    	  
	    	  Color c = original.get(i, j);
	          
	          //get color components from each pixel
	    	  int r = c.getRed();
	          int g = c.getGreen();
	          int b = c.getBlue();
	          
	          int newcolor = (r + g + b)/4;
	    	  
	         if(monochrome == 1)
	         {
	        	 processed.set(i, j, new Color(newcolor, 0, 0)); 
	         }
	         if(monochrome == 2)
	         {
	        	 processed.set(i, j, new Color(0, newcolor, 0)); 
	         }
	         if(monochrome == 3)
	         {
	        	 processed.set(i, j, new Color(0, 0,newcolor)); 
	         }
	      }
	    }
		
		return processed;
	}

}
