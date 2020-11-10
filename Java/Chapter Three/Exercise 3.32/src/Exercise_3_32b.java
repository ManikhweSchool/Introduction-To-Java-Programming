import java.util.Scanner;

public class Exercise_3_32b {

	public static void main(String[] args) {
		
		// Create a scanner to read user input.
		Scanner scanner = new Scanner(System.in);

		// Prompts the user to enter three points.
		System.out.print("Enter three points for p0, p1 and p2 : ");
		double x0 = scanner.nextDouble();
		double y0 = scanner.nextDouble();
		
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		
		double determinant = (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);
		
		
		if(determinant > 0)
			System.out.println("(" + x2 + "," + y2 + ") "
			+"is on the left side of the line from (" +
			x0 + "," + y0 + ") to (" + x1 + "," + y1 + ")");
		else if(determinant < 0)
			System.out.println("(" + x2 + "," + y2 + ") "
			+"is on the right side of the line from (" +
			x0 + "," + y0 + ") to (" + x1 + "," + y1 + ")");
		else
			System.out.println("(" + x2 + "," + y2 + ") "
			+"is on the line from (" +
			x0 + "," + y0 + ") to (" + x1 + "," + y1 + ")");
		
		// Close scanner
		scanner.close();
	}

}
