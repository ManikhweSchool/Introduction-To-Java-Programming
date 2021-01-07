import java.util.Scanner;

public class Exercise_6_5a {

	public static void main(String[] args) {
		
		// Create a scanner
		Scanner scanner = new Scanner(System.in);
		
		// Prompts user to enter three numbers.
		System.out.print("Enter three "
		+ "numbers(number1 number2 number3) :");
		double number1 = scanner.nextDouble();
		double number2 = scanner.nextDouble();
		double number3 = scanner.nextDouble();
		
		displaySortedNumbers(number1,number2,number3);
		
		// Close scanner
		scanner.close();

	}
	
	public static void displaySortedNumbers( double num1, 
	double num2, double num3) {
		
		if(num1<num2) {
			if(num1<num3)
				System.out.print(num1 + "\t" + ((num2<num3)?num2 + 
				"\t" + num3:num3+ "\t" + num2) );
			else
				System.out.print(num3 + "\t" + num1 + "\t" + num2);
		}
		else if(num2<num1) {
			if(num2<num3)
				if(num1<num3)
					System.out.print(num2 + "\t" + ((num1<num3)?num1 + 
					"\t" + num3:num3+ "\t" + num1) );
				else
					System.out.print(num3 + "\t" + num2 + "\t" + num1);
				
		}
		else {
			if(num2 < num3)
				System.out.print(num1 + "\t" + num2 + "\t" + num2);
			else
				System.out.print(num3 + "\t" + num1 + "\t" + num2);
		}
		
	}

}
