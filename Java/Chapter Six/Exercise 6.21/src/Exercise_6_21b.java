import java.util.Scanner;

public class Exercise_6_21b {

	/* The for loop on student A's solution is 
	 * inefficient because the getNumber method is 
	 * called more than once unnecessary.
	 * Secondly, the getNumber method did
	 * not take advantage of some of the methods
	 * defined in the character class.
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string : ");
		String phoneNumber = input.nextLine();
		
		String newPhoneNumber = "";
		
		for(int index = 0; index < phoneNumber.length();index++) {
			int number = getNumber(phoneNumber.charAt(index));
			if( number != -1)
				newPhoneNumber += number;
			else
				newPhoneNumber += phoneNumber.charAt(index);
		}
		
		System.out.print(newPhoneNumber);
		input.close();
	}
	
	public static int getNumber(char uppercaseLetter) {
		
		int number = -1;
		
		if(Character.isLetter(uppercaseLetter)) 
			if(Character.toUpperCase(uppercaseLetter) == 'A' ||
			Character.toUpperCase(uppercaseLetter) == 'B' ||
			Character.toUpperCase(uppercaseLetter) == 'C')
				number = 2;
			else if(Character.toUpperCase(uppercaseLetter) == 'D' ||
			Character.toUpperCase(uppercaseLetter) == 'E' ||
			Character.toUpperCase(uppercaseLetter) == 'F')
				number = 3;
			else if(Character.toUpperCase(uppercaseLetter) == 'G' ||
			Character.toUpperCase(uppercaseLetter) == 'H' ||
			Character.toUpperCase(uppercaseLetter) == 'I')
				number = 4;
			else if(Character.toUpperCase(uppercaseLetter) == 'J' ||
			Character.toUpperCase(uppercaseLetter) == 'K' ||
			Character.toUpperCase(uppercaseLetter) == 'L')
				number = 5;
			else if(Character.toUpperCase(uppercaseLetter) == 'M' ||
			Character.toUpperCase(uppercaseLetter) == 'N' ||
			Character.toUpperCase(uppercaseLetter) == 'O')
				number = 6;
			else if(Character.toUpperCase(uppercaseLetter) == 'P' ||
			Character.toUpperCase(uppercaseLetter) == 'Q' ||
			Character.toUpperCase(uppercaseLetter) == 'R' ||
			Character.toUpperCase(uppercaseLetter) == 'S')
				number = 7;
			else if(Character.toUpperCase(uppercaseLetter) == 'T' ||
			Character.toUpperCase(uppercaseLetter) == 'U' ||
			Character.toUpperCase(uppercaseLetter) == 'V')
				number = 8;
			else if(Character.toUpperCase(uppercaseLetter) == 'W' ||
			Character.toUpperCase(uppercaseLetter) == 'X' ||
			Character.toUpperCase(uppercaseLetter) == 'Y' ||
			Character.toUpperCase(uppercaseLetter) == 'Z')
				number = 9;
		
		return number;
	}

}
