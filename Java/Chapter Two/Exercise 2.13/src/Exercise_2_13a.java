import java.util.Scanner;

public class Exercise_2_13a {

	// http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the monthly saving amount : ");
		double initAmt = scanner.nextDouble();
				
		double monthlyInterestRate = 0.05/12;
		double constValue = 1+ monthlyInterestRate;
		
		double firstMonthAmount = initAmt * constValue;
		double secondMonthAmount = (initAmt + firstMonthAmount)*constValue;
		double thirdMonthAmount = (initAmt + secondMonthAmount)*constValue;
		double forthMonthAmount = (initAmt + thirdMonthAmount)*constValue;
		double fifthMonthAmount = (initAmt + forthMonthAmount)*constValue;
		double sixthMonthAmount = (initAmt + fifthMonthAmount)*constValue;
		
		System.out.printf("After the sixth month, the account value is $%2.2f", sixthMonthAmount);
		
		
		scanner.close();
	}

}
