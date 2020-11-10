import java.util.Scanner;

public class Exercise_3_15a {

	// http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		// Generate a lottery number.
		int lottery = (int)(Math.random()*1000);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your lottery pick (3 digits) : ");
		int guess = scanner.nextInt();
		
		int lotteryDigit1 = lottery/100;
		int lotteryDigit2 = (lottery%100)/10;
		int lotteryDigit3 = lottery%10;
		
		// Get Digits from guess.
		int guessDigit1 = guess/100;
		int guessDigit2 = (guess%100)/10;
		int guessDigit3 = guess%10; 
		
		System.out.println("The lottery number is " + lottery);
		
		// Check the guess.
		if(guess==lottery)
			System.out.print("Exact Match : You Won $10000.");
		else if(
			guess == lotteryDigit1*100 + lotteryDigit2*10 + lotteryDigit2
			||
			guess == lotteryDigit1*100 + lotteryDigit3*10 + lotteryDigit3
			||
			guess == lotteryDigit2*100 + lotteryDigit1*10 + lotteryDigit3
			||
			guess == lotteryDigit2*100 + lotteryDigit3*10 + lotteryDigit1
			||
			guess == lotteryDigit3*100 + lotteryDigit1*10 + lotteryDigit2
			||
			guess == lotteryDigit3*100 + lotteryDigit2*10 + lotteryDigit1	
		)
			System.out.print("Match all digits : you won $3,000");
		else {
			int guessDigit1Frequency = 0;
			int guessDigit2Frequency = 0;
			int guessDigit3Frequency = 0;
			
			boolean firstGuessDigitFound = false;
			boolean secondGuessDigitFound = false;
			boolean thirdGuessDigitFound = false;
			
			if(guessDigit1==lotteryDigit1) {
				guessDigit1Frequency++;
				firstGuessDigitFound = true;
			}
			else if(guessDigit1==lotteryDigit2) {
				guessDigit2Frequency++;
				secondGuessDigitFound = true;
			}
			else if(guessDigit1==lotteryDigit3) {
				guessDigit3Frequency++;
				thirdGuessDigitFound = true;
			}
			
			if(guessDigit2==lotteryDigit1 && !firstGuessDigitFound) {
				guessDigit2Frequency++;
				firstGuessDigitFound = true;
			}
			else if(guessDigit2==lotteryDigit2 && !secondGuessDigitFound) {
				guessDigit2Frequency++;
				secondGuessDigitFound = true;
			}
			else if(guessDigit2==lotteryDigit3 && !thirdGuessDigitFound) {
				guessDigit2Frequency++;
				thirdGuessDigitFound = true;
			}
			
			if(guessDigit3==lotteryDigit1 && !firstGuessDigitFound) {
				guessDigit3Frequency++;
				firstGuessDigitFound = true;
			}
			else if(guessDigit3==lotteryDigit2 && !secondGuessDigitFound) {
				guessDigit3Frequency++;
				secondGuessDigitFound = true;
			}
			else if(guessDigit3==lotteryDigit3 && !thirdGuessDigitFound) {
				guessDigit3Frequency++;
				thirdGuessDigitFound = true;
			}
			
			if(
				(guessDigit1Frequency==1 && 
				guessDigit2Frequency == 0 && 
				guessDigit3Frequency == 0)
				||
				(guessDigit2Frequency==1 && 
				guessDigit3Frequency == 0 && 
				guessDigit1Frequency == 0)
				||
				(guessDigit3Frequency==1 && 
				guessDigit2Frequency == 0 && 
				guessDigit1Frequency == 0)
			) 
				System.out.print("Match one digits : you won $1000." );
			else
				System.out.print("Sorry you did not win.");
			
		}
		
		scanner.close();
	}

}
