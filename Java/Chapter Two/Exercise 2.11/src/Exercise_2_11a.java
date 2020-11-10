import java.util.Scanner;

public class Exercise_2_11a {

	public static final int SECONDS_IN_A_MINUTE = 60;
	public static final int MINUTES_IN_AN_HOUR = 60;
	public static final int INITIAL_POPULATION = 312032486;
	
	// * http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of years : ");
		int numberOfYears = scanner.nextInt();
		
		int secInH = SECONDS_IN_A_MINUTE*MINUTES_IN_AN_HOUR;
		
		int secInD = 24*secInH;
		
		int secInY = 365*secInD;
		
		int secInYrs = secInY*numberOfYears;
		
		int numOfDeaths = (int)(secInYrs/13.0);
		int numOfBirths = secInYrs/7;
		int numOfImm = secInYrs/45;
		
		System.out.print("The population in " + numberOfYears + " years is " +
		(INITIAL_POPULATION - numOfDeaths + numOfImm + numOfBirths));
		
		scanner.close();
	}

}
