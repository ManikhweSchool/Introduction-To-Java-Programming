import java.util.Scanner;

public class Exercise_4_17a {

	public static void main(String[] args) {
		
		
		// Prompts the user to enter a year.
		System.out.print("Enter a year : ");
		
		// Create a scanner to read user input.
		Scanner myScanner = new Scanner(System.in);
		
		// Store user input.
		int year = myScanner.nextInt();
		
		// Make sure year isn't negative.
		if(year <= 0) {
			System.out.print("Application Terminated : "
			+ "Make Sure Year Is A Positive Number.");
			System.exit(0);
		}
		
		
		System.out.print("Enter a month : ");
		String month = myScanner.nextLine();
	
		
		if(month.length() != 3) {
			System.out.print("Application Terminated : "
			+ "Make Sure Month Has Three Letters.");
			System.exit(1);

		}
			
		int numberOfDays = 0;
		
		if(month.equals("Jan") || month.equals("Mar") || 
		month.equals("May") || month.equals("Jul") || 
		month.equals("Aug") || month.equals("Oct") || 
		month.equals("Dec"))
			numberOfDays = 31;
		else if(month.equals("Feb"))
			if((year%4==0 && year%100 != 0) || (year%400==0))
				numberOfDays = 29;
			else
				numberOfDays = 28;
		else if(month.equals("Apr") || month.equals("Jun") || 
		month.equals("Sep") || month.equals("Nov"))
			numberOfDays = 30;
		
		if(numberOfDays != 0)
			System.out.print(month + " " 
			+ year + " has " + numberOfDays + " days.");
		else
			System.out.print("There is no month starting with " 
			+ month + ".");
		
		// Close scanner
		myScanner.close();
	}

}
