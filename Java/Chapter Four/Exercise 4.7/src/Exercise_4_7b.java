import java.util.Scanner;

public class Exercise_4_7b {

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
		double firstPointAngle = Math.toRadians((Math.random()*90));
		
		double p1X = radius*Math.cos(firstPointAngle);
		double p1Y = radius*Math.sin(firstPointAngle);
		
		double p2X = radius*Math.cos(Math.PI/2);
		double p2Y = radius*Math.sin(Math.PI/2);
		
		double p3X = radius*Math.cos(Math.PI-firstPointAngle);
		double p3Y = radius*Math.sin(Math.PI-firstPointAngle);
		
		double p4X = radius*Math.cos(Math.PI+firstPointAngle);
		double p4Y = radius*Math.sin(Math.PI+firstPointAngle);
		
		double p5X = radius*Math.cos(2*Math.PI-firstPointAngle);
		double p5Y = radius*Math.sin(2*Math.PI-firstPointAngle);
		
		System.out.printf("(%2.3f,%2.3f)\n(%2.3f,%2.3f)"
		+ "\n(%2.3f,%2.3f)\n(%2.3f,%2.3f)\n(%2.3f,%2.3f)", 
		p1X,p1Y,p2X,p2Y,p3X,p3Y,p4X,p4Y,p5X,p5Y);
		
		
		// Close the scanner
		myScanner.close();
	}

}
