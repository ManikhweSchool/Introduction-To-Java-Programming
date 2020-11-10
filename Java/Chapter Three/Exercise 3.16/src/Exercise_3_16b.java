import java.util.Scanner;

public class Exercise_3_16b {

	// http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a rectangle's width and height : ");
		double width = input.nextDouble();
		double height = input.nextDouble();
		
		if(width > 0 && height > 0) {
			double xCoordinate = Math.random()*width - width*0.5;
			double yCoordinate = Math.random()*height - height*0.5;
			
			System.out.printf("Random point of (x,y) is : "
			+ "(%3.2f,%3.2f)", xCoordinate, yCoordinate);
		}
		else
			System.out.print("Make sure the width and the "
			+ "height are positive numbers.");
		
		
		input.close();
	}

}
