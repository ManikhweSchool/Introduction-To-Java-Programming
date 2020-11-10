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
		
		// Close scanner 
		scanner.close();
	}

}
