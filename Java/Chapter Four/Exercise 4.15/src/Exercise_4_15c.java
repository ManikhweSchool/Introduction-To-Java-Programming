import java.util.Scanner;

public class Exercise_4_15c {

	public static void main(String[] args) {
			
		// Create a scanner to read user input.
		Scanner reader = new Scanner(System.in);
		
		// Prompts the user to enter a number.
		System.out.print("Enter a letter : ");
		String letter = reader.nextLine();
		
		if(letter.length() != 1) {
			System.out.print("Error : Make Sure "
			+ "You Enter Exactly One Character.");
			System.exit(0);
		}
		
		byte correspondingNumber = 0;
		
		if(letter.equalsIgnoreCase("a") || 
		letter.equalsIgnoreCase("b") || 
		letter.equalsIgnoreCase("c"))
			correspondingNumber = 2;
		
		else if(letter.equalsIgnoreCase("D") || 
		letter.equalsIgnoreCase("E") || 
		letter.equalsIgnoreCase("F"))
			correspondingNumber = 3;
		else if(letter.equalsIgnoreCase("g") || 
		letter.equalsIgnoreCase("h") || 
		letter.equalsIgnoreCase("i"))
			correspondingNumber = 4;
		else if(letter.equalsIgnoreCase("j") || 
		letter.equalsIgnoreCase("k") || 
		letter.equalsIgnoreCase("l") )
			correspondingNumber = 5;
		else if(letter.equalsIgnoreCase("M") || 
		letter.equalsIgnoreCase("N") || 
		letter.equalsIgnoreCase("O"))
			correspondingNumber = 6;
		else if(letter.equalsIgnoreCase("P") || 
		letter.equalsIgnoreCase("Q") || 
		letter.equalsIgnoreCase("R") || 
		letter.equalsIgnoreCase("S"))
			correspondingNumber = 7;
		else if(letter.equalsIgnoreCase("T") || 
		letter.equalsIgnoreCase("U") || 
		letter.equalsIgnoreCase("V"))
			correspondingNumber = 8;
		else if(letter.equalsIgnoreCase("w") || 
		letter.equalsIgnoreCase("x") || 
		letter.equalsIgnoreCase("y") || 
		letter.equalsIgnoreCase("z"))
			correspondingNumber = 9;
		
		if(correspondingNumber == 0)
			System.out.print(letter + " is an invalid input.");
			
		else
			System.out.print("The corresponding number is " 
			+ correspondingNumber + ".");
		
		// Close scanner
		reader.close();

	}

}
