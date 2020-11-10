import java.util.Scanner;

public class Exercise_2_21a {

	// http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		

		// Create scanner to reader user input from a keyboard.
		Scanner input = new Scanner(System.in);
		
		// Prompts a user to enter investment amount.
		System.out.print("Enter investment amount : ");
		
		// Declare and initialize a variable to hold investment amount.
		double investmentAmount = input.nextDouble();
		
		// Prompts the user to enter the annual interest rate.
		System.out.print("Enter annual interest rate in percentage : ");
		// Convert user input into percentages.
		double annualInterestRate = input.nextDouble()/100;
		
		// Prompts a user to enter number of years.
		System.out.print("Enter number of years : ");
		int numberOfYears = input.nextInt();
		
		/*
		 * Declare and initialize our future investment value.
		 * Because there are 12 months in a year, we need to 
		 * divide our annual interest rate by 12.
		 * */
		
		double futureInvestmentValue = investmentAmount*Math.pow(
		(1+(annualInterestRate/12)), numberOfYears*12);
		
		// Display formatted output to a user.
		System.out.printf("Accumulated value is $%3.2f", futureInvestmentValue);
		
		// Close our scanner.
		input.close();
	}

}
