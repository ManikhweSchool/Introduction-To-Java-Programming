import java.util.Scanner;

public class Exercise_7_28b {
	
	
	public static void displayCombinations(int[] numbers) {
		
		for(int outerIndex = 0; outerIndex < 
		numbers.length-1;outerIndex++) {
			for(int innerIndex = outerIndex+1;
			innerIndex<numbers.length;innerIndex++) {
				System.out.println(numbers[outerIndex] 
				+ " " + numbers[innerIndex]);
			}
		}
	}

	public static void main(String[] args) {
		
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter ten numbers : ");
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length;i++)
			numbers[i] = scanner.nextInt();
		
		displayCombinations(numbers);
		
		// Close scanner
		scanner.close();

	}

}
