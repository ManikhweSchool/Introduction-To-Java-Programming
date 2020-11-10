import java.util.Scanner;

public class Exercise_3_28c {

	public static void main(String[] args) {
		
		// Create a scanner.
		Scanner scanner = new Scanner(System.in);
		
		double r1X, r1Y, r1Width, r1Height;
		
		// Prompts the user to enter first rectangle's values.
		System.out.println("Enter r1's x-,y-coordinates, width and height : ");
		r1X = scanner.nextDouble();
		r1Y = scanner.nextDouble();
		r1Width = scanner.nextDouble();
		r1Height = scanner.nextDouble();
		
		double r2X, r2Y, r2Width, r2Height;
		
		// Prompts the user to enter second rectangle's values.
		System.out.println("Enter r2's x-,y-coordinates, width and height : ");
		r2X = scanner.nextDouble();
		r2Y = scanner.nextDouble();
		r2Width = scanner.nextDouble();
		r2Height = scanner.nextDouble();
		
		// r2 is within r1.
		if(r2X-r2Width*0.5>=r1X-r1Width*0.5 &&
		r2X+r2Width*0.5<=r1X+r1Width*0.5 &&
		r2Y+r2Height*0.5 <= r1Y+r1Height*0.5 &&
		r2Y-r2Height*0.5 >= r1Y-r1Height*0.5 
		)
			System.out.println("r2 is inside r1.");
		// No intersection or overlap.
		else if(r2X-r2Width*0.5>r1X+r1Width*0.5 ||
		r1X-r1Width*0.5>r2X+r2Width*0.5 ||
		r1Y-r1Height*0.5>r2Y+r2Height*0.5 ||
		r2Y-r2Height*0.5>r1Y+r1Height*0.5)
			System.out.println("r2 does not overlap r1.");
		else
			System.out.println("r2 overlaps r1.");
		
		// Close scanner.
		scanner.close();
	}

}
