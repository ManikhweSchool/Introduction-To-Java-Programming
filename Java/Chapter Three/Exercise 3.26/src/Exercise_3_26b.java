import java.util.Scanner;

public class Exercise_3_26b {

	public static void main(String[] args) {
		
		
		// Create a scanner
		Scanner scanner = new Scanner(System.in);
		
		// Prompts the user to enter an integer to check.
		System.out.print("Enter an integer : ");
		int userNumber = scanner.nextInt();
		
		// Check whether a number is divisible by either 5 and 6.
		if(userNumber%5 == 0 && userNumber%6 == 0)
			System.out.println("Is " + userNumber + 
			" divisible by 5 and 6? true");
		else
			System.out.println("Is " + userNumber + 
			" divisible by 5 and 6? false");
		
		
		// Check whether a number is divisible by either 5 or 6.
		if(userNumber%5 == 0 || userNumber%5 == 0)
			System.out.println("Is " + userNumber + 
			" divisible by 5 or 6? true");
		else
			System.out.println("Is " + userNumber + 
			" divisible by 5 or 6? false");
		
		
		// Check whether a number is divisible by 5 or 6, but not both.
		if(userNumber%5 == 0 ^ userNumber%6==0)
			System.out.println("Is " + userNumber + 
			" divisible by 5 or 6, but not both? true");
		else 
			System.out.println("Is " + userNumber + 
			" divisible by 5 or 6, but not both? false");
		
		// Close scanner
		scanner.close();

	}

}
