import java.util.Scanner;

public class Exercise_2_11c {

	// http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		final int SECONDS_IN_AN_HOUR = 3600;
		final int SECONDS_IN_A_DAY = 24*SECONDS_IN_AN_HOUR;
		final int SECONDS_IN_A_YEAR = 365*SECONDS_IN_A_DAY;
		final int INITIAL_POPULATION_SIZE = 312032486;
		
		int numberOfYears;
		System.out.print("Enter number of years : ");
		numberOfYears = new Scanner(System.in).nextInt();
		int totalSeconds = numberOfYears*SECONDS_IN_A_YEAR;
		
		int finalPopulationSize = INITIAL_POPULATION_SIZE;
		
		// Add all new born people/kids into the current population size.
		finalPopulationSize += totalSeconds/7;
		
		// Add all immigrants into the current population size.
		finalPopulationSize += totalSeconds/45;
		
		// Remove all people who died in the given period.
		finalPopulationSize -= totalSeconds/13;
		
		System.out.print("The population in " + 
		numberOfYears + ((numberOfYears==1)? " year is " : " years is ") + finalPopulationSize);
		
		
	}
	
}
