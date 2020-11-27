import java.util.Scanner;

public class Exercise_5_21b {

	public static void main(String[] args) {
		
		// Create a scanner
		Scanner scanner = new Scanner(System.in);

		// Obtain monthly interest rate
		double monthlyInterestRate;
		
		// Enter loan amount
		System.out.print("Loan Amount : ");
		double amount = scanner.nextDouble();
		
		if(amount<0) {
			System.out.print("Error : Amount Can't Be Negetive.");
			System.exit(0);
		}
		
		// Enter number of years
		System.out.print("Number of year : ");
		short years = scanner.nextShort();
		
		if(years<0) {
			System.out.print("Error : Invalid number of years.");
			System.exit(1);
		}
		
		double monthlyPayment;
		double totalPayment;
		double annualInterestRate = 5.0;
		
		System.out.println("Interest Rate\tMonthly Payment\tTotal Payment\n");
		
		while(annualInterestRate <=8) {
			monthlyInterestRate = annualInterestRate/1200;
			monthlyPayment = amount*monthlyInterestRate/
			(1-1/Math.pow(1+monthlyInterestRate, years*12));
			totalPayment = monthlyPayment*years*12;
			
			System.out.printf("%5.3f%s\t\t%6.2f\t\t%5.2f\n", annualInterestRate, "%",
			monthlyPayment,totalPayment);
			annualInterestRate += 0.125;
		}
		
		// Close scanner
		scanner.close();
	}

}
