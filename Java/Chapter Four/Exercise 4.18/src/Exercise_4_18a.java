import java.util.Scanner;

public class Exercise_4_18a {

	public static void main(String[] args) {
		
		// Create a scanner
		Scanner scanner = new Scanner(System.in);

		// Prompts the user two characters.
		System.out.print("Enter two characters : ");
		String characters = scanner.nextLine();
		
		String output = "";
		
		if(characters.equals("M1"))
			output += "Mathematics Freshman";
		else if(characters.equals("M2"))
			output += "Mathematics Sophomore";
		else if(characters.equals("M3"))
			output += "Mathematics Junior";
		else if(characters.equals("M4"))
			output += "Mathematics Senior";
		
		else if(characters.equals("C1"))
			output += "Computer Science Freshman";
		else if(characters.equals("C2"))
			output += "Computer Science Sophomore";
		else if(characters.equals("C3"))
			output += "Computer Science Junior";
		else if(characters.equals("C4"))
			output += "Computer Science Senior";
		
		else if(characters.equals("I1"))
			output += "Information Technology Freshman";
		else if(characters.equals("I2"))
			output += "Information Technology Sophomore";
		else if(characters.equals("I3"))
			output += "Information Technology Junior";
		else if(characters.equals("I4"))
			output += "Information Technology Senior";
		
		else
			output += "Invalid input";
		
		System.out.print(output);
		
		// Close scanner
		scanner.close();
	}

}
