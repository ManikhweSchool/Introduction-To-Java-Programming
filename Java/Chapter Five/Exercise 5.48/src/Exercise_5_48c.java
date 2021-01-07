import java.util.Scanner;

public class Exercise_5_48c {

	public static void main(String[] args) {
		
		// Create a scanner to read user input.
		Scanner scanner = new Scanner(System.in);
		// Prompts user to enter a word.
		System.out.print("Enter a word/sentence : ");
		String word = scanner.nextLine();
		
		for(int i = 0; i < word.length();i++)
			if((i+1)%2 != 0)
				System.out.print(word.charAt(i));
		
		// Close
		scanner.close();
	}

}
