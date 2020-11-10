import java.util.Scanner;

public class Exercise_2_5b {

	public static void main(String[] args) {
		
		// Read user input using a scanner.
		Scanner scanner = new Scanner(System.in);

		// Prompts a user to enter sub-total and gratuity rate.
		System.out.print("Enter the subtotal and a gratuity rate : ");
		
		double subTotal = scanner.nextDouble();
		double gratuity = scanner.nextDouble()/10.0;
		
		System.out.printf("The gratuity is $%2.1f and total is $%2.1f", gratuity, subTotal + gratuity);
		
		// Close the scanner.
		scanner.close();
	}

}
