import java.util.Scanner;

public class Exercise_3_26c {

	public static void main(String[] args) {
		
		// Create a scanner to read user input.
		Scanner reader = new Scanner(System.in);

		// Prompts the user to enter an number.
		System.out.print("Enter an integer : ");
		int number = reader.nextInt();
		
		// Determine whether a number is divisible by 5 and 6.
		System.out.println("Is " + number + " divisible by 5 and 6? "
		+ (number%5 == 0 && number%6 == 0));
		
		// Determine whether a number is divisible by 5 or 6.
		System.out.println("Is " + number + " divisible by 5 or 6?"
		+ (number%5==0 || number%6==0));
		
		// Determine whether a number is divisible by 5 or 6 but not both.
		System.out.println("Is " + number + " divisible by 5 or 6, "
		+ "but not both? "+ (number%5==0 ^ number%6==0));
		
		// Close our scanner.
		reader.close();
	}

}
