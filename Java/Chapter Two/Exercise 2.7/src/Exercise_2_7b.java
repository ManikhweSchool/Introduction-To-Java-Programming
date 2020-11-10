import java.util.Scanner;

public class Exercise_2_7b {

	// Student B realize that importance of readable/descriptive variable names.
	public static void main(String[] args) {
		
		int minutes;
		int numberOfYears;
		int numberOfDays;
		int remainingMinutes;
		
		Scanner scanner = new Scanner(System.in);

		// Prompts a user to enter number of minutes.
		System.out.print("Enter number of minutes : ");
		minutes = scanner.nextInt();
		
		numberOfYears = minutes/525600;
		remainingMinutes = minutes%525600;
		numberOfDays = remainingMinutes/1440;
		
		System.out.print(minutes + " minutes is approximately " 
		+ numberOfYears + " years and " + numberOfDays + " days.");
		
		scanner.close();
	}

}
