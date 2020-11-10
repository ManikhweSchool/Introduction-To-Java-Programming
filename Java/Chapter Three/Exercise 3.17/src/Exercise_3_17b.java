import java.util.Scanner;

public class Exercise_3_17b {

	// http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("scissor(0). rock(1), paper(2) : ");
		int userChoice = scanner.nextInt();
		byte computerChoice = (byte)(Math.random()*3);
		
		// Validating user input.
		if(userChoice==0 || userChoice==1 || userChoice==2) {
			// Computer is Scissor
			if(computerChoice == 0) {
				System.out.print("The computer is scissor. You are ");
				
				// User is scissor
				if(userChoice==0)
					System.out.print("sissor. ");
				// User is rock
				else if(userChoice==1)
					System.out.print("rock. ");
				// User is paper
				else
					System.out.print("paper. ");
			}
			// Computer is Rock
			else if(computerChoice==1) {
				
				System.out.print("The computer is rock. You are ");
				
				// User is scissor
				if(userChoice==0)
					System.out.print("sissor. ");
				// User is rock
				else if(userChoice==1)
					System.out.print("rock. ");
				// User is paper
				else
					System.out.print("paper. ");
			}
			
			// Computer is paper.
			else {
				System.out.print("The computer is paper. You are ");
				
				// User is scissor
				if(userChoice==0)
					System.out.print("sissor. ");
				// User is rock
				else if(userChoice==1)
					System.out.print("rock. ");
				// User is paper
				else
					System.out.print("paper. ");
			}
			
			if(userChoice==computerChoice)
				System.out.print("It is a draw");
			else if(
			(computerChoice==0 && userChoice==2)
			||
			(computerChoice==1 && userChoice==0)
			||
			(computerChoice==2 && userChoice==1))
				System.out.print("You lost.");
			else
				System.out.print("You won.");
				
		}
		else {
			System.out.print("Error : TRY AGAIN");
		}
		
		// Close scanner
		scanner.close();

	}

}
