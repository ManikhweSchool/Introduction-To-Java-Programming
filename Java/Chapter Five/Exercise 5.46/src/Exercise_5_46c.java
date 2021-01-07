import java.util.Scanner;

public class Exercise_5_46c {

	public static void main(String[] args) {
		
		//Create a scanner
		Scanner scanner = new Scanner(System.in);
		
		// Prompts user to enter a string
		System.out.print("Enter a string : ");
		String userInput = scanner.nextLine();
		
		System.out.print("The reversed string is ");
		
		StringBuilder stringBuilder = new StringBuilder(userInput);
		String reversedString = stringBuilder.reverse().toString();
		
		System.out.print(reversedString);
		
		// close
		scanner.close();

	}

}
