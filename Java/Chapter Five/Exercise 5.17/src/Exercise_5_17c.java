import java.util.Scanner;

public class Exercise_5_17c {

	public static void main(String[] args) {
		
		// Create a scanner to read user input.
		Scanner scanner = new Scanner(System.in);
				
		// Prompts a user to enter number of lines.
		System.out.print("Enter number of lines : ");
		byte numberOfLines = scanner.nextByte();
				
		if(numberOfLines<1 || numberOfLines>15) {
			System.out.print("Error : Input Not Allowed");
			System.exit(0);
		}
		
		for(int row = 0; row < numberOfLines;row++) {
			for(int column = -numberOfLines; column < numberOfLines;column++) {
				if(column==-1 && row==0) {
					System.out.print(row+1);
					break;
				}
				// Deal with other rows such as 2 1 2
				else if(column >= -row-1 && column<= row+1) {
					// Deal with numbers on the left hand side of middle 1.
					if(column < 0) {
						if(column != -1)
							System.out.print(Math.abs(column) + "\t");
					}
					// Deal with the numbers on the right hand side of middle 1.
					else if(column > 0)
						System.out.print(column + "\t");
				}
				// Responsible for displaying all necessary spaces.
				else
					System.out.print("\t");
			}
			System.out.println();
		}

		// Close scanner
		scanner.close();
	}

}
