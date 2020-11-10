import java.util.Scanner;

public class Exercise_3_3a {

	// http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		// Create a scanner to read user input.
		Scanner scanner = new Scanner(System.in);
		
		// Declare a, b, c, d, e and f.
		double a, b, c, d, e, f;
		
		System.out.print("Enter a, b, c, d, e and f : ");
		
		// Capture user input.
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		d = scanner.nextDouble();
		e = scanner.nextDouble();
		f = scanner.nextDouble();
		
		// Calculate the denominator of x and y.
		double commonDenominator = a*d-b*c;
		
		double numerator1;
		double numerator2;
		double x;
		double y;
		
		if(commonDenominator == 0) {
			System.out.print("The equation has no solution.");
		}
		else {
			numerator1 = e*d - b*f;
			numerator2 = a*f - e*c;
			
			x = numerator1/commonDenominator;
			y = numerator2/commonDenominator;
			
			System.out.print("x is " + x + " and y is " + y);
		}
		
		// Close our scanner.
		scanner.close();

	}

}
