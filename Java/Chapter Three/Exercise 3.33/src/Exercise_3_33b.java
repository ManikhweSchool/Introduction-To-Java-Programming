import java.util.Scanner;

public class Exercise_3_33b {

	public static void main(String[] args) {
		
		// Create scanner to read user input.
		Scanner scanner = new Scanner(System.in);

		// Prompts user to enter weight and price for package 1.
		System.out.print("Enter weight and price for package 1 : ");
		double packageOneWeight = scanner.nextDouble();
		double packageOnePrice = scanner.nextDouble();
		
		// Prompts user to enter weight and price for package 2.
		System.out.print("Enter weight and price for package 2 : ");
		double packageTwoWeight = scanner.nextDouble();
		double packageTwoPrice = scanner.nextDouble();
		
		double packageOneAnswer = packageOneWeight/packageOnePrice;
		double packageTwoAnswer = packageTwoWeight/packageTwoPrice;
		
		if(packageOneAnswer < packageTwoAnswer)
			System.out.println("Package 2 has a better price.");
		else if (packageOneAnswer>packageTwoAnswer)
			System.out.println("Package 1 has a better price.");
		else
			System.out.println("Two packages have the same price.");
		
		// Close scanner
		scanner.close();
	}

}
