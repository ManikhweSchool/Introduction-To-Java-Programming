import java.util.Scanner;

public class Exercise_5_32a {

	public static void main(String[] args) {
		
		// Generate a first lottery digit number.
		// Question 1.
		int firstLotteryDigit = 1 + (int)(Math.random() * 9);
		int secondLotteryDigit = firstLotteryDigit;

		// Question 2.
		do {
			secondLotteryDigit = (int)(Math.random() * 10);
		}
		while(firstLotteryDigit==secondLotteryDigit);
			
		
		// Question 3.
		int lottery = Integer.parseInt("" + firstLotteryDigit + secondLotteryDigit);
		
		// Prompts use to guess.
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your lottery(pick two digits) : ");
		// Question 4
		int guess = input.nextInt();
		
		int lotteryDigit1 = lottery/10;
		int lotteryDigit2 = lottery/10;
		
		byte guessDigit1 = (byte) (guess/10);
		byte guessDigit2 = (byte) (guess%10);
		
		System.out.print("The lottery number is " + lottery + " ");
		
		// Check the guess
		if (guess == lottery)
			System.out.println("Exact match: you win $10,000");
		else if (guessDigit2 == lotteryDigit1
		&& guessDigit1 == lotteryDigit2)
		System.out.println("Match all digits: you win $3,000");
		else if (guessDigit1 == lotteryDigit1
		|| guessDigit1 == lotteryDigit2
		|| guessDigit2 == lotteryDigit1
		|| guessDigit2 == lotteryDigit2)
			System.out.println("Match one digit: you win $1,000");
		else
			System.out.println("Sorry, no match");
		
		// Close scanner
		input.close();
	}

}
