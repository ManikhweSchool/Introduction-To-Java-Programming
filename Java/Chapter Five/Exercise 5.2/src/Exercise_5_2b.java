import java.util.Scanner;

public class Exercise_5_2b {

	public static void main(String[] args) {
		
		final byte NUMBER_OF_QUESTIONS = 10;
		
		// Count number of questions so far.
		byte count = 0;
		// Count number of correct questions.
		byte numberOfCorrectAnswers = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		String output = "";
		long startTime = System.currentTimeMillis();
		
		while(count<NUMBER_OF_QUESTIONS) {
			
			// Generate two random numbers between 1 and 15.
			byte number1 = (byte)(1+(byte)(Math.random()*16));
			byte number2 = (byte)(1+(byte)(Math.random()*16));
			
			System.out.println("What is " + number1 + " + " + number2 + "? ");
			byte answer = scanner.nextByte();
			
			// Grade the answer and display the result.
			if(number1+number2==answer) {
				System.out.println("You are correct.");
				numberOfCorrectAnswers++;
			}
			else {
				System.out.println("Your answer is wrong.\n" + number1 + " + " +
				number2 + " should be " + (number1+number2));
			}
			count++;
			
			output += "\n" + number1 + " + " + number2 + " = " + answer
					+ ((number1+number2==answer)?" correct." : " wrong.");
		}
		
		System.out.println("Correct count is " + numberOfCorrectAnswers +
		"\nTest time is " + ((System.currentTimeMillis()-startTime)/1000) + 
		" seconds.\n" + output);
		
		scanner.close();
	}

}
