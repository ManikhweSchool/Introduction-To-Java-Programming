import java.util.Scanner;

public class Exercise_5_46a {

	public static void main(String[] args) {
		
		//Create a scanner
		Scanner scanner = new Scanner(System.in);
		
		// Prompts user to enter a string
		System.out.print("Enter a string : ");
		String userInput = scanner.nextLine();
		
		System.out.print("The reversed string is ");
		
		for(int i = userInput.length()-1;i>=0;i--)
			System.out.print(userInput.charAt(i));
		
		// close
		scanner.close();

	}

}
