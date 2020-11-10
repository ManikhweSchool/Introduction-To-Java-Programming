import java.util.Scanner;

public class Exercise_3_29c {

	public static void main(String[] args) {
		
		// Create a scanner.
		Scanner scanner = new Scanner(System.in);
		
		// Prompts the user to enter position and radius of first circle.
		System.out.print("Enter circle1's center x-coordinate, "
		+ "y-coordinate and radius : ");
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double r1 = scanner.nextDouble();
		
		// Prompts the user to enter position and radius of second circle.
		System.out.print("Enter circle2's center x-coordinate, "
		+ "y-coordinate and radius : ");
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		double r2 = scanner.nextDouble();		
		
		double distance = Math.sqrt(Math.pow(x2-x1, 2)
		+ Math.pow(y2-y1, 2));
		
		if(distance<=Math.abs(r1-r2))
			System.out.println("Circle2 is inside circle1.");
		else if(distance<=r1+r2)
			System.out.println("Circle2 overlaps circle1.");
		else
			System.out.println("Circle2 doesn't overlap circle1.");
		
		// Close Scanner
		scanner.close();

	}

}
