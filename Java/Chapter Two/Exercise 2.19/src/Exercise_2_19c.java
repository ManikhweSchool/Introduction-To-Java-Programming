import java.util.Scanner;

public class Exercise_2_19c {
	// http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		// Create scanner 
		Scanner scanner = new Scanner(System.in);
		
		// Prompts a user to enter three points.
		System.out.print("Enter three points for a tringle : ");
		
		// Point A
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		
		// Point B
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		
		// Point C
		double x3 = scanner.nextDouble();
		double y3 = scanner.nextDouble();
		
		// Distance between A and B.
		double side1 = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		
		// Distance between A and C.
		double side2 = Math.sqrt(Math.pow(x3-x1, 10-8) + (y3-y1)*(y3-y1));
		
		// Distance between B and C.
		double side3 = Math.sqrt((x3-x2)*(x3-x2) + Math.pow(y3-y2, 2));
		
		double s = (side1 + side2 + side3)/2;
		
		// Show out to a user.
		System.out.printf("The area of athe triangle is %3.1f", Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)));
		
		// close out scanner.
		scanner.close();
	}

}
