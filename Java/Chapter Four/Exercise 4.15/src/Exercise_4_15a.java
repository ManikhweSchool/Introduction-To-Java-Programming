import java.util.Scanner;

public class Exercise_4_15a {

	public static void main(String[] args) {
		
		
		// Create a scanner to read user input.
		Scanner input = new Scanner(System.in);
		
		// Prompts the user to enter a number.
		System.out.print("Enter a letter : ");
		String userInput = input.nextLine();
		
		if(userInput.length() != 1) {
			System.out.print("Error : Make Sure "
			+ "You Enter Exactly One Character.");
			System.exit(0);
		}
		
		/*
		 * Used to determine the corresponding number of a letter.
		 * */
		byte number = 0;
		
		if(userInput.charAt(0)=='A' || userInput.charAt(0)=='B' 
		|| userInput.charAt(0)=='C' || userInput.charAt(0)=='a' 
		|| userInput.charAt(0)=='b' || userInput.charAt(0)=='c')
			number = 2;
		else if(userInput.charAt(0)=='D' || userInput.charAt(0)=='E' 
		|| userInput.charAt(0)=='F' || userInput.charAt(0)=='d' 
		|| userInput.charAt(0)=='e' || userInput.charAt(0)=='f')
			number = 3;
		else if(userInput.charAt(0)=='G' || userInput.charAt(0)=='H' 
		|| userInput.charAt(0)=='I' || userInput.charAt(0)=='g' 
		|| userInput.charAt(0)=='h' || userInput.charAt(0)=='i')
			number = 4;
		else if(userInput.charAt(0)=='J' || userInput.charAt(0)=='K' 
		|| userInput.charAt(0)=='L' || userInput.charAt(0)=='j' 
		|| userInput.charAt(0)=='k' || userInput.charAt(0)=='i')
			number = 5;
		else if(userInput.charAt(0)=='M' || userInput.charAt(0)=='N' 
		|| userInput.charAt(0)=='O' || userInput.charAt(0)=='m' 
		|| userInput.charAt(0)=='n' || userInput.charAt(0)=='o')
			number = 6;
		else if(userInput.charAt(0)=='P' || userInput.charAt(0)=='Q' 
		|| userInput.charAt(0)=='R' || userInput.charAt(0)=='S' 
		|| userInput.charAt(0)=='p' || userInput.charAt(0)=='q'
		|| userInput.charAt(0)=='r' || userInput.charAt(0)=='s')
			number = 7;
		else if(userInput.charAt(0)=='T' || userInput.charAt(0)=='U' 
		|| userInput.charAt(0)=='V' || userInput.charAt(0)=='t' 
		|| userInput.charAt(0)=='u' || userInput.charAt(0)=='v')
			number = 8;
		else if(userInput.charAt(0)=='W' || userInput.charAt(0)=='X' 
		|| userInput.charAt(0)=='Y' || userInput.charAt(0)=='Z' 
		|| userInput.charAt(0)=='w' || userInput.charAt(0)=='x'
		|| userInput.charAt(0)=='y' || userInput.charAt(0)=='z')
			number = 9;
		
		if(number != 0)
			System.out.print("The corresponding number is " 
		    + number + ".");
		else
			System.out.print(userInput + " is an invalid input.");
		
		// Close scanner
		input.close();

	}

}
