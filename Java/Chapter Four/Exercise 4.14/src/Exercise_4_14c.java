import java.util.Scanner;

public class Exercise_4_14c {

	public static void main(String[] args) {
		
		
		// Create a scanner to read user input.
		Scanner input = new Scanner(System.in);
		
		// Prompts the user to enter a letter grade.
		System.out.print("Enter a letter grade : ");
		String grade = input.nextLine();
		
		if(grade.length()==1 && 
		(grade.charAt(0)>= 'A' && grade.charAt(0)<= 'F')) {
			
			if(grade.charAt(0)== 'E')
				System.out.print(grade + " is an invalid grade.");
			else {
				System.out.print("The numeric value for grade ");
				if(grade.charAt(0)< 'E')
					System.out.print('E'-grade.charAt(0));
				else
					System.out.print('F'-grade.charAt(0));
			}
		}
		else
			System.out.print(grade + " is an invalid grade.");
		
		// Close scanner
		input.close();

	}

}
