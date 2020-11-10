import java.util.Scanner;

public class Exercise_3_6b {

	public static void main(String[] args) {
		
		// Create a scanner
		Scanner scanner = new Scanner(System.in);

		// Prompts the user to enter weight in pounds
		System.out.print("Enter weight in pounds : ");
		double weight = scanner.nextDouble();
		
		// Prompts the user to enter height inches.
		System.out.print("Enter feet : ");
		double heightInFeet = scanner.nextDouble();
		
		System.out.print("Enter inches : ");
		double heightInInches = scanner.nextDouble();
		
		final double KILOGRAMS_PER_POUND =  0.45359237;
		final double METERS_PER_INCH = 0.0254;
		final double METERS_PER_FEET = 0.305;
		
		double weightInKilograms = weight*KILOGRAMS_PER_POUND;
		
		// Convert height to meters.
		double heightInMetters = heightInFeet*METERS_PER_FEET + 
		heightInInches*METERS_PER_INCH;
		
		// Compute bmi
		double bmi = weightInKilograms/(Math.pow(heightInMetters, 2));
		
		System.out.printf("BMI is %2.3f\n", bmi);
		
		if(bmi < 18.5)
			System.out.print("Underweight");
		else if(bmi < 25)
			System.out.print("Normal");
		else if(bmi < 30)
			System.out.print("Overweight");
		else
			System.out.print("Obese");
		
		// Close
		scanner.close();
	}

}
