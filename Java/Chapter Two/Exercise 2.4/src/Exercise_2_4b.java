import java.util.Scanner;

public class Exercise_2_4b {

	public static void main(String[] args) {
		
		// We create a scanner to read user input.
		Scanner scanner = new Scanner(System.in);
		
		// Prompts a user to enter a number is pounds.
		System.out.print("Enter a number in pounds : ");
		
		// We keep that user input in a variable.
		double numberOfPound = scanner.nextDouble();
		
		// Now we simply come up with a formula.
		// 1 pound = 0.454 kilogram
		// numberOfPound pound = x kilograms
		
		// We cross multiple the two equations to solve for x.
		double numberInKilograms = 0.454*numberOfPound; 
		
		System.out.printf(numberOfPound + " pounds is %4.3f kilograms", numberInKilograms);
		
		// Close our scanner.
		scanner.close();

	}

}
