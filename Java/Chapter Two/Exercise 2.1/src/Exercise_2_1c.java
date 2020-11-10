import java.util.Scanner;

public class Exercise_2_1c {

	// Student A did not have got names for his variables.
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		// Prompts the user to enter a temperature in celsius.
		System.out.print("Enter a degree in celsius : ");
		double temperatureInCelsius;
		
		temperatureInCelsius = scanner.nextDouble();

		
		
		System.out.printf(temperatureInCelsius + " Celsius is %2.1f Fahrenheit." , (9/5.0)*temperatureInCelsius + 32);
		
		scanner.close();
		
	}

}
