import java.util.Scanner;

public class Exercise_6_22a {

	public static void main(String[] args) {
		
		// Create a scanner to read user input.
		Scanner input = new Scanner(System.in);

		// Prompts a user to enter a value of n.
		System.out.print("Enter a value of n : ");
		long n = input.nextLong();
				
		displaySqaureRoot(n);
				
		input.close();

	}
	
	public static void displaySqaureRoot(long n) {
		
		if(isInputValid(n))
			System.out.print("Square Roof Of " + n + " Is " + sqrt(n));
		else
			System.out.println("Error : Invalid Input.");
	}
	
	public static boolean isInputValid(long n) {
		
		return n>=0;
	}
	
	public static double sqrt(long n) {
		
		double lastGuess = 1;
		double nextGuess = lastGuess;
		
		do {
			lastGuess = nextGuess;
			nextGuess =  (lastGuess + n / lastGuess) / 2;
		}while(Math.abs((lastGuess-nextGuess))>0.0001);
		
		return nextGuess;
	}

}
