import java.util.Scanner;

public class Exercise_3_11a {

	public static void main(String[] args) {
		
		// Create a scanner to read user input.
		Scanner input = new Scanner(System.in);
		
		// Prompts the user to a month and a year.
		System.out.print("Enter month and a year : ");
		byte month = input.nextByte();
		int year = input.nextInt();
		
		if(month > 0 && month <13 && year > 0) {
			if(month==1)
				System.out.print("January " + 
				year + " had " + 31 + " days.");
			else if(month==2) {
				boolean isLeapYear = ((year%4 == 0 && year%100 != 0) 
				|| (year%400 == 0));
				System.out.print("February " + year + " had " + ((isLeapYear)?29:28) + " days.");
			}
			else if(month==3) 
				System.out.print("March " + year + " had 31 days.");
			else if(month==4) 
				System.out.print("April " + year + " had 30 days.");
			else if(month==5) 
				System.out.print("May " + year + " had 31 days.");
			else if(month==6) 
				System.out.print("June " + year + " had 30 days.");
			else if(month==7) 
				System.out.print("July " + year + " had 31 days.");
			else if(month==8) 
				System.out.print("August " + year + " had 31 days.");
			else if(month==9) 
				System.out.print("September " + year + " had 30 days.");
			else if(month==10) 
				System.out.print("October " + year + " had 31 days.");
			else if(month==11) 
				System.out.print("November " + year + " had 30 days.");
			else
				System.out.print("December " + year + " had 31 days.");
		}
		else {
			System.out.print("Error : START OVER WITH VALID INPUT.");
		}
		
		// Close our scanner
		input.close();

	}

}
