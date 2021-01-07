import java.util.Scanner;

public class Exercise_6_23a {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a word and a letter : ");
		String word = scanner.next();
		String character = scanner.next();
		
		if(character.length() != 1) {
			System.out.print("Error : Make sure a letter is a single letter.");
			System.exit(0);
		}
		
		System.out.print("The letter '" + character + "' in the word " 
		+ word + "is repeated " + 
		count(word,character.charAt(0)) + " times.");
		
		scanner.close();
	}
	
	public static int count(String word, char character) {
		
		int count = 0;
		
		for(int i = 0; i < word.length();i++)
			if(Character.toUpperCase(word.charAt(i))==
			Character.toUpperCase(character))
				count++;
		
		return count;
	}

}
