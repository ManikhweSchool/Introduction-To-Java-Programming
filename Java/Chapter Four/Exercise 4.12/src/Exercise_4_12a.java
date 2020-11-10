import java.util.Scanner;

public class Exercise_4_12a {

	public static void main(String[] args) {
		
		
		// Create a scanner
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("Enter a hex digit : ");
		String hexDigit = myScanner.nextLine();
		
		if(hexDigit.length() != 1)
			System.out.print(hexDigit + " is an invalid input.");
		else {
			if(Character.isLetter(hexDigit.charAt(0))) {
				if(hexDigit.charAt(0)<='F' && hexDigit.charAt(0)>='A') {
					String output = "The binary value is ";
					switch(hexDigit.charAt(0)) {
					case 'A' : output += "1010";break;
					case 'B' : output += "1011";break;
					case 'C' : output += "1100";break;
					case 'D' : output += "1101";break;
					case 'E' : output += "1110";break;
					default : output += "1111";
					}
					System.out.print(output);
				}
				else
					System.out.print(hexDigit + " is an invalid input.");
				
			}
			else
				System.out.print(hexDigit + " is an invalid input.");
				
		}
		
		// Close scanner
		myScanner.close();

	}

}
