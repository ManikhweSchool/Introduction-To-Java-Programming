import java.util.Scanner;

public class Exercise_3_3b {

	public static void main(String[] args) {
		
		
		System.out.print("Enter a, b, c, d, e and f : ");
		
		// Create a scanner to read user input.
		Scanner scanner = new Scanner(System.in);
		
		// Capture user input.
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double d = scanner.nextDouble();
		double e = scanner.nextDouble();
		double f = scanner.nextDouble();
		
		// Calculate the denominator of x and y.
		double denominator = a*d-b*c;
		
		if(denominator == 0) {
			System.out.print("The equation has no solution.");
		}
		else {
			double xNumerator = e*d - b*f;
			double yNumberator = a*f - e*c;
			
			double x = xNumerator/denominator;
			double y = yNumberator/denominator;
			
			System.out.print("x is " + x + " and y is " + y);
		}
		
		// Close our scanner.
		scanner.close();

	}

}
