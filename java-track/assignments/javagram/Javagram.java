package javagram;

import javagram.filters.*;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Javagram {

	public static void main(String[] args) {

		// Create the base path for images		
		String[] baseParts = {System.getProperty("user.dir"), "images"};
		String dir = String.join(File.separator, baseParts);
		String relPath;
		Picture picture = null;
		Scanner in = new Scanner(System.in);
		
		// prompt user for image to filter and validate input
		do {
			
			String imagePath = "path not set";
			
			// try to open the file
			try {
				
				System.out.println("Image path (relative to " + dir + "):");
				relPath = in.next();
				
				String[] relPathParts = relPath.split("////");
				imagePath = dir + File.separator + String.join(File.separator, Arrays.asList(relPathParts));
				
				picture = new Picture(imagePath);
				
			} catch (RuntimeException e) {
				System.out.println("Could not open image: " + imagePath);
			}
			
		} while(picture == null);
		
		// TODO - prompt user for filter and validate input
	
		int filterID = 0;
		do {
			
			try {
				System.out.println("Enter any interger value between 1 through 7: ");
				System.out.println("1. Redfilter, 2. Greenfilter, 3. Bluefilter, 4. Invertfilter, 5. Brightnessfilter, 6. Monochromefilter, 7. Grayscalefilter" );
				
				filterID = in.nextInt();
				
				
			} catch (RuntimeException e) {
				System.out.println("Invalid filterID" + filterID + " Please select an interger between 1 and 7: ");
			}
		}while(filterID<1 || filterID >7);

		
		// TODO - pass filter ID int to getFilter, and get an instance of Filter back 
		Filter filter = getFilter(filterID);			
		
		// filter and display image
		Picture processed = filter.process(picture);
		processed.show();
		
		System.out.println("Image successfully filtered");
		
		// save image, if desired
	
		System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving):");
		String fileName = in.next();
		
		// TODO - if the user enters the same file name as the input file, confirm that they want to overwrite the original
		
		if (fileName.equals("exit")) 
		{
			System.out.println("Image not saved");
		} 
		if(fileName.equals(dir))
		{
			System.out.println("Do you want to override the original? enter y for yes and n for no");
			String s = in.nextLine();
			if(s.equals("y")) 
			{
				String absFileName = dir + File.separator + fileName;
				processed.save(absFileName);
				System.out.println("Image saved to " + absFileName);
			}
			if(s.equals("n"))
			{
				System.out.println("Enter the filename : ");
				fileName = in.next();
				String absFileName = dir + File.separator + fileName;
				processed.save(absFileName);
				System.out.println("Image saved to " + absFileName);
			}	
		}
		
		// close input scanner
		in.close();               
	}
	
	// TODO - refactor this method to accept an int parameter, and return an instance of the Filter interface
	// TODO - refactor this method to thrown an exception if the int doesn't correspond to a filter
	private static Filter getFilter(int id) {
		
	
			Filter fi = null;
			
				
				if(id == 1)
				{
					fi =  new RedFilter();
				}
				if(id == 2)
				{
					fi =  new GreenFilter();
				}
				if(id == 3)
				{
					fi = new BlueFilter();
				}
				if(id == 4)
				{
					fi = new InvertFilter();
				}
				if(id == 5)
				{
					fi = new BrightnessFilter();
				}
				if(id == 6)
				{
					fi = new MonochromeFilter();
				}
				if(id == 7)
				{
					fi = new GrayscaleFilter();
				}
				return fi;
				
		

		// TODO - create some more filters, and add logic to return the appropriate one
		
		
		
	}

}