import java.util.Scanner;

public class Exercise_4_21b {

	public static void main(String[] args) {
		
		
		// Create a scanner 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a SSN : ");
		String ssn = scanner.nextLine();
		
		if(ssn.length() != 11) {
			System.out.println("Make sure you enter "
			+ "digits in the form DDD-DD-DDDD");
			System.exit(0);
		}
		
		if(!Character.isDigit(ssn.charAt(0))
		|| !Character.isDigit(ssn.charAt(1))
		|| !Character.isDigit(ssn.charAt(2))
		|| ssn.charAt(3)!='-'
		|| !Character.isDigit(ssn.charAt(4))
		|| !Character.isDigit(ssn.charAt(5))
		|| ssn.charAt(6)!='-'
		|| !Character.isDigit(ssn.charAt(7))
		|| !Character.isDigit(ssn.charAt(8))
		|| !Character.isDigit(ssn.charAt(9))
		|| !Character.isDigit(ssn.charAt(10)))
			System.out.print(ssn + " is a "
			+ "invalid social security number");
		else
			System.out.print(ssn + " is a "
			+ "valid social security number");
		
		// Close scanner
		scanner.close();

	}

}
