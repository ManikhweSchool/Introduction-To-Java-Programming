import java.util.Scanner;

public class Exercise_5_36b {

	/* TO ALL SOUTH AFRICANS LIVING AROUND DURBAN IN KZN,
	 * FEEL FREE TO ASK FOR HELP, I'M WILLING TO MEET FOR 
	 * CONSULTATION. INTERESTED??? LET ME KNOW BY SMS 
	 * 0672781430*/
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Prompts a user to enter nine digits.
		System.out.print("Enter first nine digits of an ISBN as integer : ");
		int userInput = scanner.nextInt();
		
		if(userInput<1000000000 && userInput>9999999) {
			
			int originalISBN = userInput;
			
			int sumOfProducts = 0;
			
			int i = 9; // Current digit multiplier
			while(i>1) {
				sumOfProducts += i*(userInput%10);
				userInput /= 10;
				i--;
			}
			
			int determiner = sumOfProducts%11;
			System.out.print("The ISBN-10 number is 0" + originalISBN);
			
			if(determiner==10)
				System.out.print("X");
			else
				System.out.print(determiner);
		}
		else {
			System.out.print("Error : Make Sure You Enter Nine Digits.");
		}
		
		scanner.close();

	}

}
