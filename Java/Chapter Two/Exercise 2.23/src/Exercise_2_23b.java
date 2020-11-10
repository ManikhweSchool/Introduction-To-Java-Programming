import java.util.Scanner;

public class Exercise_2_23b {

	// http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		// Create a scanner.
		Scanner scanner = new Scanner(System.in);

		// Prompts the user to enter distance.
		System.out.print("Enter the driving distance : ");
		double distance = scanner.nextDouble();
		
		// Prompts the user to enter miles per gallon.
		System.out.print("Enter miles per galloon : ");
		double milesPerGallon = scanner.nextDouble();
		
		// Prompts the user to enter the price per gallon.
		System.out.print("Enter the price per gallon : ");
		double pricePerGallon = scanner.nextDouble();
		
		/* We first need to find the amount of gallon needed 
		 * for a given distance.*/
		double amountOfGallon = distance/milesPerGallon;
		
		// Display to a console.
		System.out.printf("The cost of driving is $%2.2f", 
		amountOfGallon*pricePerGallon);
		
		// Close the scanner.
		scanner.close();
	}

}
