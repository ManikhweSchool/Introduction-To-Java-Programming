import java.util.Scanner;

public class Exercise_4_26b {

	public static void main(String[] args) {

		// Create scanner
		Scanner scanner = new Scanner(System.in);
		
		// Retrieve user input
		System.out.print("Enter an amount in double, for example 11.56 : ");
		String stringAmount = scanner.next();
		
		
		
		int remainingAmount;
		
		int numberOfDollars = Integer.parseInt(
		stringAmount.substring(0, stringAmount.indexOf(".")));
		remainingAmount = Integer.parseInt(
		stringAmount.substring(stringAmount.indexOf(".")+1));
		
		// Find the number of quarters in the remaining amount 
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25; 
		
		// Find the number of dimes in the remaining amount 
		
		int numberOfDimes = remainingAmount / 10;      
		remainingAmount = remainingAmount % 10;
		
		// Find the number of nickels in the remaining amount 
		int numberOfNickels = remainingAmount / 5; 
		remainingAmount = remainingAmount % 5; 
		
		// Find the number of pennies in the remaining amount 
		int numberOfPennies = remainingAmount;
		
		// Display results 
		System.out.println("Your amount " + stringAmount + " consists of"); 
		System.out.println("    " + numberOfDollars + " dollars"); 
		System.out.println("    " + numberOfQuarters + " quarters "); 
		System.out.println("    " + numberOfDimes + " dimes"); 
		System.out.println("    " + numberOfNickels + " nickels"); 
		System.out.println("    " + numberOfPennies + " pennies");
		
		scanner.close();
	}

}
