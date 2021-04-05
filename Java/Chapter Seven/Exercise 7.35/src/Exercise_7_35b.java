import java.util.Scanner;

public class Exercise_7_35b {

	public static void main(String[] args) {
		
		// All possible words a player can choose from.
		String[] words = 
			{"Lwandile","John","Steven","Candice","Mandy"};
		
		// Determine whether or not to keep playing.
		boolean keepPlaying = true;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			String currentWord = words[(int)(Math.random()*words.length)];
			byte missedCount = 0;
			boolean doneWithCurrentWord = false;
			
			String modifyableWord = "";
			
			for(int asteriskNumber = 1;
			asteriskNumber<=currentWord.length();
			asteriskNumber++) {
				modifyableWord += "*";
			}
			
			// Store user input.
			String userInput;
			
			while(doneWithCurrentWord==false) {
				System.out.print("(Guess) Enter a letter in word " 
				+ modifyableWord + '>');
				userInput = scanner.nextLine();
				
				// Validate user input.
				if(userInput.length()==1 &&
				Character.isLetter(userInput.charAt(0))) {
					char character = userInput.charAt(0);
					
					if(!contains(currentWord,character)) {
						System.out.println(character + " is not in the word.");
						missedCount++;
					}
					else {
						// Make sure the user input is not already in the word.
						if(contains(modifyableWord,character)) 
							System.out.println(character + " is already in the word.");
						else {
							modifyableWord = replaceAll(modifyableWord,currentWord,character);
							
						}
					}
					
				}
				else {
					System.err.print("Game Stopped : Invalid Input.");
					System.exit(0);
				}
				
				// We are done with the word if and only if t no more asterisks on it.
				if(!contains(modifyableWord,'*'))
					doneWithCurrentWord = true;
			}
			
			System.out.println("The word is " + currentWord + 
			". You missed " + missedCount + ((missedCount>1)?
			" times.":" time."));
			
			System.out.print("Do you want to guess another word? "
			+ "Enter y or n >");
			
			userInput = scanner.nextLine();
			
			if(userInput.length()==1 && (userInput.charAt(0)=='y'
			|| userInput.charAt(0)=='n'))
				keepPlaying = userInput.charAt(0)=='y';
			else {
				System.out.print("Error : invalid input only enter y or n.");
				System.exit(1);
			}
		
		}while(keepPlaying);
		
		scanner.close();
	}
	
	public static String replaceAll(String modifyableWord,
	String currentWord,char character) {
		char[] characters = new char[modifyableWord.length()];
        for(int i = 0; i < currentWord.length() && i < modifyableWord.length(); i++)
            characters[i] = modifyableWord.charAt(i);
        
        for(int i = 0; i < currentWord.length() && i < modifyableWord.length(); i++)
            if(currentWord.charAt(i)==character)
                characters[i] = character;
                
        String modifiedWord = "";
        
        for(int i = 0; i < characters.length; i++)
            modifiedWord += characters[i];
        
        return modifiedWord;
	}
	
	public static boolean contains(String word, char character) {
		for(int i = 0; i < word.length();i++)
            if(word.charAt(i)==character)
                return true;
        return false;
	}

}
