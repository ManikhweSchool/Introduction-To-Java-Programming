import java.util.Scanner;

public class Exercise_3_19a {

	// http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		// Create a scanner to read user input.
		Scanner myScanner = new Scanner(System.in);

		// Prompts the user to enter first point of the triangle.
		System.out.print("Enter the first point(x and y) "
		+ "of a triangle : ");
		double x1 = myScanner.nextDouble();
		double y1 = myScanner.nextDouble();
		
		// Prompts the user to enter second point of the triangle.
		System.out.print("Enter the second point(x and y) "
		+ "of a triangle : ");
		double x2 = myScanner.nextDouble();
		double y2 = myScanner.nextDouble();
		
		// Prompts the user to enter the third point of the triangle.
		System.out.print("Enter the third point(x and y) "
		+ "of a triangle : ");
		double x3 = myScanner.nextDouble();
		double y3 = myScanner.nextDouble();
		
		// Calculate (x2-x1)*(x2-x1)
		double point12FirstProduct = (x2-x1)*(x2-x1);
		// Calculate (y2-y1)*(y2-y1)
		double point12SecondProduct = (y2-y1)*(y2-y1);
		double withinSquareRoot1 = point12FirstProduct + point12SecondProduct;
		// Distance between point 1 and point 2.
		double distance12 = Math.sqrt(withinSquareRoot1);
		
		// Calculate (x3-x1)*(x3-x1)
		double point13FirstProduct = (x3-x1)*(x3-x1);
		// Calculate (y3-y1)*(y3-y1)
		double point13SecondProduct = (y3-y1)*(y3-y1);	
		double withinSquareRoot2 = point13FirstProduct + point13SecondProduct;
		// Distance between point 1 and point 3.
		double distance13 = Math.sqrt(withinSquareRoot2);
		
		// Calculate (x3-x2)*(x3-x2)
		double point23FirstProduct = (x3-x2)*(x3-x2);
		// Calculate (y3-y2)*(y3-y2)
		double point23SecondProduct = (y3-y2)*(y3-y2);	
		double withinSquareRoot3 = point23FirstProduct + point23SecondProduct;
		// Distance between point 2 and point 3.
		double distance23 = Math.sqrt(withinSquareRoot3);
		
		// Determine the validity of edges.
		if(distance12 + distance13 > distance23
		&&
		distance12 + distance23 > distance13
		&& 
		distance13 + distance23 > distance12
		)
			System.out.printf("The perimeter of the triangle is %4.2f", 
			distance12+distance13+distance23);
		else 
			System.out.print("Make sure you enter valid points making up a triangle.");
		
		// Close scanner
		myScanner.close();
	}

}
