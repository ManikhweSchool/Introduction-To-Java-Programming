import java.util.Scanner;

public class Exercise_6_25a {

	// Student A over uses methods.
	public static void main(String[] args) {
		
		// Read user input using a scanner.
		Scanner scanner = new Scanner(System.in);
		
		// Prompts a user to enter number of milliseconds.
		System.out.print("Enter number of milliseconds : ");
		long millis = scanner.nextLong();
		
		if(millis < 0) {
			System.out.print("Error : Negetive Input.");
			System.exit(0);
		}
		
		System.out.print(millis + " convert to " + 
		convertMillis(millis));

		scanner.close();
	}
	
	public static String convertMillis(long millis) {
		
		return findHours(millis) + ":" 
		+ findMinutes(millis) + ":" +
		findSeconds(millis);
	}

	// We can calculate the number of milliseconds in an hour.
	// 1 hour is equal to 60*60000 = 3600000 milliseconds.
	public static long findHours(long millis) {
		
		return millis/3600000;
	}
	
	// We know 1 minute is equal to 60*1000 = 60000 milliseconds.
	public static long findMinutes(long millis) {
		
		return (millis%3600000)/60000;
	}
	
	// We know 1 second is equal to 1000 milliseconds.
	public static long findSeconds(long millis) {
		
		return (((millis%3600000)%60000))/1000;
	}
	
}
