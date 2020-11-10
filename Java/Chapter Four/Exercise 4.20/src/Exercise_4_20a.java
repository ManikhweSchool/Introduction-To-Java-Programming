import java.util.Scanner;

public class Exercise_4_20a {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a word or sentence : ");
		String userInput = scanner.nextLine();
		
		if(!userInput.isEmpty() && userInput.indexOf(' ')<0)
			System.out.print("The word ");
		else if (!userInput.isEmpty())
			System.out.print("The sentence ");
		
		if(!userInput.isEmpty())
		System.out.print(userInput + " has length " + userInput.length()
		+ " and the first character is " + userInput.charAt(0));
		
		scanner.close();
	}

}
