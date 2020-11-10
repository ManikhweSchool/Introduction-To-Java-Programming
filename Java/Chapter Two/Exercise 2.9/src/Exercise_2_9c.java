import java.util.Scanner;

public class Exercise_2_9c {

	// Student C knows how important it is to avoid using variables unnecessarily.
	public static void main(String[] args) {
		
		// Creating a scanner
		Scanner input = new Scanner(System.in);

		double finalVelocity, initialVelocity, timeSpan;
		
		System.out.print("Enter v0, v1 and t : ");
		initialVelocity = input.nextDouble();
		finalVelocity = input.nextDouble();
		timeSpan = input.nextDouble();
		
		System.out.printf("The average acceleration is %3.4f", (finalVelocity-initialVelocity)/timeSpan);
		
		
		// Closing a scanner.
		input.close();
	}

}
