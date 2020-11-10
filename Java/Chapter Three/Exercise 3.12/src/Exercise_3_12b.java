import java.util.Scanner;

public class Exercise_3_12b {

	public static void main(String[] args) {
		
		// Create scanner
		Scanner input = new Scanner(System.in);
		
		// Prompts a user to enter a 3 digits number.
		System.out.print("Enter a 3 digits number : ");
		
		int number = input.nextInt();
		int initialNumber = number;
		
		int lastDigit = number%10;
		number /= 100;
		
		int firstNumber = number;
		
		if(firstNumber >= 10) 
			System.out.print("Try again, make sure you enter three digits");
		else {
			if(firstNumber==lastDigit)
				System.out.print(initialNumber+ " is a palindrome.");
			else
				System.out.print(initialNumber+ " isn't a palindrome.");
		}
		
		// Close
		input.close();
	}

}
