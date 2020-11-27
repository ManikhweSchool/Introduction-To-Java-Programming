import java.util.Scanner;

public class Exercise_5_37b {

	public static void main(String[] args) {
		
		// Create a scanner to read user input.
		Scanner scanner = new Scanner(System.in);
		
		// Prompts a user to enter a number
		System.out.print("Enter a decimal number : ");
		int userInput = scanner.nextInt();
		
		if(userInput < 0) {
			System.out.print("Try again : Invalid Number");
			System.exit(0);
		}
		
		int userInputCopy = userInput;
		
		String reversedBinary = "";
		byte remainder;
		
		do {
			remainder = (byte)(userInput%2);
			reversedBinary += remainder;
			userInput /= 2;
		}while(userInput>0);
		
		String toBinary = "";
		
		for(int bitIndex = reversedBinary.length()-1;
		bitIndex>=0;bitIndex--)
			toBinary += reversedBinary.charAt(bitIndex);
		
		System.out.print("Decimal : " + userInputCopy + 
		"\nBinary : " + toBinary);
		
		// Close scanner
		scanner.close();
	}
}
