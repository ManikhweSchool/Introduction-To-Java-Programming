import java.util.Scanner;

public class Exercise_2_1a {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		double tempInCel;
		
		// Prompts a user to enter a temperature in celsius.
		System.out.print("Enter a degree in Celsius : ");
		tempInCel = scanner.nextDouble();
		
		// Perform conversion
		double tempInFar = ((9.0/5)*tempInCel + 32);
		
		System.out.printf(tempInCel + " Celsius is %2.1f", tempInFar);
	}

}
