import java.util.Scanner;

public class Exercise_2_14b {

	public static void main(String[] args) {
		
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		double weightInPounds;
		double heightInInches;
		
		System.out.print("Enter weight in pounds : ");
		weightInPounds = scanner.nextDouble();
		
		System.out.print("Enter height in inches : ");
		heightInInches = scanner.nextDouble();
		
		// 1 pound = 0.45359237 kilogram
		// weightInPounds pounds = x kilograms
		double weightInKilograms = 0.45359237*weightInPounds;
		
		double heightInMeters = 0.0254*heightInInches;
		
		double bmi = weightInKilograms/Math.pow(heightInMeters, 2);
		
		System.out.printf("BMI is %2.4f", bmi);
		
		scanner.close();

	}

}
