import java.util.Scanner;

public class Exercise_4_11a {

	public static void main(String[] args) {
		
		
		// Create scanner 
		Scanner input = new Scanner(System.in);
		
		// Prompts the user to enter a decimal number.
		System.out.print("Enter a decimal value(0 to 15) : ");
		int decimalValue = input.nextInt();
		
		String hexValue;
		
		if(decimalValue>=0 && decimalValue<=15) {
			
			switch(decimalValue) {
			case 1 : hexValue = "1";break;
			case 2 : hexValue = "2";break;
			case 3 : hexValue = "3";break;
			case 4 : hexValue = "4";break;
			case 5 : hexValue = "5";break;
			case 6 : hexValue = "6";break;
			case 7 : hexValue = "7";break;
			case 8 : hexValue = "8";break;
			case 9 : hexValue = "9";break;
			case 10 : hexValue = "A";break;
			case 11 : hexValue = "B";break;
			case 12 : hexValue = "C";break;
			case 13 : hexValue = "D";break;
			case 14 : hexValue = "E";break;
			default : hexValue = "F";
			}
			
			System.out.print("The hex value is " + hexValue);
		}
		else
			System.out.print(decimalValue + " is an invalid input.");
		
		// Close scanner
		input.close();

	}

}
