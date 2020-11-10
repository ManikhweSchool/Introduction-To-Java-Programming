import java.util.Scanner;

public class Exercise_3_1b {

	//  http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		
		// Create a scanner
		Scanner input = new Scanner(System.in);
		
		// Declare all three variables for you equation.
		double a;
		double b;
		double c;
		
		// Prompts the user to enter values for all of our variables.
		System.out.print("Enter a, b, c : ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		// Calculate our destrimant.
		double distriminant = Math.pow(b, 2)-4*a*c;
		
		System.out.print("The equation has ");
		
		if(distriminant < 0) 
			System.out.print("no root.");
		else if(distriminant > 0) {
			double root1 = (-b + Math.sqrt(distriminant))/2*a;
			double root2 = (-b - Math.pow(distriminant, (1/2.0)))/2*a;
			
			System.out.printf("two roots %2.6f and %2.5f", root1, root2);
			
		}
		else {
			double root = (-b)/(2*a);
			System.out.printf("one root %2.5f", root);
		}
			
			
			
		
		// Close 
		input.close();

	}

}
