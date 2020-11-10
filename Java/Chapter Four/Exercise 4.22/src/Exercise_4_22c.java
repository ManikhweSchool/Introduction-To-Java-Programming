import java.util.Scanner;

public class Exercise_4_22c {

	public static void main(String[] args) {
		

		// Create a scanner 
		Scanner scanner = new Scanner(System.in);
		
		String s1, s2;
		
		System.out.print("Enter string s1 : ");
		s1 = scanner.nextLine();
		System.out.print("Enter string s2 : ");
		s2 = scanner.nextLine();
			
		System.out.print(s2 + " is " + 
		((s1.indexOf(s2)==-1)?" not ":" ") +
		"a substring of " + s1);
		
		// Close scanner
		scanner.close();
	}

}
