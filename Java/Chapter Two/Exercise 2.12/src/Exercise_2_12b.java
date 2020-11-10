import java.util.Scanner;

public class Exercise_2_12b {
	
	// * http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter speed and acceleration : ");
		double speed = scanner.nextDouble();
		double acceleration = scanner.nextDouble();
		
		double length = speed*speed/ (2*acceleration);
		
		System.out.printf("The minimum runway length for this plane is %2.3f", length);
		
		scanner.close();
	}

}
