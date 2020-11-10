import java.util.Scanner;

public class Exercise_3_12a {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a 3 digits number : ");
		int number = scanner.nextInt();
		
		int originalNumber = number;
		
		// Retrieve the last digits on number.
		byte lastDigit = (byte) (number%10);
		
		// Retrieve the second digits.
		byte firstDigit = (byte) (number/100);
		
		if(firstDigit==lastDigit)
			System.out.print(originalNumber + " is a palindrome.");
		else 
			System.out.print(originalNumber + " isn't a palindrome.");
		
		scanner.close();
	}

}
