import java.util.Scanner;

public class Exercise_5_50b {

	public static void main(String[] args) {
		
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a sentence : ");
		// Prompts user to enter a sentence
		String sentence = scanner.nextLine();
		
		int count = 0;
		
		for(int i = 0; i < sentence.length();i++)
			if(Character.isUpperCase(sentence.charAt(i)))
				count++;
		
		System.out.print("The number of uppercase letters " + count);
		
		// close scanner
		scanner.close();

	}

}
