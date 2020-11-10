import java.util.Scanner;

public class Exercise_4_22a {

	public static void main(String[] args) {
		

		// Create a scanner 
		Scanner scanner = new Scanner(System.in);
		
		String string1, string2;
		
		System.out.print("Enter string s1 : ");
		string1 = scanner.nextLine();
		System.out.print("Enter string s2 : ");
		string2 = scanner.nextLine();
		
		if(string1.length()<string2.length()) {
			System.out.print(string2 + " is not a substring of " + string1);
			System.exit(0);
		}
			
		if(string1.contains(string2))
			System.out.print(string2 + " is a substring of " + string1);
		else
			System.out.print(string2 + " is not a substring of " + string1);
			
		
		// Close scanner
		scanner.close();
	}

}
