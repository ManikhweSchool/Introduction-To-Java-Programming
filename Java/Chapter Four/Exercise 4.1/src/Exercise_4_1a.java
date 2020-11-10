import java.util.Scanner;

public class Exercise_4_1a {

	public static void main(String[] args) {
		
		// Create a scanner 
		Scanner input = new Scanner(System.in);
		
		/* Prompts the user to enter the length from the 
		 center to a vertex.*/
		System.out.println("Enter the length from the "
		+ "center to a vertex : ");
		double r = input.nextDouble();
		
		// Calculate s
		double s = 2*r*Math.sin(Math.PI/5);
		
		// Calculate area's numerator.
		double numerator = 5*Math.pow(s,2);
		
		// Calculate area's denominator.
		double denominator = 4*Math.tan(Math.PI/5);
		
		double area = numerator/denominator;
		
		System.out.printf("The area of a pentagon is %4.2f", area);
		
		// close scanner.
		input.close();

	}

}
