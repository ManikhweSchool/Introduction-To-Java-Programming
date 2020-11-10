import java.util.Scanner;

public class Exercise_4_11c {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a decimal value(0 to 15) : ");
		byte userInput = scanner.nextByte();
		
		if(userInput > 15 || userInput < 0) {
			System.out.print(userInput + " is an invalid input.");
			System.exit(0);
		}
		
		String toHex = "";
		
		if(userInput < 10 && userInput>=0) 
			toHex += String.valueOf(userInput);
		else 
			toHex += String.valueOf((char)(55+userInput));
		
		System.out.print("The hex value is " + toHex);
		
		scanner.close();
	}

}
