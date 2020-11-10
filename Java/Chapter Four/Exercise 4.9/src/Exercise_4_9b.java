import java.util.Scanner;

public class Exercise_4_9b {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		// Prompts a user to enter an ASCII code
		System.out.print("Enter a character : ");
		String userInput = scanner.nextLine();
		
		if(userInput.length()==1 && 
		Character.isLetter(userInput.charAt(0)))
			System.out.print((('A' + (userInput.charAt(0)))-65));
		else {
			System.out.println("Invalid Input");
		}
		
		scanner.close();
	}

}
