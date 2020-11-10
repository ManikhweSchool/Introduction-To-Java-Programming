import java.util.Scanner;

public class Exercise_3_27a {

	public static void main(String[] args) {
		
		
		// Create a scanner 
		Scanner scanner = new Scanner(System.in);

		// Prompts the user to enter a point.
		System.out.print("Enter a point's x-coordinate "
		+ "and y-coordinates : ");
		double xCoordinate = scanner.nextDouble();
		double yCoordinate = scanner.nextDouble();
		
		boolean isPointInside = true;
		
		/*Check whether the x-coordinate is within the rectangular box.*/
		if(xCoordinate > 200 || xCoordinate < 0)
			isPointInside = false;
		
		if(isPointInside) {
			/*Check whether the y-coordinate is within the rectangular box.*/
			if(yCoordinate > 100 || yCoordinate < 0)
				isPointInside = false;
			
			// (x2-x1)*(y-y1) - ((x-x2)*(y2-y1))
			double determinant = 
			(200 - 0)*(yCoordinate-100)-
			((xCoordinate-0)*(0-100));
			
			if(determinant > 0)
				isPointInside = false;
		}
		
		if(isPointInside)
			System.out.println("The point is in the triangle.");
		else
			System.out.println("The point is not in the triangle.");
		
		// Close scanner
		scanner.close();
	}

}
