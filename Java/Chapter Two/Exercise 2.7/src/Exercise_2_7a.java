import java.util.Scanner;

public class Exercise_2_7a {

	// http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int min, numOfDays, numOfYrs, remMin;
		
		System.out.print("Enter the number of minutes : ");
		min = scanner.nextInt();
		
		// 1 hour = 60 minutes => 1 day = 24*60 => 1 year = 365*24*60
		numOfYrs = min/(365*24*60);
		remMin = min%(365*24*60);
		
		// 1 day = 24*60 minutes
		numOfDays = remMin/(24*60);
		
		System.out.print(min + " minutes is approximately " 
		+ numOfYrs + " years and " + numOfDays + " days.");
		
		scanner.close();
	}

}
