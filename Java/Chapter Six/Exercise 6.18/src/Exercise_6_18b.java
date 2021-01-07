import java.util.Scanner;

public class Exercise_6_18b {

	public static void main(String[] args) {
		
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter password : ");
		String password = scanner.nextLine();
		
		displayResult(password);
		
		// close scanner
		scanner.close();

	}
	
	public static void displayResult(String password) {
		
		if(isValid(password))
			System.out.print("Valid Password");
		else
			System.out.print("Invalid password");
	}
	
	public static boolean hasAtleastTwoDigits(String password){
		
		int count = 0;
		
		for(int i = 0; i < password.length();i++)
			if(!Character.isDigit(password.charAt(i)))
				count++;
		return count>=2;
	}
	
	public static boolean containsValidCharacters(String password) {
		
		for(int i = 0; i < password.length();i++)
			if(!Character.isDigit(password.charAt(i)) &&
			!Character.isLetter(password.charAt(i)))
				return false;
		return true;
	}
	
	public static boolean hasCorrectLength(String password) {
		 return password.length()==8;
	}
	
	public static boolean isValid(String password) {
		
		boolean isValid = true;
		
		if(!hasAtleastTwoDigits(password))
			isValid = false;
		if(!containsValidCharacters(password))
			isValid = false;
		if(!hasCorrectLength(password))
			isValid = false;
		
		return isValid;
	}

}
