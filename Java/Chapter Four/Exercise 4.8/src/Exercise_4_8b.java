import java.util.Scanner;

public class Exercise_4_8b {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter an ASCII code : ");
		String userInput = scanner.nextLine();
		
		if(Integer.parseInt(userInput)>=0 && 
		Integer.parseInt(userInput)<=127)
			System.out.print("The character for ASCII code " + userInput + " is " + (char)(Byte.parseByte(userInput)));
		else
			System.out.print("Invalid Input");
		
		scanner.close();
	}
}
