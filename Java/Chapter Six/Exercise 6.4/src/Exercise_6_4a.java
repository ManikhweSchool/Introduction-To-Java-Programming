import java.util.Scanner;

public class Exercise_6_4a {

	public static void main(String[] args) {
		
		// Create a scanner
		Scanner input = new Scanner(System.in);
		
		// Prompts a user to enter a number.
		System.out.print("Enter a number : ");
		int number = input.nextInt();
		
		reverse(number);
		
		// close the scanner
		input.close();

	}

	public static void reverse(int number) {
		
		String numberAsString;
		String reversedString = "";
		
		if(number > 0)
			numberAsString = String.valueOf(number);
		else {
			numberAsString = String.valueOf(Math.abs(number));
			
			// Include a negetive number when displaying.
			reversedString += "-";
		}
		
		for(int index = numberAsString.length()-1;index>=0;index--)
			reversedString += numberAsString.charAt(index);
		
		System.out.print("Number : " + 
		number + "\tReversed Number : " + reversedString);
	}
}
