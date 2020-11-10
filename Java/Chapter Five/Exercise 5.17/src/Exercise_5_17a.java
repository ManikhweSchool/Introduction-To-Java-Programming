import java.util.Scanner;

public class Exercise_5_17a {

	public static void main(String[] args) {
		
		// Create a scanner to read user input.
		Scanner scanner = new Scanner(System.in);
		
		// Prompts a user to enter number of lines.
		System.out.print("Enter number of lines : ");
		byte numberOfLines = scanner.nextByte();
		
		if(numberOfLines>=1 && numberOfLines<=15) {
			for(byte row = 0; row < numberOfLines;row++) {
				// Deal with the left side of a given row.
				for(byte leftIndex = numberOfLines; leftIndex>1;leftIndex--) {
					if(leftIndex<=row+1)
						System.out.print(leftIndex + "\t");
					else
						System.out.print("\t");
				}
				// Deal with the right side of a given row.
				for(byte rightIndex = 1;rightIndex <= row +1; rightIndex++)
					System.out.print(rightIndex + "\t");
				
				System.out.println();
			}
		}
		else
			System.out.print("Error : Invalid Input.");
		
		// close scanner
		scanner.close();
	}

}
