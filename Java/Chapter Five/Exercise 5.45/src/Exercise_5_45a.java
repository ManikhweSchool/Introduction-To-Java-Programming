import java.util.Scanner;

public class Exercise_5_45a {

	public static void main(String[] args) {
		
		// Create Scanner
		Scanner scanner = new Scanner(System.in);
		
		// Prompts a user to enter 10 numbers.
		System.out.print("Enter ten numbers : ");
		String numbers = scanner.nextLine();
		
		Scanner numbersReader = new Scanner(numbers);
		
		// Count numbers in a sequence.
		byte count = 0;
		// The sum of all numbers.
		double sumOfAllNumbers = 0;
		// Sum of squares
		double sumOfSquares = 0;
		
		double number;
		
		while(numbersReader.hasNext()) {
			number = numbersReader.nextDouble();
			sumOfSquares += number*number;
			sumOfAllNumbers += number;
			count++;
		}
		
		if(count != 10) {
			System.err.print("Error : 10 Digits Are Required.");;
			System.exit(0);
		}
		
		double mean = sumOfAllNumbers/count;
		double standardDeviation = Math.sqrt((sumOfSquares-
		((sumOfAllNumbers*sumOfAllNumbers)/count))/(count-1));
		
		System.out.println("The mean is " + mean);
		System.out.print("The standard deviation is " + 
		standardDeviation);
		
		scanner.close();

	}

}
