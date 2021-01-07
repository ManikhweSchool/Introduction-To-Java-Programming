import java.util.Scanner;

public class Exercise_6_20b {

	public static void main(String[] args) {
		
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter word : ");
		
		
		System.out.printf("There are %d letter(s) "
		+ "on a given string", 
		countLetters(scanner.nextLine()));
		
		// close scanner
		scanner.close();
	}
	
	public static int countLetters(String word) {
		
		int count = 0;
		
		
		for(int index = 0; index < word.length();index++)
			if(Character.isLetter(word.charAt(index)))
				count++;
		return count;
	}

}
