import java.util.Scanner;

public class Exercise_2_10c {

	public static void main(String[] args) {
		
		// Create a scanner to read user input.
		Scanner scanner = new Scanner(System.in);

		double waterWeight, 
		initialTemperature, 
		finalTemperature;
		
		System.out.print("Enter the amount of energy need : ");
		waterWeight = scanner.nextDouble();
		
		System.out.print("Enter the initail temperature : ");
		initialTemperature = scanner.nextDouble();
		
		System.out.print("Enter the final temperature : ");
		finalTemperature = scanner.nextDouble();
		
		System.out.printf("The needed is %3.1f", waterWeight*(finalTemperature-initialTemperature)*4184);
		
		// We make sure we close our scanner once we done with it.
		scanner.close();
	}

}
