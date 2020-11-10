import java.util.Scanner;

public class Exercise_2_3b {

	public static void main(String[] args) {
		
		// We need to create a scanner.
		Scanner reader = new Scanner(System.in);

		// Prompts a user to enter a number for feet.
		System.out.print("Enter a value for feet : ");
		
		// We need to keep user input in a variable.
		double numberInFeet = reader.nextDouble();
		
		// Now we do the conversion.
		// 1 feet = 0.305 meter
		// numberInFeet feet = ? meters
		
		// Let ?  be x.
		// 1 feet = 0.305 meter
		// numberInFeet feet = x meters
		
		// We cross multiple to find x.
		// 1*x = 0.305*numberInFeet
		// x = 0.305*numberInFeet
		
		System.out.printf(numberInFeet + " feet is %2.4f meters", 0.305*numberInFeet);
		
		
		// Make sure the scanner is closed.
		reader.close();
	}

}
