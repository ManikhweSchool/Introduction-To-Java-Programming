import java.util.Scanner;

public class Exercise_3_2b {

	//  http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		byte number1 = (byte)(Math.random()*10);
		byte number2 = (byte)(Math.random()*10);
		byte number3 = (byte)(Math.random()*10);
		
		// Create a scanner in order to get user's answer.
		Scanner input = new Scanner(System.in);
		
	
		// Prompts the user to enter a sum.
		System.out.print("What is " + number1 + " + " + number2 
		+ " + " + number3 + "? ");
		int userAnswer = input.nextInt();
		
		System.out.print(number1 + " + " + number2 + " + " +
				number3 + " = " + (number1 + number2 + number3) + ". ");
		
		if(userAnswer==(number1 + number2 + number3))
			System.out.print("So, you are correct.");
		else
			System.out.print("Oops, you are incorrect.");
		
		// Close my scanner
		input.close();
	}

}
