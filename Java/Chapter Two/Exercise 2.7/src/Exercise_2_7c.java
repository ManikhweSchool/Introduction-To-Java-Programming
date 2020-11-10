import java.util.Scanner;

public class Exercise_2_7c {

	// Student C knows about the importance of using correct datatype.
	public static void main(String[] args) {
		
		// A variable that will hold user input.
		long minutes;
		
		// A variable that will hold the number of years.
		int numberOfYears;
		
		// A variable that will hold the number of days.
		int numberOfDays;
		
		/* A variable that will hold the remaining minutes 
		 * after minutes making up years have been taken.*/
		long remainingMinutes;
		
		// We create a scanner to read user input from the keyword.
		Scanner reader = new Scanner(System.in);
		
		// Prompts a user to enter number of minutes.
		System.out.print("Enter number of minutes : ");
		// Read and store user input.
		minutes = reader.nextLong();
		
		numberOfYears = (int)(minutes/(365*24*60));
		remainingMinutes = minutes%(365*24*60);
		numberOfDays = (int)(remainingMinutes/(24*60));
		
		System.out.print(minutes + " minutes is approximately " 
		+ numberOfYears + " years and " + numberOfDays + " days.");
		
		reader.close();

	}

}
