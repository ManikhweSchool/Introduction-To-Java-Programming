import java.util.Scanner;

public class Exercise_2_20a {

	// http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter balance and interest rate ( e.g. 3 for 3%) : ");
		
		double balance = scanner.nextDouble();
		double interestRate = scanner.nextDouble();
		
		double answer = balance*(interestRate/1200.0);
		
		System.out.print("The interest is " + answer);
		
		scanner.close();
	}

}
