import java.util.Scanner;

public class Exercise_4_1b {

	public static void main(String[] args) {
		
		// Create a scanner 
		Scanner input = new Scanner(System.in);
		
		double r, s;
		
		System.out.print("Enter the length(>0) "
		+ "from the center to a vertex :");
		r = input.nextDouble();
		
		if(r>0) {
			// Calculate s
			s = 2*r*Math.sin(Math.PI/5);
			
			System.out.printf("The area of the pentagon is %4.2f", 5*Math.pow(s, 2)/(Math.tan(Math.PI/5)*4));
		}
		else
			System.out.print("Radius cannot be less or equal to zero.");
		
		// close scanner.
		input.close();

	}

}
