import java.util.Scanner;

public class Exercise_3_29a {

	public static void main(String[] args) {
		
		// Create a scanner.
		Scanner scanner = new Scanner(System.in);
		
		double circle1XCoordinate, circle1YCoordinate, circle1Radius;
		
		// Prompts the user to enter position and radius of first circle.
		System.out.print("Enter circle1's center x-coordinate, "
		+ "y-coordinate and radius : ");
		circle1XCoordinate = scanner.nextDouble();
		circle1YCoordinate = scanner.nextDouble();
		circle1Radius = scanner.nextDouble();
		
		double circle2XCoordinate, circle2YCoordinate, circle2Radius;
		
		// Prompts the user to enter position and radius of second circle.
		System.out.print("Enter circle2's center x-coordinate, "
		+ "y-coordinate and radius : ");
		circle2XCoordinate = scanner.nextDouble();
		circle2YCoordinate = scanner.nextDouble();
		circle2Radius = scanner.nextDouble();
		
		// Calculate (x2-x1) squared.
		double xPart = (circle2XCoordinate-circle1XCoordinate)*
		(circle2XCoordinate-circle1XCoordinate);
		// Calculate (y2-y1) squared.
		double yPart = (circle2YCoordinate-circle1YCoordinate)*
		(circle2YCoordinate-circle1YCoordinate);
		
		double distance = Math.sqrt(xPart+yPart);
		double difference = Math.abs(circle1Radius - circle2Radius);
		double sum = circle1Radius + circle2Radius;
		
		if(distance<=difference)
			System.out.println("Circle2 is inside circle1.");
		else if(distance<=sum)
			System.out.println("Circle2 overlaps circle1.");
		else
			System.out.println("Circle2 doesn't overlap circle1.");
		
		// Close Scanner
		scanner.close();

	}

}
