import java.util.Scanner;

public class Exercise_4_15b {

	public static void main(String[] args) {
			
		// Create a scanner to read user input.
		Scanner reader = new Scanner(System.in);
		
		// Prompts the user to enter a number.
		System.out.print("Enter a letter : ");
		String userInput = reader.nextLine();
		
		if(userInput.length() != 1) {
			System.out.print("Error : Make Sure "
			+ "You Enter Exactly One Character.");
			System.exit(0);
		}
		
		char character = Character.toUpperCase(userInput.charAt(0));
		byte correspondingNumber = 0;
		
		if(character=='A' || character=='B' || character=='C')
			correspondingNumber = 2;
		else if(character=='D' || character=='E' || character=='F')
			correspondingNumber = 3;
		else if(character=='G' || character=='H' || character=='I')
			correspondingNumber = 4;
		else if(character=='J' || character=='K' || character=='L' )
			correspondingNumber = 5;
		else if(character=='M' || character=='N' || character=='O')
			correspondingNumber = 6;
		else if(character=='P' || character=='Q' || character=='R' || character=='R')
			correspondingNumber = 7;
		else if(character=='T' || character=='U' || character=='V')
			correspondingNumber = 8;
		else if(character=='W' || character=='X' 
		|| character=='Y' || character=='Z')
			correspondingNumber = 9;
		
		if(correspondingNumber == 0)
			System.out.print(userInput + " is an invalid input.");
			
		else
			System.out.print("The corresponding number is " 
			+ correspondingNumber + ".");
		
		// Close scanner
		reader.close();

	}

}
