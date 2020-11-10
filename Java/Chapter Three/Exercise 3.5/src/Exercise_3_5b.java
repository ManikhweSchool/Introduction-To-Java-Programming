import java.util.Scanner;

public class Exercise_3_5b {

	// http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		// Create a scanner 
		Scanner scanner = new Scanner(System.in);
		
		// Prompts a user to enter today's day.
		System.out.print("Enter today's day : ");
		
		// Store user input.
		byte day = scanner.nextByte();
		
		if(day < 0 || day > 6) {
			System.out.print("Error : Make Sure Today's Day Is Between 0-6.");
			System.exit(0);
		}
			
		
		// Prompts the user to enter future days.
		System.out.print("Enter the number of "
		+ "days elapse since todays : ");
		
		long numberOfDays = scanner.nextLong();
		
		if(numberOfDays < 0) {
			System.out.print("Error : Make Sure Number Of Days is Positive.");
			System.exit(0);
		}
			
		
		numberOfDays %= 7;
		
		if(day == 0) {
			
			if(numberOfDays == 0)
				System.out.print("Today is Sunday "
				+ "and the future day is Sunday.");
			else if(numberOfDays == 1)
				System.out.print("Today is Sunday "
				+ "and the future day is Monday.");
			else if(numberOfDays == 2)
				System.out.print("Today is Sunday "
				+ "and the future day is Tuesday.");
			else if(numberOfDays == 3)
				System.out.print("Today is Sunday "
				+ "and the future day is Wednesday.");
			else if(numberOfDays == 4)
				System.out.print("Today is Sunday "
				+ "and the future day is Thursday.");
			else if(numberOfDays == 5)
				System.out.print("Today is Sunday "
				+ "and the future day is Friday.");
			else
				System.out.print("Today is Sunday "
				+ "and the future day is Surtaday.");
		}
	
		else if(day == 1) {
			if(numberOfDays == 0)
				System.out.print("Today is Monday "
				+ "and the future day is Monday.");
			else if(numberOfDays == 1)
				System.out.print("Today is Monday "
				+ "and the future day is Tuesday.");
			else if(numberOfDays == 2)
				System.out.print("Today is Monday "
				+ "and the future day is Wednesday.");
			else if(numberOfDays == 3)
				System.out.print("Today is Monday "
				+ "and the future day is Thursday.");
			else if(numberOfDays == 4)
				System.out.print("Today is Monday "
				+ "and the future day is Friday.");
			else if(numberOfDays == 5)
				System.out.print("Today is Monday "
				+ "and the future day is Surtaday.");
			else
				System.out.print("Today is Monday "
				+ "and the future day is Sunday.");
		}
		
		else if(day == 2) {
			if(numberOfDays == 0)
				System.out.print("Today is Tuesday "
				+ "and the future day is Tuesday.");
			else if(numberOfDays == 1)
				System.out.print("Today is Tuesday "
				+ "and the future day is Wednesday.");
			else if(numberOfDays == 2)
				System.out.print("Today is Tuesday "
				+ "and the future day is Thursday.");
			else if(numberOfDays == 3)
				System.out.print("Today is Tuesday "
				+ "and the future day is Friday.");
			else if(numberOfDays == 4)
				System.out.print("Today is Tuesday "
				+ "and the future day is Surtaday.");
			else if(numberOfDays == 5)
				System.out.print("Today is Tuesday "
				+ "and the future day is Sunday.");
			else
				System.out.print("Today is Tuesday "
				+ "and the future day is Monday.");
		}
		
		else if(day == 3) {
			if(numberOfDays == 0)
				System.out.print("Today is Wednesday "
				+ "and the future day is Wednesday.");
			else if(numberOfDays == 1)
				System.out.print("Today is Wednesday "
				+ "and the future day is Thursday.");
			else if(numberOfDays == 2)
				System.out.print("Today is Wednesday "
				+ "and the future day is Friday.");
			else if(numberOfDays == 3)
				System.out.print("Today is Wednesday "
				+ "and the future day is Surtaday.");
			else if(numberOfDays == 4)
				System.out.print("Today is Wednesday "
				+ "and the future day is Sunday.");
			else if(numberOfDays == 5)
				System.out.print("Today is Wednesday "
				+ "and the future day is Monday.");
			else
				System.out.print("Today is Wednesday "
				+ "and the future day is Tuesday.");
		}
		
		else if(day == 4) {
			if(numberOfDays == 0)
				System.out.print("Today is Thursday "
				+ "and the future day is Thursday.");
			else if(numberOfDays == 1)
				System.out.print("Today is Thursday "
				+ "and the future day is Friday.");
			else if(numberOfDays == 2)
				System.out.print("Today is Thursday "
				+ "and the future day is Surtaday.");
			else if(numberOfDays == 3)
				System.out.print("Today is Thursday "
				+ "and the future day is Sunday.");
			else if(numberOfDays == 4)
				System.out.print("Today is Thursday "
				+ "and the future day is Monday.");
			else if(numberOfDays == 5)
				System.out.print("Today is Thursday "
				+ "and the future day is Tuesday.");
			else
				System.out.print("Today is Thursday "
				+ "and the future day is Wednesday.");
		}
		
		else if(day == 5) {
			if(numberOfDays == 0)
				System.out.print("Today is Friday "
				+ "and the future day is Friday.");
			else if(numberOfDays == 1)
				System.out.print("Today is Friday "
				+ "and the future day is Surtaday.");
			else if(numberOfDays == 2)
				System.out.print("Today is Friday "
				+ "and the future day is Sunday.");
			else if(numberOfDays == 3)
				System.out.print("Today is Friday "
				+ "and the future day is Monday.");
			else if(numberOfDays == 4)
				System.out.print("Today is Friday "
				+ "and the future day is Tuesday.");
			else if(numberOfDays == 5)
				System.out.print("Today is Friday "
				+ "and the future day is Wednesday.");
			else
				System.out.print("Today is Friday "
				+ "and the future day is Thursday.");
		}
		else {
			if(numberOfDays == 0)
				System.out.print("Today is Surtaday "
				+ "and the future day is Surtaday.");
			else if(numberOfDays == 1)
				System.out.print("Today is Surtaday "
				+ "and the future day is Sunday.");
			else if(numberOfDays == 2)
				System.out.print("Today is Surtaday "
				+ "and the future day is Monday.");
			else if(numberOfDays == 3)
				System.out.print("Today is Surtaday "
				+ "and the future day is Tuesday.");
			else if(numberOfDays == 4)
				System.out.print("Today is Surtaday "
				+ "and the future day is Wednesday.");
			else if(numberOfDays == 5)
				System.out.print("Today is Surtaday "
				+ "and the future day is Thursday.");
			else
				System.out.print("Today is Surtaday "
				+ "and the future day is Friday.");
		}
			
		
		// Close our scanner.
		scanner.close();

	}

}
