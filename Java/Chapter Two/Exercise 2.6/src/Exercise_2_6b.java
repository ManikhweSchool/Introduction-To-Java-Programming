import java.util.Scanner;

public class Exercise_2_6b {

	// http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		// Create a scanner to read user input.
		Scanner input = new Scanner(System.in);
		
		int userInput;
		int divideableInteger;
		
		// Prompts the user to enter an integer.
		System.out.print("Enter a number between 0 and 1000 : ");
		userInput = input.nextInt();
		
		int unitsNumber = 0;
		unitsNumber += userInput%10;
		divideableInteger = userInput/10;
		
		int tensNumber = 0;
		tensNumber += divideableInteger%10;
		divideableInteger /= 10;
		
		int hundredsNumber = 0;
		hundredsNumber += divideableInteger%10;
		divideableInteger /= 10;
		
		System.out.println("The sum of digits is " + (unitsNumber + tensNumber + hundredsNumber));
		
		input.close();
	}

}
