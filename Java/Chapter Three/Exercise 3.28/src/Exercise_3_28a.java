import java.util.Scanner;

public class Exercise_3_28a {

	public static void main(String[] args) {
		
		// Create a scanner.
		Scanner scanner = new Scanner(System.in);

		// Prompts the user to enter first rectangles attributes.
		System.out.print("Enter r1's center x-,y-coordinates, "
		+ "width and height : ");
		// Store user input to corresponding r1 variables.
		double r1XCoordinate = scanner.nextDouble();
		double r1YCoordinate = scanner.nextDouble();
		double r1Width = scanner.nextDouble();
		double r1Height = scanner.nextDouble();
		
		final double R1_LEFT_BOUNDARY = r1XCoordinate - r1Width*0.5;
		final double R1_RIGHT_BOUNDARY = r1XCoordinate + r1Width*0.5;
		final double R1_TOP_BOUNDARY = r1YCoordinate + r1Height*0.5;
		final double R1_BOTTOM_BOUNDARY = r1YCoordinate - r1Height*0.5;
		
		// Prompts the user to enter first rectangles attributes.
		System.out.print("Enter r2's center x-,y-coordinates, "
		+ "width and height : ");
		// Store user input to corresponding r1 variables.
		double r2XCoordinate = scanner.nextDouble();
		double r2YCoordinate = scanner.nextDouble();
		double r2Width = scanner.nextDouble();
		double r2Height = scanner.nextDouble();

		final double R2_LEFT_BOUNDARY = r2XCoordinate - r2Width*0.5;
		final double R2_RIGHT_BOUNDARY = r2XCoordinate + r2Width*0.5;
		final double R2_TOP_BOUNDARY = r2YCoordinate + r2Height*0.5;
		final double R2_BOTTOM_BOUNDARY = r2YCoordinate - r2Height*0.5;
		
		/* Only two vertical boundaries one from r1 
		and another from r2 touch each other.*/
		if((
			(R1_RIGHT_BOUNDARY==R2_LEFT_BOUNDARY || 
			R1_LEFT_BOUNDARY==R2_RIGHT_BOUNDARY) 
			&& 			
			(
				(R2_TOP_BOUNDARY>=R1_BOTTOM_BOUNDARY &&
				R2_BOTTOM_BOUNDARY<=R1_TOP_BOUNDARY) 
				||	
				(R1_TOP_BOUNDARY>=R2_BOTTOM_BOUNDARY &&
				R1_BOTTOM_BOUNDARY<=R2_TOP_BOUNDARY)
			)
		))
			System.out.println("r2 overlaps r1.");
		/* The left or right boundary of one rectangle 
		 * is within the other rectangle.*/
		else if(
			((R2_LEFT_BOUNDARY<R1_RIGHT_BOUNDARY && 
			R2_LEFT_BOUNDARY>R1_LEFT_BOUNDARY &&
			R2_RIGHT_BOUNDARY>R1_RIGHT_BOUNDARY)
			||
			(R1_LEFT_BOUNDARY<R2_RIGHT_BOUNDARY &&
			R1_LEFT_BOUNDARY>R2_LEFT_BOUNDARY &&
			R1_RIGHT_BOUNDARY>R2_RIGHT_BOUNDARY))
			&&
			((R1_TOP_BOUNDARY>=R2_TOP_BOUNDARY &&
			R1_TOP_BOUNDARY>R2_BOTTOM_BOUNDARY &&
			R1_BOTTOM_BOUNDARY<=R2_BOTTOM_BOUNDARY &&
			R1_BOTTOM_BOUNDARY<R2_TOP_BOUNDARY)
			||
			(R2_TOP_BOUNDARY>=R1_TOP_BOUNDARY &&
			R2_TOP_BOUNDARY>R1_BOTTOM_BOUNDARY &&
			R2_BOTTOM_BOUNDARY<=R1_BOTTOM_BOUNDARY &&
			R2_BOTTOM_BOUNDARY<R1_TOP_BOUNDARY)
			||
			(R2_BOTTOM_BOUNDARY==R1_BOTTOM_BOUNDARY &&
			R1_TOP_BOUNDARY==R2_TOP_BOUNDARY)
			)
		)
			System.out.println("r2 overlaps r1.");
		/* The top or bottom boundary of one rectangle 
		 * is within the other rectangle.*/
		else if(
			(R1_BOTTOM_BOUNDARY<=R2_TOP_BOUNDARY &&
			R1_BOTTOM_BOUNDARY>=R2_BOTTOM_BOUNDARY &&
			R1_TOP_BOUNDARY>R2_TOP_BOUNDARY &&
			R1_LEFT_BOUNDARY<R2_LEFT_BOUNDARY &&
			R1_LEFT_BOUNDARY<R2_RIGHT_BOUNDARY &&
			R1_RIGHT_BOUNDARY>R2_LEFT_BOUNDARY &&
			R1_RIGHT_BOUNDARY>R2_RIGHT_BOUNDARY)
			||
			(R2_BOTTOM_BOUNDARY<=R1_TOP_BOUNDARY &&
			R2_BOTTOM_BOUNDARY>=R1_BOTTOM_BOUNDARY &&
			R2_TOP_BOUNDARY>R1_TOP_BOUNDARY &&
			R2_LEFT_BOUNDARY<R1_LEFT_BOUNDARY &&
			R2_LEFT_BOUNDARY<R1_RIGHT_BOUNDARY &&
			R2_RIGHT_BOUNDARY>R1_LEFT_BOUNDARY &&
			R2_RIGHT_BOUNDARY>R1_RIGHT_BOUNDARY)
			||
			(R1_BOTTOM_BOUNDARY<=R2_TOP_BOUNDARY &&
			R1_BOTTOM_BOUNDARY>=R2_BOTTOM_BOUNDARY &&
			R1_TOP_BOUNDARY>R2_TOP_BOUNDARY &&
			R1_LEFT_BOUNDARY>R2_LEFT_BOUNDARY &&
			R1_LEFT_BOUNDARY<R2_RIGHT_BOUNDARY &&
			R1_RIGHT_BOUNDARY>R2_LEFT_BOUNDARY &&
			R1_RIGHT_BOUNDARY<R2_RIGHT_BOUNDARY)
			||
			(R2_BOTTOM_BOUNDARY<=R1_TOP_BOUNDARY &&
			R2_BOTTOM_BOUNDARY>=R1_BOTTOM_BOUNDARY &&
			R2_TOP_BOUNDARY>R1_TOP_BOUNDARY &&
			R2_LEFT_BOUNDARY>R1_LEFT_BOUNDARY &&
			R2_LEFT_BOUNDARY<R1_RIGHT_BOUNDARY &&
			R2_RIGHT_BOUNDARY>R1_LEFT_BOUNDARY &&
			R2_RIGHT_BOUNDARY<R1_RIGHT_BOUNDARY)
		)
			System.out.println("r2 overlaps r1.");
		/* The bottom or top boundary of one rectangle 
		 * is within the other rectangle and also the 
		 * left or right boundary of that rectangle 
		 * is within the other rectangle.*/
		else if(
			(	(R1_BOTTOM_BOUNDARY<=R2_TOP_BOUNDARY &&
				R1_BOTTOM_BOUNDARY>=R2_BOTTOM_BOUNDARY &&
				R1_TOP_BOUNDARY>R2_TOP_BOUNDARY)
				&&
				((R1_LEFT_BOUNDARY<=R2_RIGHT_BOUNDARY &&
				R1_LEFT_BOUNDARY>=R2_LEFT_BOUNDARY &&
				R1_RIGHT_BOUNDARY>R2_RIGHT_BOUNDARY)
				||
				(R1_LEFT_BOUNDARY<R2_LEFT_BOUNDARY &&
				R1_RIGHT_BOUNDARY<=R2_RIGHT_BOUNDARY &&
				R1_RIGHT_BOUNDARY>=R2_LEFT_BOUNDARY))
				
			)
			||
			(
				(R2_BOTTOM_BOUNDARY<=R1_TOP_BOUNDARY && 
				R2_BOTTOM_BOUNDARY>=R1_BOTTOM_BOUNDARY &&
				R2_TOP_BOUNDARY>R1_TOP_BOUNDARY)
				&&
				(
				(R2_LEFT_BOUNDARY<=R1_RIGHT_BOUNDARY &&
				R2_LEFT_BOUNDARY>=R1_LEFT_BOUNDARY &&
				R2_RIGHT_BOUNDARY>R1_RIGHT_BOUNDARY)
				||
				(R2_LEFT_BOUNDARY<R1_LEFT_BOUNDARY &&
				R2_RIGHT_BOUNDARY<=R1_RIGHT_BOUNDARY &&
				R2_RIGHT_BOUNDARY>=R1_LEFT_BOUNDARY)
				)
			)
		)
			System.out.println("r2 overlaps r1.");
		/* The bottom or top boundary of one rectangle 
		 * is within the other rectangle and also the 
		 * left and right boundaries of that rectangle 
		 * are within the other rectangle.*/
		else if(
			(((R2_LEFT_BOUNDARY<R1_RIGHT_BOUNDARY && 
			R2_LEFT_BOUNDARY>=R1_LEFT_BOUNDARY &&
			R2_RIGHT_BOUNDARY<=R1_RIGHT_BOUNDARY &&
			R2_RIGHT_BOUNDARY>R1_LEFT_BOUNDARY)
			&&
			(R1_BOTTOM_BOUNDARY>=R2_BOTTOM_BOUNDARY &&
			R1_BOTTOM_BOUNDARY<R2_TOP_BOUNDARY &&
			R1_TOP_BOUNDARY<=R2_TOP_BOUNDARY &&
			R1_TOP_BOUNDARY>R2_BOTTOM_BOUNDARY))
			)
			||
			((R2_BOTTOM_BOUNDARY>=R1_BOTTOM_BOUNDARY &&
			R2_BOTTOM_BOUNDARY<R1_TOP_BOUNDARY &&
			R2_TOP_BOUNDARY<=R1_TOP_BOUNDARY &&
			R2_TOP_BOUNDARY>R1_BOTTOM_BOUNDARY)
			&&
			(R2_RIGHT_BOUNDARY>=R1_RIGHT_BOUNDARY &&
			R2_RIGHT_BOUNDARY>R1_LEFT_BOUNDARY &&
			R2_LEFT_BOUNDARY<=R1_LEFT_BOUNDARY &&
			R2_LEFT_BOUNDARY<R1_RIGHT_BOUNDARY)
			)
		)
			System.out.println("r2 overlaps r1.");
		// Deal with r2 being within r1.
		else if(
			R2_LEFT_BOUNDARY>=R1_LEFT_BOUNDARY &&
			R2_RIGHT_BOUNDARY<=R1_RIGHT_BOUNDARY &&
			R2_TOP_BOUNDARY<=R1_TOP_BOUNDARY &&
			R2_BOTTOM_BOUNDARY>=R1_BOTTOM_BOUNDARY
		)
			System.out.println("r2 is inside r1.");
		// The last choice.
		else
			System.out.println("r2 does not overlap r1.");
			
		// Close scanner.
		scanner.close();
	}

}
