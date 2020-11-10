import java.util.Scanner;

public class Exercise_2_13b {

	public static double OUR_CONSTANT = 1.00417;
	
	// http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		Scanner input;
		double initialAmount;
		
		System.out.print("Enter a monthly saving amount : ");
		
		input = new Scanner(System.in);
		initialAmount = input.nextDouble();
		
		double firstMonthAmount = initialAmount*OUR_CONSTANT;
		double secondMonthAmount = (initialAmount + firstMonthAmount)*OUR_CONSTANT;
		double thirdMonthAmount = (initialAmount + secondMonthAmount)*OUR_CONSTANT;
		double forthMonthAmount = (initialAmount + thirdMonthAmount)*OUR_CONSTANT;
		double fifthMonthAmount = (initialAmount + forthMonthAmount)*OUR_CONSTANT;
		double sixthMonthAmount = (initialAmount + fifthMonthAmount)*OUR_CONSTANT;
		
		System.out.printf("After the sixth month, the accont value is $%2.2f", sixthMonthAmount);
		
		input.close();
	}

}
