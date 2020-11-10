import java.util.Scanner;

public class Exercise_2_22b {

	public static void main(String[] args) {
		
		// Create a scanner.
		Scanner scanner = new Scanner(System.in);

		// Receive the amount
		System.out.print("Enter an amount as an integer, for 1156 : ");
		int money = scanner.nextInt();
		
		double amount = (money%100)/100.0 + money/100;
		int remainingAmount = (int)(amount * 100);
		
		// Find number of dollars.
		int numberOfDollars = remainingAmount/100;
		remainingAmount = remainingAmount%100;
		
		// Find the number of quarters in the remaining amount.
		int numberOfQuarters = remainingAmount/25;
		remainingAmount %= 25;
		
		// Find the number of dimes in the remaining amount.
		int numberOfDimes = remainingAmount/10;
		remainingAmount %= 10;
		
		// Find the number of nickels in the remaining amount.
		int numberOfNickels = remainingAmount/5;
		remainingAmount = remainingAmount % 5;
		
		// Find the number of pennies in the remaining amount.
		int numberOfPennies = remainingAmount;
		
		// Display the result.
		System.out.println("Your amount " + amount + " consists of");
		System.out.println(" " + numberOfDollars + " dollars");
		System.out.println(" " + numberOfQuarters + " quarters");
		System.out.println(" " + numberOfDimes + " dimes");
		System.out.println(" " + numberOfNickels + " nickels");
		System.out.println(" " + numberOfPennies + " pennies");
		
		// Close our scanner.
		scanner.close();
	}

}
