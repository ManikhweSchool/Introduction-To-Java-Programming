import java.util.Scanner;

public class Exercise_6_7a {

	public static void main(String[] args) {
		
		// Create a scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("The amount invested : ");
		double investmentAmount = scanner.nextDouble();
		System.out.print("Annual interest rate : ");
		double annualInterestRate = scanner.nextDouble()/100;
		
		investmentValue(investmentAmount,annualInterestRate/12,30);
		
		// close scanner
		scanner.close();

	}
	
	public static double investmentValue(double investmentAmount, 
	double monthlyInterestRate, int years) {
		
		double investmentValue = 0;
		int year = 0;
		
		System.out.println("Years\t\tFuture Value");
		
		for(year += 1; year <= years;year++) {
			investmentValue = investmentAmount*Math.pow(
			(1+monthlyInterestRate),year*12);
			System.out.printf("%d\t\t%3.2f\n", year,investmentValue);
		}
		
		return investmentValue;
	}

}
