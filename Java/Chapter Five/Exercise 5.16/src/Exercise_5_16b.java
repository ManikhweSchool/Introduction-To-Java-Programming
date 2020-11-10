import java.util.Scanner;

public class Exercise_5_16b {

	public static void main(String[] args) {
		
		// Create a scanner to read user input.
		Scanner input = new Scanner(System.in);
		
		// Prompts the user to enter a number.
		System.out.print("Enter a number : ");
		int number = input.nextInt();
		
		if(number==-1 || number==1) {
			System.out.print("Your Input Value Isn't Allowed");
			System.exit(0);
		}
		
		int product = 1;
		int divisor = 2;
		
		String factors = "";
		
		int positiveOriginalNumber = Math.abs(number);
		
		while(product < positiveOriginalNumber && divisor<Math.sqrt(number)) {
			if(number%divisor==0) {
				factors += divisor + ",";
				number /= divisor;
				product *= divisor;
			}
			else
				divisor++;
		}
		factors += number;
		
		System.out.print("The factors of " + positiveOriginalNumber + " are " +
		factors + ".");
		
		// Close our scanner
		input.close();
	}

}
