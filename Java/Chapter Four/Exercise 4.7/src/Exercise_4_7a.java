import java.util.Scanner;

public class Exercise_4_7a {

	public static void main(String[] args) {
		
		// Create a scanner
		Scanner myScanner = new Scanner(System.in);

		// Prompts the user to enter a circle's radius.
		System.out.print("Enter the radius(>0) of the bounding circle : ");
		double radius = myScanner.nextDouble();
		
		if(radius <= 0) {
			System.out.print("Make Sure The Radius Is A Positive Number.");
			System.exit(0);
		}
		
		// The angle for the point p1.
		final double firstPointAngle = Math.PI/4;
		
		double p1XCoordinate = radius*Math.cos(firstPointAngle);
		double p1YCoordinate = radius*Math.sin(firstPointAngle);
		
		String point1 = "(" + p1XCoordinate + "," + p1YCoordinate+")\n";
		
		double p2XCoordinate = radius*Math.cos(Math.PI/2);
		double p2YCoordinate = radius*Math.sin(Math.PI/2);
		
		String point2 = "(" + p2XCoordinate + "," + p2YCoordinate+")\n";
		
		double p3XCoordinate = radius*Math.cos(Math.PI-firstPointAngle);
		double p3YCoordinate = radius*Math.sin(Math.PI-firstPointAngle);
		
		String point3 = "(" + p3XCoordinate + "," + p3YCoordinate+")\n";
		
		double p4XCoordinate = radius*Math.cos(Math.PI+firstPointAngle);
		double p4YCoordinate = radius*Math.sin(Math.PI+firstPointAngle);
		
		String point4 = "(" + p4XCoordinate + "," + p4YCoordinate+")\n";
		
		double p5XCoordinate = radius*Math.cos(-firstPointAngle);
		double p5YCoordinate = radius*Math.sin(-firstPointAngle);
		
		String point5 = "(" + p5XCoordinate + "," + p5YCoordinate+")\n";
		
		System.out.print(point1+point2+point3+point4+point5);
		
		// Close the scanner
		myScanner.close();
	}

}
