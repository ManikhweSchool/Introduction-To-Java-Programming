import java.util.Scanner;

public class Exercise_4_5b {

	public static void main(String[] args) {
		
		
		System.out.print("Enter the number of sides : ");
		
		Scanner myReader = new Scanner(System.in);
		
		double n = myReader.nextDouble();
		
		if(n<=0) {
			System.out.println("Incorrect number of sides!");
			System.exit(0);
		}
		
		System.out.print("Enter the side : ");
		double s = myReader.nextDouble();
		
		if(s<=0) {
			System.out.println("Incorrect side length!");
			System.exit(1);
		}
		
		System.out.printf("The area of the polygon is %3.2f",
		(n*Math.pow(s,2))/(4*Math.tan(Math.PI/n)));
		
		// close our scanner
		myReader.close();

	}

}
