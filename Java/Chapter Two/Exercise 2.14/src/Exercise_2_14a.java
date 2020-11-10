import java.util.Scanner;

public class Exercise_2_14a {

	 // http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		

		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds : ");
		double wInP = myScanner.nextDouble();
		
		System.out.print("Enter height in inches : ");
		double hInI = myScanner.nextDouble();
		
		// 1 pound =  0.45359237 kilograms
		// wInP pounds = x kilograms
		double wInKil =  0.45359237*wInP;
		
		// 1 inch = 0.0254 meter
		// hInI inches = x meters
		double hInM = 0.0254*hInI;
		
		double bmi = wInKil/(hInM*hInM);
		
		System.out.printf("The BMI is %2.4f", bmi);
		
		myScanner.close();
	}

}
