import java.util.Scanner;

public class Exercise_2_9b {

	//http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	// Student B noticed that student A has a solution that is hard to read.
	public static void main(String[] args) {

		// Create a scanner
		Scanner scanner = new Scanner(System.in);
		
		double finalVelocity;
		double initialVelocity;
		double timeSpan;
		
		System.out.print("Enter v0, v1 and t : ");
		
		initialVelocity = scanner.nextDouble();
		finalVelocity = scanner.nextDouble();
		timeSpan = scanner.nextDouble();
		
		double averageAcceleration = (finalVelocity-initialVelocity)/timeSpan;
		
		System.out.printf("The average acceleration is %2.4f", averageAcceleration);
		
		// Close the scanner.
		scanner.close();
	}

}
