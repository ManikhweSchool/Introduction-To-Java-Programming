import java.util.Scanner;

public class Exercise_2_17a {

	// http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the temperature in Fahrenheit between 58F and 41F : ");
		double tempInFah = scanner.nextDouble();
		
		System.out.print("Enter the wind speed (>= 2) in miles per hours : ");
		double speedInMPH = scanner.nextDouble();
		
		// First Term
		double var1 = 35.74;
		
		// Second Term
		double var2 = 0.6215*tempInFah;
		
		// Third Term
		double var3 = 35.75*Math.pow(speedInMPH, 0.16);
		
		// Forth Term
		double var4 = 0.4275*tempInFah*(Math.pow(speedInMPH,0.16));
		
		double w = var1 + (var2 - var3) + var4;
		
		System.out.printf("The wind chill index is %2.5f", w);
		
		scanner.close();
	}

}
