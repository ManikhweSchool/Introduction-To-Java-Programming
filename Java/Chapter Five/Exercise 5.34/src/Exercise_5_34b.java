import java.util.Scanner;

public class Exercise_5_34b {

	public static void main(String[] args) {
		
		// A computer's at a given time.
		byte computerChoice;
		// A number of times a computer has won so far.
		short computerWins = 0;

		// A user's choice at a given time.
		byte userChoice;
		// A number of times a user has won so far.
		short userWins = 0;
		
		Scanner scanner = new Scanner(System.in);
		boolean canPlay = true;
		
		/* Loop while neither a user nor a computer 
		 * has won more than 2 times the opponent.
		 */
		
		
		do {
			computerChoice = (byte)(Math.random()*2);
			System.out.print("Enter scissor(0), rock(1), paper(2) : ");
			userChoice = scanner.nextByte();
			
			if(userChoice <3 && userChoice>=0) {
				if(computerChoice==0) {
					System.out.print("The computer is scissor. You are ");
					if(userChoice==0) System.out.print("sissor too.");
					else if(userChoice==1) System.out.print("rock. ");
					else System.out.print("paper. ");
				}
				else if(computerChoice==1) {
					System.out.print("The computer is rock. You are ");
					if(userChoice==0) System.out.print("sissor.");
					else if(userChoice==1) System.out.print("rock too. ");
					else System.out.print("paper. ");
				}
				else {
					System.out.print("The computer is paper. You are ");
					if(userChoice==0) System.out.print("sissor. ");
					else if(userChoice==1) System.out.print("rock. ");
					else System.out.print("paper too. ");
				}
				
				// Choices are the same hence we have a draw.
				if(userChoice==computerChoice) {
					System.out.println("It is a draw.");
				}
				// A player has lost
				else if((computerChoice==0 && userChoice==2) ||
				(computerChoice==1 && userChoice==0) ||
				(computerChoice==2 && userChoice==1)) {
					System.out.println("You lost.");
					computerWins++;
				}
				else {
					System.out.println("You won.");
					userWins++;
				}
				
				System.out.println("Computer Wins : " + computerWins +
				"\tPlayer Wins : " + userWins);
				
				canPlay = !((userWins==0 && computerWins==3) ||
						    (userWins==3 && computerWins==0) ||
						    ((userWins!=0 && computerWins!=0 &&
						    (userWins == (2*computerWins+1) ||
						    computerWins == (2*userWins+1)))));
				if(!canPlay)
					System.out.println("---------------------Game Over--------------------");
				
			}
			else
				System.out.println("Try Again : Enter 0, 1 or 2.");
			
			
		}while(canPlay);
		
		scanner.close();
	}

}
