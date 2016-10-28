package javagram.filters;

import javagram.Picture;
import java.awt.Color;
import java.util.Scanner;

public class BrightnessFilter implements Filter{

	public Picture process(Picture original) {
		
		Picture processed = new Picture(original.width(), original.height());
		Scanner sc = new Scanner(System.in);
  	  System.out.println("What brightness amount do you want to add to the image? Enter a number between 50 and 100");
        int brightness = sc.nextInt();
	    //get each pixel one by one
	    for (int i = 0; i < original.width(); i++) {
	      for (int j = 0; j < original.height(); j++) {
	    	  
	    	  Color c = original.get(i, j);
	          
	          
	    	  
	          int r = c.getRed();
	          int g = c.getGreen();
	          int b = c.getBlue();
	          int R = r + brightness;
	          int G = g + brightness;
	          int B = b + brightness;
	          if(R>255)
	        	  R = 255;
	          if(G>255)
	        	  G = 255;
	          if(B>255)
	        	  B = 255;       
	          processed.set(i, j, new Color(R,G,B));
	    	  
	      }
	    }
		
		return processed;
	}

}
