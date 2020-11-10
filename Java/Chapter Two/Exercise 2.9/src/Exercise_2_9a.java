import java.util.Scanner;

public class Exercise_2_9a {
	
	 //http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		double initVel, finalVel, timeSpan;
		
		System.out.print("Enter v0, v1 and t :");
		initVel = input.nextDouble();
		finalVel = input.nextDouble();
		timeSpan = input.nextDouble();
		
		double avgAcc = (finalVel-initVel)/timeSpan;
		
		System.out.print("The average acceleration is " + avgAcc);
		
		input.close();
	}

}
