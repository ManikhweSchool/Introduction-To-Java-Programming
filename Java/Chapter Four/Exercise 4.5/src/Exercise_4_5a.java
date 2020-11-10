import java.util.Scanner;

public class Exercise_4_5a {

	public static void main(String[] args) {
		
		
		// Create a scanner.
		Scanner reader = new Scanner(System.in);
		
		// Prompts the user to enter number of sides.
		System.out.print("Enter number of sides : ");
		int n = reader.nextInt();
		
		if(n<=0)System.out.print("Error : Invalid number of sides.");
		else {
			// Prompts the user to enter the length of all sides.
			System.out.print("Enter the side : ");
			double s = reader.nextDouble();
			
			if(s<=0)System.out.print("Error : Invalid number side length.");
			else {
				double numerator = n*Math.pow(s, 2);
				double denominator = (4*Math.tan(Math.PI/n));
				
				double area = numerator/denominator;
				
				System.out.println("The area of the polygon is " + area);
			}
		}
		
		// Close my reader.
		reader.close();

	}

}
