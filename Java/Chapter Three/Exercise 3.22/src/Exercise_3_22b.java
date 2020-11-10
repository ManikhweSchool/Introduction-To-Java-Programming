import java.util.Scanner;

public class Exercise_3_22b {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double xCenter = 0;
		double yCenter = 0;
		double radius = 10;
		
		// Prompts the user to enter a point.
		System.out.print("Enter a point : ");
		double xCoordinate = scanner.nextDouble();
		double yCoordinate = scanner.nextDouble();
		
		// Calculate a distance between the origin and the given point.
		double distance = Math.sqrt(
				          Math.pow(xCoordinate-xCenter, 2) +
				          Math.pow(yCoordinate-yCenter, 2));
		
		
		if(distance <= radius) 
			System.out.print("Point (" + xCoordinate + 
			"," + yCoordinate + ") is in the circle.");
		else
			System.out.print("Point (" + xCoordinate + 
			"," + yCoordinate + ") is not in the circle.");
		
		
		scanner.close();
	}
}
