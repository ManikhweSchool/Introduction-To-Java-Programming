import java.util.Scanner;

public class Exercise_2_2c {

	// Student knows the importance of having descriptive variables.
	public static void main(String[] args) {
		
		// Create a scanner to read user input.
		Scanner reader = new Scanner(System.in);

		// Prompts a user to enter radius and length.
		System.out.print("Enter the radius and length of a cylinder : ");
		
		// Declare and read the length and the radius.
		double radius = reader.nextDouble();
		double length = reader.nextDouble();
		
		double area = Math.pow(radius, 2)*Math.PI;
		double volume = area*length;
		
		// Display the output.
		System.out.printf("The area is %3.4f\n", area);
		System.out.printf("The volume is %5.1f", volume);
		
		// Make sure you close a scanner.
		reader.close();
	}

}
