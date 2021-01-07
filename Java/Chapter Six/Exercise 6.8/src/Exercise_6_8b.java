
public class Exercise_6_8b {

	public static void main(String[] args) {
		
		double fromCelsius = 40.0;
		double fromFahreheit = 120.0;
		
		System.out.println("Celsius\t\tFahrenheit\t|\tFahrenheit\tCelsius");
		System.out.println("---------------------------------------"
		+ "---------------------------------");
		
		for(int count = 1; count <= 10; count++) {
			System.out.printf("%2.1f\t\t%2.1f\t\t"
			+ "|\t%2.1f\t\t%2.2f\n", fromCelsius,
			celsiusToFahrenheit(fromCelsius),
			fromFahreheit,fahrenheitToCelsius(fromFahreheit));
			fromFahreheit -= 10.0;
			fromCelsius -= 1.0;
		}

	}
	
	/** Convert from Celsius to Fahrenheit */ 
	public static double celsiusToFahrenheit(double celsius) {
		return (9.0 / 5) * celsius + 32;
	}

	/** Convert from Fahrenheit to Celsius */ 
	public static double fahrenheitToCelsius(double fahrenheit) {
		
		return (5.0 / 9) * (fahrenheit - 32);
	}

}
