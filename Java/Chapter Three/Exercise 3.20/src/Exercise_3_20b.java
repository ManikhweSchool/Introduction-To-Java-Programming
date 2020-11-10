import java.util.Scanner;

public class Exercise_3_20b {

	// http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		// Create a scanner
		Scanner scanner = new Scanner(System.in);
		
		// Prompts the user to enter temperature.
		System.out.print("Enter the temperature "
		+ "\nin Fahrenheit between - 58F and 41F :");
		
		double temperatureInFahrenheit = scanner.nextDouble();
		
		if(temperatureInFahrenheit <= 41 
		&& temperatureInFahrenheit>=-58) {
			
			// Prompts the user to enter a wind speed.
			System.out.print("Enter the wind speed(>=2) "
			+ "in miles per hour");
			double speedInMilesPerHour = scanner.nextDouble();
			
			if(speedInMilesPerHour >= 2) {
				
				/* twc = 35.74 + 0.6215ta 
				- 35.75v^0.16 + 0.4275tav^0.16*/
				
				double windChillTemperature = 
				35.74 + 0.6215*temperatureInFahrenheit 
				- 35.75*Math.pow(speedInMilesPerHour, 0.16) 
				+ 0.4275*temperatureInFahrenheit*Math.pow(speedInMilesPerHour, 
				0.16); 
				
				System.out.printf("The wind chill index is %2.5f", 
				windChillTemperature);
				
			}
			else {
				System.out.print("Error : "
				+ "Make sure the wind speed is "
				+ "greather than or equals to 2.");
				System.exit(0);
			}
		}
		else {
			System.out.print("Error : "
			+ "Make sure the temperature is "
			+ "between 58F and 41F.");
			System.exit(1);
		}
			
		
		// Close scanner
		scanner.close();
	}

}
