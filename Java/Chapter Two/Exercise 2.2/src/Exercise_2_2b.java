import java.util.Scanner;

public class Exercise_2_2b {

	// Student B realized that student A's solution isn't commented.
	// Student B also realized that student A's output isn't what was expected.
	public static void main(String[] args) {
		
		// We first need to create a scanner in order to read user input.
		Scanner input = new Scanner(System.in);
		
		// Let create variable that will hold both the radius and the length of a cylinder.
		// We use a double data-type because out variables might have decimal points.
		double rad, len;
		
		// Prompts a user to enter a radius and a length.
		System.out.print("Enter a radius and a length : ");
		
		// Store user input.
		rad = input.nextDouble();
		len = input.nextDouble();
		
		// Declare and initialize both the area and the volume.
		double a = rad*rad*Math.PI;
		double vol = a*len;
		
		// Display area.
		System.out.println("The area is " + a);
		
		// Display volume.
		System.out.println("The volume is " + vol);
		
		// We need to close the scanner.
		input.close();
	}

}
