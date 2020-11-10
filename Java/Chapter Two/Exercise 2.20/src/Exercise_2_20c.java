import java.util.Scanner;

public class Exercise_2_20c {

	//  http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		// Create a scanner to read user input.
		Scanner scanner = new Scanner(System.in);

		// Prompts a user to enter balance and interest rate.
		System.out.print("Enter balance and interest rate (e.g. 3 for 3%) : ");
		
		double balance = scanner.nextDouble();
		double interestRate = scanner.nextDouble();
		
		// Display interest to a console.
		System.out.printf("The interest is %2.5f", balance*(interestRate/1200));
		
		// Close our scanner.
		scanner.close();
	}

}
