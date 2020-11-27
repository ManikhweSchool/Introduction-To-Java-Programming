import java.util.Scanner;

public class Exercise_5_38b {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Prompts a suer to enter a decimal value.
		System.out.print("Enter a decimal value : ");
		String decimalValue = scanner.nextLine();
		
		for(int index = 0; index < decimalValue.length();index++) {
			if(!Character.isDigit(decimalValue.charAt(index))) {
				System.out.print("Invalid User Input");
				System.exit(0);
			}
		}
		
		String octalValue = "";
		
		int number = Integer.parseInt(decimalValue);
		double temp;
		double remainder;
		
		while(number != 0) {
			temp = number/8.0;
			remainder = ((temp-(int)temp)*8);
			octalValue += (int)remainder;
			number = (int)temp;
		}
		
		for(int i = octalValue.length()-1; i>=0;i--)
			System.out.print(octalValue.charAt(i));
		
		// Close scanner
		scanner.close();
	}

}
