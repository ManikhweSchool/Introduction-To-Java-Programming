import java.util.Scanner;

public class Exercise_6_4b {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int number = scanner.nextInt();
		
		reverse(number);
		
		
		scanner.close();

	}
	
	public static void reverse(int number) {
		
		String numberAsString = (number>0)?
		String.valueOf(number):String.valueOf(Math.abs(number));
		
		StringBuilder flexibleString = 
		new StringBuilder(numberAsString);
		
		String reversedString = flexibleString.reverse().toString();
		
		System.out.print("Number : " + numberAsString +
		"\tReversed Number : " + ((number<0)?"-":"") + 
		reversedString);
		
	}

}
