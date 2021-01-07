import java.util.Scanner;

public class Exercise_5_47b {

	public static void main(String[] args) {
		
		// Create scanner to read user input.
		Scanner scanner = new Scanner(System.in);
		
		// Prompts users to enter ISBN number
		System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
		String ISBN = scanner.nextLine();
		
		boolean areAllDigits = true;
		
		if(ISBN.length()==12) {
			int characterIndex = 0;
			while(characterIndex<12 &&
			Character.isDigit(ISBN.charAt(characterIndex++))) {
				
			}
				
			if(characterIndex != 12 || !areAllDigits) {
				System.err.print(ISBN + 
				" is an invalid input.");
				System.exit(0);
			}
				
				// The determinant
				int lastDigit = 0;
				
				
				for(characterIndex = 0; characterIndex<ISBN.length();
				characterIndex++) {
					if(characterIndex%2==1) {
						lastDigit += 3*Integer.parseInt(
						String.valueOf(ISBN.charAt(characterIndex)));
					}
					else
						lastDigit += Integer.parseInt(
						String.valueOf(ISBN.charAt(characterIndex)));
				}
				
				lastDigit = lastDigit%10;
				lastDigit = 10-lastDigit;
				
				System.out.print("The ISBN-13 number is " + ISBN + 
				((lastDigit != 10)?lastDigit:0));
				
			
		}
		else {
			System.err.print(ISBN + 
			" is an invalid input.");
		}
		
		// Close scanner
		scanner.close();

	}

}
