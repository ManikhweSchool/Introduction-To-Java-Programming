import java.util.Scanner;

public class Exercise_3_19b {

	// http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		// Create a scanner to read user input.
		Scanner justScanner = new Scanner(System.in);
		
		double x1,y1,x2,y2,x3,y3;
		
		// Prompts the user to enter the first point's coordinate.
		System.out.print("Enter the first point(x and y) "
		+ "of a triangle : ");
		x1 = justScanner.nextDouble();
		y1 = justScanner.nextDouble();
		
		// Prompts the user to enter the second point's coordinate.
		System.out.print("Enter the second point(x and y) "
		+ "of a triangle : ");
		x2 = justScanner.nextDouble();
		y2 = justScanner.nextDouble();
		
		// Prompts the user to enter the third point's coordinate.
		System.out.print("Enter the third point(x and y) "
		+ "of a triangle : ");
		x3 = justScanner.nextDouble();
		y3 = justScanner.nextDouble();
		
		double distance12 = Math.sqrt(Math.pow(x2-x1, 2)
		+ Math.pow(y2-y1, 2));
		
		double distance13 = Math.sqrt(Math.pow(x3-x1, 2)
		+ Math.pow(y3-y1, 2));
		
		double distance23 = Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));
		
		if((distance12 + distance13 <= distance23)
		||
		(distance12 + distance23 <= distance13)
		||
		(distance13 + distance23 <= distance12)
		)
			System.out.print("Error : Make sure yiou enter valid points.");
		else {
			double perimeter = distance12 + distance13 + distance23;
			System.out.printf("The perimeter of the triangle is %4.2f",
			perimeter);
		}
		// Close scanner
		justScanner.close();
		
	}

}
