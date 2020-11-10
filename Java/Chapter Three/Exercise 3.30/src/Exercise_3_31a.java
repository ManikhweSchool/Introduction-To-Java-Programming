import java.util.Scanner;

public class Exercise_3_31a {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

		// Prompts the user to enter exchange rate.
		System.out.print("Enter the exchange rate from dollars to RMB : ");
		double exchangeRate = scanner.nextDouble();
		
		// Prompts the user to enter 0 or 1.
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa : ");
		int zeroOrOne = scanner.nextInt();
		
		if(zeroOrOne == 0 || zeroOrOne==1) {
			
			// Store the amount to be converted.
			double amount;
			
			if(zeroOrOne==0)
				System.out.print("Enter the dollar amount : ");
			else
				System.out.print("Enter the RMB amount : ");
			
			amount = scanner.nextDouble();
			
			double convertedAmount;
			
			if(zeroOrOne==0) {
				convertedAmount = amount*exchangeRate;
				System.out.print("$" + amount + " is " + convertedAmount + " yuan.");
			}
			else {
				convertedAmount = amount/exchangeRate;
				System.out.print(amount + " yuan is $" + convertedAmount);
			}
			
		}
		
		else
			System.out.print("Error : Make Sure You Enter Zero Or One.");
		
		scanner.close();
	}

}
