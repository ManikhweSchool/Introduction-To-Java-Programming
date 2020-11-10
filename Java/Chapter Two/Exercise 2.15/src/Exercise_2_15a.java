import java.util.Scanner;

public class Exercise_2_15a {

	// http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter x1 and y1 : ");
		double x1 = reader.nextDouble();
		double y1 = reader.nextDouble();
		
		System.out.print("Enter x2 and y2 : ");
		double x2 = reader.nextDouble();
		double y2 = reader.nextDouble();
		
		double withinSqaureRoot = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
		double distance = Math.pow(withinSqaureRoot, 0.5);
		
		System.out.print("The distance between two points is " + distance);
		
		reader.close();

	}

}
