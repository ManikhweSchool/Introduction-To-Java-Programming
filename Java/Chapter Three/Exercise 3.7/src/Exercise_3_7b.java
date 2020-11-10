import java.util.Scanner;

public class Exercise_3_7b {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Receive the amount.
		System.out.print("Enter an amount in with a decimal point, "
		+ "for example 11.56 : ");
		double amount = scanner.nextDouble();
		
		int remainingAmount = (int)(amount*100);
		
		// Find the number of one dollars.
		int numberOfDollars = remainingAmount/100;
		remainingAmount %= 100;
		
		// Find the number of quarters in the remaining amount.
		int numberOfQuarters = remainingAmount/25;
		remainingAmount %= 25;
		
		// Find the number of dimes in the remaining amount.
		int numberOfDimes = remainingAmount/10;
		remainingAmount %= 10;
		
		// Find the number of nickels in the remaining amount.
		int numberOfNickels = remainingAmount/5;
		remainingAmount = remainingAmount%5;
		
		// Display the result.
		System.out.println("Your amount " + amount + " consist of ");
		
		if(numberOfDollars > 1)
			System.out.println(numberOfDollars + " dollars.");
		else if(numberOfDollars == 1)
			System.out.println(numberOfDollars + " dollar.");
		
		if(numberOfQuarters > 1)
			System.out.println(numberOfQuarters + " quaters.");
		else if(numberOfQuarters==1)
			System.out.println(numberOfQuarters + " quater.");
		
		if(numberOfDimes > 1)
			System.out.println(numberOfDimes + " dimes.");
		else if(numberOfDimes==1)
			System.out.println(numberOfDimes + " dime.");
		
		if(numberOfNickels > 1)
			System.out.println(numberOfNickels + " nickels.");
		else if(numberOfNickels == 1)
			System.out.println(numberOfNickels + " nickel.");
		
		if(remainingAmount > 1)
			System.out.println(remainingAmount + " pennies.");
		else if(remainingAmount == 1)
			System.out.println(remainingAmount + " penny.");
		
		// Close scanner
		scanner.close();

	}

}
