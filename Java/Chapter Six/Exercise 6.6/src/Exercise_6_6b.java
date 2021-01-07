import java.util.Scanner;

public class Exercise_6_6b {

	public static void main(String[] args) {
		
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		
		// Prompts the user to enter n
		System.out.print("Enter the value of n : ");
		int n = scanner.nextInt();
		
		validate(n);
		
		// Close scanner
		scanner.close();
	}
	
	public static void displayPattern(int n) {
		
		for(int i = 1; i <= n;i++) {
			for(int j = n; j >=1;j--) {
				System.out.printf(((j>i)?"\t":"\t%s"),j);
			}
			System.out.println();
		}
	}
	
	public static void validate(int n) {
		
		if(n<0) {
			System.err.print("Error : Only Positive Numbers Are Allowed.");
		}
		else
			displayPattern(n);
	}

}
