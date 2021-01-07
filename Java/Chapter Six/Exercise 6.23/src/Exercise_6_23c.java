import java.util.Scanner;

public class Exercise_6_23c {

	// Student C will validate user input differently.
	public static void main(String[] args) {
		
		// Used to read user input.
		Scanner keyboardReader = new Scanner(System.in);
		
		System.out.print("Enter a word and a letter : ");
		String line = keyboardReader.nextLine();
		
		// Used to read each word given by the user.
		Scanner stringReader = new Scanner(line);
		
		// We initialize 'word' to avoid a compile error.
		String word = "";
		if(stringReader.hasNext())
			word = stringReader.next();
		else {
			System.out.print("Error : Make sure you enter a atleast one word.");
			System.exit(0);
		}
		
		// We initialize 'character' to avoid a compile error.
		String character = "";
		if(stringReader.hasNext()) {
			character = stringReader.next();
			if(character.length() != 1) {
				System.out.print("Error : Make sure a letter is a single letter.");
				System.exit(1);
			}
		}
		else {
			System.out.print("Error : Make sure your input doen't "
			+ "only contain a word, \n"
			+ "it must also contain a letter.");
			System.exit(2);
		}
		
		if(stringReader.hasNext()) {
			System.out.print("Error : Make sure you enter one word and letter.");
			System.exit(3);
		}
		else
			System.out.print("The letter '" + character + "' in the word " + word + "is repeated " + count(word,character.charAt(0)) + " times.");
		
		// Close Both Scanners.
		// Note the two scanners are independent.
		keyboardReader.close();
		stringReader.close();
	}
	
	// Student A chose a wrong a loop choice.
	public static int count(String word, char character) {
		
		int count = 0;
		
		for(int currentIndex = 0; currentIndex < word.length(); currentIndex++) 
			if(character == word.charAt(currentIndex))
				count++;
		return count;
	}

}
