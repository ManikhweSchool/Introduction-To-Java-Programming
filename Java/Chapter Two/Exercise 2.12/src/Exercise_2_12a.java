import java.util.Scanner;

public class Exercise_2_12a {

	// * http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter speed and acceleration : ");
		double s = sc.nextDouble();
		double a = sc.nextDouble();
		
		double l = Math.pow(s, 2)/(2*a);
		System.out.printf("The minimum runway length for this airplane is %2.3f", l);
		
		
		sc.close();
	}

}
