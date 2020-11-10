import java.util.Scanner;

public class Exercise_3_14c {

	// Student C's code is more user friendly.
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		byte randomFace = (byte)(Math.random()*2);
		
		System.out.print("Enter your guess 0-head and 1-tail : ");
		
		byte userGuess = scanner.nextByte();
		
		if(userGuess == 0 || userGuess == 1) {
			if(userGuess == randomFace) {
				System.out.print("Your are correct : "
				+ "your guess was " + ((userGuess==0)?"head":"tail")
				+ " and the computer generated " + ((userGuess==0)?
				"head.":"tail."));
			}
			else
				System.out.print("Your are inccorrect : "
				+ "your guess was " + ((userGuess==0)?"head":"tail")
				+ " and the computer generated " + ((userGuess!=0)?
				"head.":"tail."));
		}
		else 
			System.out.print("Error : Start Over And Give Either 0 Or 1.");
		
		scanner.close();

	}

}
