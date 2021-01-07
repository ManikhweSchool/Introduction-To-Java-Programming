import java.util.Scanner;

public class Exercise_5_49b {

	public static void main(String[] args) {
		
		// Create a scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a word or sentence : ");
		String userInput = scanner.nextLine();
		
		short numberOfVowels = 0;
		short numberOfConsonants = 0;
		
		short characterIndex = 0;
		
		while(characterIndex < userInput.length()) {
			char character = userInput.charAt(characterIndex);
			if(Character.isLetter(character)) {
				switch(character) {
				case 'A' : numberOfVowels++; break;
				case 'a' : numberOfVowels++; break;
				case 'E' : numberOfVowels++; break;
				case 'e' : numberOfVowels++; break;
				case 'I' : numberOfVowels++; break;
				case 'i' : numberOfVowels++; break;
				case 'O' : numberOfVowels++; break;
				case 'o' : numberOfVowels++; break;
				case 'U' : numberOfVowels++; break;
				case 'u' : numberOfVowels++; break;
				default : numberOfConsonants++;
				}
			}
			characterIndex++;
		}
		
		System.out.println("Number of vowels : " + numberOfVowels);
		System.out.println("Number of consonants : " + numberOfConsonants);
		
		
		// Close scanner
		scanner.close();

	}

}
