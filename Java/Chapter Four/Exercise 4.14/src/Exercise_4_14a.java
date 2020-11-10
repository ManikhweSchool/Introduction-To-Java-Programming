import java.util.Scanner;

public class Exercise_4_14a {

	public static void main(String[] args) {
		
		
		// Create a scanner to read user input.
		Scanner input = new Scanner(System.in);
		
		// Prompts the user to enter a letter grade.
		System.out.print("Enter a letter grade : ");
		String userInput = input.nextLine();
		
		if(userInput.length() != 1 ||
		((userInput.charAt(0) != 'A') &&
		(userInput.charAt(0) != 'B') &&
		(userInput.charAt(0) != 'C') &&
		(userInput.charAt(0) != 'D') &&
		(userInput.charAt(0) != 'F'))
		) {
			System.out.print(userInput + " is an invalid grade.");
			System.exit(0);
		}
		
		int numericValue = -1;
		
		switch(userInput.charAt(0)) {
		case 'A' : numericValue = 4; break;
		case 'B' : numericValue = 3; break;
		case 'C' : numericValue = 2; break;
		case 'D' : numericValue = 1; break;
		case 'F' : numericValue = 0; break;
		}
		
		if(numericValue == -1)
			System.out.print(userInput + " is an invalid grade.");
		else
			System.out.print("The numeric value for grade " 
			+ userInput + " is " + numericValue);
		
		// Close scanner
		input.close();

	}

}
