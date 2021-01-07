import java.util.Scanner;

public class Exercise_6_31a {

	/* Student B realize that student A's solution has methods that don't
	 *  take advantage of other methods. And also,
	 *  variables are over used.*/
	public static void main(String[] args) {
		
		// Create a scanner to read user input.
		Scanner input = new Scanner(System.in);
				
		// Prompts a user to enter credit card number.
		System.out.println("Enter credit card number : ");
				
		String creditCardNumber = input.next();
				
		System.out.println(creditCardNumber + " " + (isValid(Long.parseLong(creditCardNumber))?" is valid":" is invalid"));
				
		input.close();
	}
	
	/** Return true if the card number is valid */
	public static boolean isValid(long number) {
		
		if((getSize(number) >= 13 && getSize(number) <= 16) && ( prefixMatched(number, 37) 
		|| prefixMatched(number, 4)
		|| prefixMatched(number, 5)
		|| prefixMatched(number, 6)) 
		&& (sumOfDoubleEvenPlace(number) + 
		sumOfOddPlace(number))%10 == 0)
			return true;
		return false;
	}
	
	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {
		
		// Sum of double even place numbers.
		int sum = 0;
		
		String numberAsString = String.valueOf(number);
		
		for(int index = numberAsString.length()-2; index >= 0; index -= 2) {
			char retrievedChar = numberAsString.charAt(index);
			sum += getDigit(Integer.parseInt(String.valueOf(retrievedChar))*2);
		}
		return sum;
	}
	
	/** Return this number if it is a single digit, otherwise,
	* return the sum of the two digits */
	public static int getDigit(int number) {
		
		if(number > 9) 	
			return number/10 + number%10;
		
		return number;
	}
	
	/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number) {
		
		int sum = 0;
		String numberAsString = String.valueOf(number);
		
		for(int index = numberAsString.length()-1; index >= 0; index -= 2) {
			char retrievedChar = numberAsString.charAt(index);
			sum += Integer.parseInt(String.valueOf(retrievedChar));
		}
		
		return sum;
	}
	
	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		
		if(getPrefix(number, getSize(d))==d)
			return true;
		return false;
	}
	
	/** Return the number of digits in d */
	public static int getSize(long d) {
	
		return String.valueOf(d).length();
	} 
	
	
	/** Return the first k number of digits from number. If the
	* number of digits in number is less than k, return number. */
	public static long getPrefix(long number, int k) {
		
		if(getSize(number) < k)
			return number;
		else 
			return Long.parseLong(String.valueOf(number).substring(0, k));
	}
}
