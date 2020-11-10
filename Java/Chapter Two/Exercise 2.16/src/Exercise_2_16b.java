import java.util.Scanner;

public class Exercise_2_16b {

	// http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Prompts a user to enter a side length.
		System.out.print("Enter the side : ");
		double side = scanner.nextDouble();
		
		/* We splits the equation into two parts 
		 * and store each part on a variable.*/
		double firstPart = (3.0*Math.sqrt(3))/2;
		double secondPart = Math.pow(side, 2);
		
		// Display the result on the console.
		System.out.printf("The area of the hexagon is %2.4f", firstPart*secondPart);
		
		scanner.close();
	}

}
