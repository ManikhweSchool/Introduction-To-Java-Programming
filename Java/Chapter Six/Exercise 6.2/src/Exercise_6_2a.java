import java.util.Scanner;

public class Exercise_6_2a {

	public static void main(String[] args) {
		
		// Create a scanner
		Scanner scanner = new Scanner(System.in);
		
		// Promppts user to enter a number.
		System.out.print("Enter a number : ");
		long n = scanner.nextLong();
		
		if(n<0)
			n *= -1;
		else
			System.out.print("The sum of digits is " + sumDigits(n));
		
		
		// Close scanner
		scanner.close();

	}
	
	public static int sumDigits(long n) {
		
		
		short sum = 0;
		
		while(n>0) {
			sum += n%10;
			n /= 10;
		}
		
		return sum;
	}

}
