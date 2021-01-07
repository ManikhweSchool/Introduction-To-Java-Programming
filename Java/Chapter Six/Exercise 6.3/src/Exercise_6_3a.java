import java.util.Scanner;

public class Exercise_6_3a {

	public static void main(String[] args) {
		
		// Create scanner to read user input.
		Scanner scanner = new Scanner(System.in);
		
		// Prompts user to enter a number
		System.out.print("Enter a number : ");
		int number = scanner.nextInt();
		
		if(isPalindrome(number))
			System.out.print(number + " is a palindrome.");
		else
			System.out.print(number + " is not a palindrome.");
		
		// Close scanner
		scanner.close();

	}
	
	// Return true if number is a palindrome 
	public static boolean isPalindrome(int number) {
		return number==reverse(number);
	}
	
	// Return the reversal of an integer, i.e., reverse(456) returns 654 
	public static int reverse(int number) {
		
		int reversal = 0;
		int remainder;
		
		do {
			remainder = number%10;
			reversal = reversal*10 + remainder;
			number = number/10;
			
		}while(Math.abs(number)>0);
		
		return reversal;
		
	}


}
