import java.util.Scanner;

public class Exercise_6_21a {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string : ");
		String phoneNumber = input.nextLine();
		
		String generatedPhoneNumber = "";
		
		for(int i = 0; i < phoneNumber.length();i++)
			
			if(getNumber(phoneNumber.charAt(i)) != -1)
				generatedPhoneNumber += getNumber(phoneNumber.charAt(i));
			else
				generatedPhoneNumber += phoneNumber.charAt(i);
		
		System.out.print(generatedPhoneNumber);
		input.close();
	}
	
	public static int getNumber(char uppercaseLetter) {
		
		int convertedNumber = -1;
		
		if(Character.isLetter(uppercaseLetter)) 
			if(uppercaseLetter == 'a' || uppercaseLetter == 'A' ||
			uppercaseLetter == 'b' || uppercaseLetter == 'B' ||
			uppercaseLetter == 'c' || uppercaseLetter == 'C')
				convertedNumber = 2;
			else if(uppercaseLetter == 'd' || uppercaseLetter == 'D' ||
			uppercaseLetter == 'e' || uppercaseLetter == 'E' ||
			uppercaseLetter == 'f' || uppercaseLetter == 'F')
				convertedNumber = 3;
			else if(uppercaseLetter == 'g' || uppercaseLetter == 'G' ||
			uppercaseLetter == 'h' || uppercaseLetter == 'H' ||
			uppercaseLetter == 'i' || uppercaseLetter == 'I')
				convertedNumber = 4;
			else if(uppercaseLetter == 'j' || uppercaseLetter == 'J' ||
			uppercaseLetter == 'k' || uppercaseLetter == 'K' ||
			uppercaseLetter == 'l' || uppercaseLetter == 'L')
				convertedNumber = 5;
			else if(uppercaseLetter == 'm' || uppercaseLetter == 'M' ||
			uppercaseLetter == 'n' || uppercaseLetter == 'N' ||
			uppercaseLetter == 'o' || uppercaseLetter == 'O')
				convertedNumber = 6;
			else if(uppercaseLetter == 'p' || uppercaseLetter == 'P' ||
			uppercaseLetter == 'q' || uppercaseLetter == 'Q' ||
			uppercaseLetter == 'r' || uppercaseLetter == 'R' ||
			uppercaseLetter == 's' || uppercaseLetter == 'S')
				convertedNumber = 7;
			else if(uppercaseLetter == 't' || uppercaseLetter == 'T' ||
			uppercaseLetter == 'u' || uppercaseLetter == 'U' ||
			uppercaseLetter == 'v' || uppercaseLetter == 'V')
				convertedNumber = 8;
			else if(uppercaseLetter == 'w' || uppercaseLetter == 'W' ||
			uppercaseLetter == 'x' || uppercaseLetter == 'X' ||
			uppercaseLetter == 'y' || uppercaseLetter == 'Y' ||
			uppercaseLetter == 'y' || uppercaseLetter == 'Z')
				convertedNumber = 9;
		
		return convertedNumber;
	}

}
