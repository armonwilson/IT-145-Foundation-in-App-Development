import java.util.InputMismatchException;
import java.util.Scanner;

public class Paint1{	
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        boolean heightVer = false;
        boolean widthVer = false;
        final double squareFeetPerGallons = 350.0;
        
        // Implement a do-while loop to ensure input is valid
        while (!heightVer) {
        	System.out.println("Enter wall height (feet): ");
        	
        	try {
        // Prompt user to input wall's height
        		wallHeight = scnr.nextDouble();
        		
        		if (wallHeight <= 0.0) {
        			throw new Exception("Invalid Height.");
        		}
        		else {
        			heightVer = true;
        		}
        	}
        	catch (InputMismatchException e){
        		System.out.println("Wall height must be a number.");
        		scnr.nextLine();
        	}
        	catch (Exception excpt) {
        		System.out.println(excpt.getMessage());
        		scnr.nextLine();
        	}
        }

        // Implement a do-while loop to ensure input is valid
        while (!widthVer) {
        	System.out.println("Enter wall width (feet): ");
        	
        	try {
        		wallWidth = scnr.nextDouble();
        		
        		if (wallWidth <= 0) {
        			throw new Exception("Invalid width");
        		}
        		else {        		
        			widthVer = true;
        		}
        	}
        // Prompt user to input wall's width
        	catch (InputMismatchException e) {
        		System.out.println("Input must be a number.");
        		scnr.nextLine();
        	}
        	catch (Exception excpt) {
        		System.out.println(excpt.getMessage());
        		scnr.nextLine();
        	}
        }

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
        scnr.close();
    }	
}

