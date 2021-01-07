import java.util.Scanner;

public class Exercise_5_49a {

	public static void main(String[] args) {
		
		// Create a scanner
		Scanner input = new Scanner(System.in);
				
		System.out.print("Enter a word or sentence : ");
		String word = input.nextLine();
				
		short vowels = 0;
		short consonants = 0;
				
		short index = 0;
		char currentCharacter;
		
		while(index < word.length()) {
			currentCharacter = word.charAt(index);
			if(currentCharacter=='A' || 
			currentCharacter=='E' || 
			currentCharacter=='I' || 
			currentCharacter=='O' || 
			currentCharacter=='U' || 
			currentCharacter=='a' || 
			currentCharacter=='e' || 
			currentCharacter=='i' || 
			currentCharacter=='o' || 
			currentCharacter=='u' 
			) 
				vowels++;
			
			else if(Character.isLetter(currentCharacter))
				consonants++;
			index++;
		}
		
		System.out.println("Number of vowels : " + vowels);
		System.out.println("Number of consonants : " + consonants);

		// scanner closed
		input.close();
	}

}
