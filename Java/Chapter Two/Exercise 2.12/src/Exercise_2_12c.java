import java.util.Scanner;

public class Exercise_2_12c {

	// * http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double speed, acceleration;
		System.out.print("Enter speed and acceleration : ");
		speed = input.nextDouble();
		acceleration = input.nextDouble();
		
		System.out.printf("The minimum runway length for this airplane is %2.3f", (Math.pow(speed, 2)/(2*acceleration)));
		
		input.close();
	}

}
