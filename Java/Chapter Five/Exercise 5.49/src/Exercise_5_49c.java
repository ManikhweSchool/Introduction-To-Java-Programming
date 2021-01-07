import java.util.Scanner;

public class Exercise_5_49c {

	public static void main(String[] args) {
		
		// Create a scanner
		Scanner input = new Scanner(System.in);
						
		System.out.print("Enter a word or sentence : ");
		String word = input.nextLine();
						
		short vowels = 0;
		short consonants = 0;
						
		short index = 0;
		
		for(; index < word.length();index++)
			if(Character.isLetter(word.charAt(index))) {
				switch(Character.toLowerCase(word.charAt(index))) {
				case 'a' : vowels++; break;
				case 'e' : vowels++; break;
				case 'i' : vowels++; break;
				case 'o' : vowels++; break;
				case 'u' : vowels++; break;
				default : consonants++;
				}
			}
		
		System.out.println("Number of vowels : " + vowels);
		System.out.println("Number of consonants : " + consonants);
		
		// Close scanner
		input.close();

	}

}
