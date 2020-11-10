import java.util.Scanner;

public class Exercise_4_21a {

	public static void main(String[] args) {
		
		// Create a scanner
		Scanner reader = new Scanner(System.in);
		
		// Prompts a user to enter the social security number.
		System.out.print("Enter a SSN : ");
		String ssn = reader.nextLine();
		
		boolean isValid = true;
		String invalidInput = ssn + " is an invalid";
		String validInput = ssn + " is a valid";
		String partOfMessage = " social security number.";
		
		if(ssn.length()>0) {
			if(ssn.length() != 11)
				isValid = false;
			else if(!Character.isDigit(ssn.charAt(0)))
				isValid = false;
			else if(!Character.isDigit(ssn.charAt(1)))
				isValid = false;
			else if(!Character.isDigit(ssn.charAt(2)))
				isValid = false;
			else if(ssn.charAt(3)!='-')
				isValid = false;
			else if(!Character.isDigit(ssn.charAt(4)))
				isValid = false;
			else if(!Character.isDigit(ssn.charAt(5)))
				isValid = false;
			else if(ssn.charAt(6)!='-')
				isValid = false;
			else if(!Character.isDigit(ssn.charAt(7)))
				isValid = false;
			else if(!Character.isDigit(ssn.charAt(8)))
				isValid = false;
			else if(!Character.isDigit(ssn.charAt(9)))
				isValid = false;
			else if(!Character.isDigit(ssn.charAt(10)))
				isValid = false;
			
			if(isValid) {
				validInput += partOfMessage;
				System.out.print(validInput);
			}
			else {
				invalidInput += partOfMessage;
				System.out.print(invalidInput);
			}
			
		}
		else {
			System.out.print("Make sure you enter something of the for DDD-DD-DDDD.");
		}
		
		
		// Close scanner
		reader.close();

	}

}
