import java.util.Scanner;

public class Exercise_5_22b {

	public static void main(String[] args) {
		
		// Create scanner
		Scanner scanner = new Scanner(System.in);

		// Enter loan amount
		System.out.print("Enter loan amount : ");
		double loanAmount = scanner.nextDouble();
		
		if(loanAmount<=0) {
			System.out.print("Error : Invalid Load Amount.");
			System.exit(0);
		}
		
		// Enter number of years
		System.out.print("Enter number of years : ");
		short numberOfYears = scanner.nextShort();
		
		if(numberOfYears<=0) {
			System.out.print("Error : Invalid Number Of Years.");
			System.exit(1);
		}
		
		// Enter annual interest rate
		System.out.print("Enter annual interest rate : ");
		double annualInterestRate = scanner.nextDouble();
		
		if(annualInterestRate<0) {
			System.out.print("Error : Invalid Annual Interest Rate");
			System.exit(2);
		}
		
		double monthlyInterestRate = annualInterestRate/1200;
		double monthlyPayment = loanAmount*monthlyInterestRate/
		(1-1/Math.pow(1+monthlyInterestRate, numberOfYears*12));
		double totalPayment = monthlyPayment*numberOfYears*12;
		
		double interest, principal;
		double balance = loanAmount;
		
		System.out.printf("Monthly Payment : %5.2f", monthlyPayment);
		System.out.printf("\nTotal Payment : %5.2f\n\n", totalPayment);
		System.out.println("Payment#\tInterest\tPrincipal\tBalance");
		
		
		for (int i = 1; i <= numberOfYears * 12; i++) {  
			interest = monthlyInterestRate * balance;  
			principal = monthlyPayment - interest;  
			balance = balance - principal;  
			System.out.printf("%d%s%5.2f%s%5.2f%s%5.2f\n",i,"\t\t",
			interest,"\t\t",principal,"\t\t",balance); 
		} 
		// Close scanner 
		scanner.close();
	}

}
