import java.util.Scanner;

public class Exercise_2_15b {

	// http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		System.out.print("Enter x1 and y1 : ");
		double x1, y1, x2, y2;
		
		Scanner reader = new Scanner(System.in);
		x1 = reader.nextDouble();
		y1 = reader.nextDouble();
		
		System.out.print("Enter x2 and y2 : ");
		x2 = reader.nextDouble();
		y2 = reader.nextDouble();
		
		double distance = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		
		System.out.print("The distance between the two points is " + distance);
		
		reader.close();
	}

}
