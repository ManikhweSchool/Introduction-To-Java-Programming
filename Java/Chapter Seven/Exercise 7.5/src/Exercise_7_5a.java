import java.util.Scanner;

public class Exercise_7_5a {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		int[] numbers = new int[10];
		int distinctNumberIndex = 0;
		
		System.out.print("Enter ten numbers : ");
		String userInput = reader.nextLine();
		String[] numbersAsString = userInput.split(" ");
		
		if(numbersAsString.length != 10) {
			System.err.print("Error : Make sure yout enter 10 numbers.");
			System.exit(0);
		}
		
		initialize(numbers);
		
		for(int i = 0; i < 10;i++) {
			int number = Integer.parseInt(numbersAsString[i]);
			if(!contains(numbers,number))
				numbers[distinctNumberIndex++] = number;
			
		}
		
		displayDistinctNumbers(numbers,distinctNumberIndex);

		reader.close();
	}
	
	public static void displayDistinctNumbers(int[] numbers,int numberOfDistinctNumbers) {
		
		System.out.println("The number of distinct numbers is " + numberOfDistinctNumbers);
		System.out.println("The distinct numbers are : ");
		
		int indexOfNumber = 0;
		
		while(indexOfNumber<10 && 
		numbers[indexOfNumber] != Integer.MAX_VALUE) {
			System.out.print(numbers[indexOfNumber] + " ");
			indexOfNumber++;
		}
		
	}
	
	public static boolean contains(int[] numbers, int number) {
		
		for(int i = 0; i < numbers.length;i++)
			if(numbers[i]==number)
				return true;
		return false;
	}

	public static void initialize(int[] numbers) {
		
		for(int i = 0; i < numbers.length;i++)
			numbers[i] = Integer.MAX_VALUE;
	}
}
