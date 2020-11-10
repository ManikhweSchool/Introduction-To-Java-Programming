import java.util.Scanner;

public class Exercise_2_17c {

	// http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the temperature in Fahreheit between -58F and 41F : ");
		double temperatureInFahrenheit = scanner.nextDouble();
		
		System.out.print("Enter the wind speed(>= 2) : ");
		double speedInMPH = scanner.nextDouble();

		System.out.printf("The wind chill index is %3.5f", 35.74 + 
				(0.6215*temperatureInFahrenheit-35.75*Math.pow(speedInMPH, 0.16))
				+ (0.4275*temperatureInFahrenheit*Math.pow(speedInMPH, 0.16)));
		
		scanner.close();
	}

}
