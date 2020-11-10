import java.util.Scanner;

public class Exercise_3_1a {

	public static void main(String[] args) {
		
		// Create a scanner 
		Scanner scanner = new Scanner(System.in);
		
		// Declare variables to hold a,b and c.
		double a, b, c;
		
		// Prompts the user to enter a, b and c.
		System.out.print("Enter a, b, c : ");
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		
		// Calculate out discriminant.
		double discriminant = b*b - 4*a*c;
		
		if(discriminant > 0) {
			// Find two real roots.
			double firstRoot = (-b + Math.pow(discriminant, 0.5))/2*a;
			double secondRoot = (-b - Math.pow(discriminant, 0.5))/2*a;
		
			System.out.printf("The equation has two "
			+ "real roots %2.6f and %2.5f", 
			firstRoot, secondRoot);
		}
		
		else if(discriminant==0) {
			double root = (-b + Math.pow(discriminant, 0.5))/2*a;
			System.out.printf("The equation has one real root %2.4f", root);
		}
		
		else {
			System.out.print("The equation has no roots.");
		}
		
		// Close scanner
		scanner.close();

	}

}
