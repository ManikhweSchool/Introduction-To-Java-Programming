import java.util.Scanner;

public class Exercise_4_13a {

	public static void main(String[] args) {
		
		// Create scanner 
		Scanner scanner = new Scanner(System.in);

		// Prompts a user to enter a letter.
		System.out.print("Enter a letter grade : ");
		String userInput = scanner.nextLine();
		
		
		if(userInput.length() == 1 && 
		Character.isLetter(userInput.charAt(0))){
		
			char character = Character.toLowerCase(
			userInput.charAt(0));
			
			if(character=='a' || character=='e' || character=='i' ||
			character=='o' || character=='u')
				System.out.print(userInput.charAt(0) + " is a vowel");
			else
				System.out.print(userInput.charAt(0) + " is a consonant");
			
		}
		else
			System.out.print(userInput + " is an invalid input");
		
		// Close scanner
		scanner.close();
	}

}
