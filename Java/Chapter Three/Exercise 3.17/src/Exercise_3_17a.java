import java.util.Scanner;

public class Exercise_3_17a {

	public static void main(String[] args) {
		
		// Create a scanner 
		Scanner reader = new Scanner(System.in);

		int computerChoice = (int)(Math.random()*3);
		
		System.out.print("scissor(0), rock(1), paper(2) : ");
		int userChoice = reader.nextInt();
		
		// Scissor
		if(userChoice==0) 
			// Scissor
			if(computerChoice==0) 
				System.out.print("The computer is scissor. "
				+ "You are scissor too. It is a draw.");
			// Rock
			else if(computerChoice==1)
				System.out.println("The computer is rock. "
				+ "You are scissor. You lost");
			// paper
			else
				System.out.print("The computer is paper. "
				+ "You are scissor. You won");
		
		
		// Rock
		else if(userChoice==1)
			// Scissor
			if(computerChoice==0)
				System.out.print("The computer is scissor."
				+ "You are rock. You won");
			else if(computerChoice==1)
				System.out.print("The computer is rock. "
				+ "You are rock too. It is a draw");
			else 
				System.out.print("The computer is paper. "
				+ "You are rock. You lost");
		// Paper
		else {
			// Scissor
			if(computerChoice==0)
				System.out.print("The computer is scissor. "
				+ "You are paper. You lost");
			// Rock
			else if(computerChoice==1)
				System.out.print("The computer is rock."
				+ " You are paper. You won");
			else
				System.out.print("The computer is paper."
				+ " You are paper too. It is a draw.");
		}
		
		// Close
		reader.close();
	}

}
