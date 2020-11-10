import java.util.Scanner;

public class Exercise_2_11b {

	public static final int SECONDS_IN_A_MINUTE = 60;
	public static final int MINUTES_IN_AN_HOUR = 60;
	public static final int INITIAL_POPULATION = 312032486;
	
	// http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		final int SECONDS_IN_AN_HOUR = SECONDS_IN_A_MINUTE*MINUTES_IN_AN_HOUR;
		final int SECONDS_IN_A_DAY = 24*SECONDS_IN_AN_HOUR;
		final int SECONDS_IN_A_YEAR = 365*SECONDS_IN_A_DAY;
		
		System.out.print("Enter number of years : ");
		int years = input.nextInt();
		
		int secondsInYears = years*SECONDS_IN_A_YEAR;
		
		int numberOfBirths, numberOfDeaths, numberOfImmigrants;
		
		numberOfBirths = secondsInYears/7;
		numberOfDeaths = secondsInYears/13;
		numberOfImmigrants = secondsInYears/45;
		
		int finalPopulation = INITIAL_POPULATION 
		+ numberOfBirths + numberOfImmigrants - numberOfDeaths; 
		
		System.out.print("The population in " +
		years + " years is " + finalPopulation + ".");
		
		input.close();
	}

}
