
public class Exercise_3_16a {

	// http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		// First find a random x coordinate from -50 to 50.
		double xCoordinate = (int)(Math.random()*101)-50;
		
		// Find a random y coordinate from -100 to 100.
		double yCoordinate = (int)(Math.random()*201)-100;
		
		System.out.printf("Random point (x,y) is : (%2.2f,%2.2f)",
		xCoordinate, yCoordinate);
		
	}

}
