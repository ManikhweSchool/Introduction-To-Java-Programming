import java.util.Scanner;

public class Exercise_4_4a {

	public static void main(String[] args) {
		
		
		// Create scanner.
		Scanner scanner = new Scanner(System.in);
		
		// Prompts the user to enter a side.
		System.out.print("Enter a side(>0) : ");
		double s = scanner.nextDouble();
		
		if(s>=0) {
			
			System.out.printf("The area of the hexagon is %2.2f", 
			(6*Math.pow(s, 2))/(4*Math.tan(Math.PI/6)));
		}
		
		// close scanner
		scanner.close();

	}

}
