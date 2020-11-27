import java.util.Scanner;

public class Exercise_5_30b {

	public static void main(String[] args) {
		
		// Create a scanner to read user input.
		Scanner input = new Scanner(System.in);

		// Prompts the user to enter an amount.
		System.out.print("Enter an amount : ");
		double amount = input.nextDouble();
		
		// Prompts the user to enter annual interest rate.
		System.out.print("Enter annual interest rate : ");
		double annualInterestRate = input.nextDouble();
		
		// Prompts the user to enter number of months.
		System.out.print("Enter number of months : ");
		short numberOfMonths = input.nextShort();
		
		if(amount<0 || numberOfMonths < 0 || annualInterestRate<0) {
			System.out.print("Error : Invalid User Input.");
		}
		else {
			
			// Keep the original/initial amount.
			double initialAmount = amount;
			
			double finalAmount = initialAmount;
			
			byte monthNumber = 1;
			
			while(monthNumber <= numberOfMonths) {
				finalAmount = amount*(1 + annualInterestRate/1200);
				amount = initialAmount + finalAmount;
				monthNumber++;
			}
			
			System.out.printf("The amount after %d %s is %6.3f", 
			numberOfMonths, (numberOfMonths>1)?" months":"month",
			finalAmount);
		}
		
		// close scanner
		input.close();
	}

}
