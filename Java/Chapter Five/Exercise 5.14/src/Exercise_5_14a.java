import java.util.Scanner;

public class Exercise_5_14a {

	public static void main(String[] args) {
		
		// Create scanner to read user input.
		Scanner scanner = new Scanner(System.in);
		
		// Prompts the user to enter two integers.
		System.out.print("Enter two integer : ");
		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();
		
		if(firstNumber==0 || secondNumber==0) {
			System.out.print(firstNumber + " and " + secondNumber
			+ " have no gcd.");
		}
		else {
			int divisor;
			boolean divisorFound = false;
			
			for(divisor = (firstNumber<secondNumber)?firstNumber:secondNumber;
			divisor>=1 && divisorFound==false;divisor--) {
				if(firstNumber%divisor==0 && secondNumber%divisor==0) {
					System.out.print("The GCD of " + firstNumber + " and " +
					secondNumber + " is " + divisor + ".");
					divisorFound = true;
				}
			}
		}
		
		// Close scanner once done with it.
		scanner.close();

	}

}
