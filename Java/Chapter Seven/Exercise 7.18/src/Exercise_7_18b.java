import java.util.Scanner;

public class Exercise_7_18b {

	public static void main(String[] args) {
		
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		
		double[] numbers = new double[10];
		
		System.out.println("Enter ten numbers : ");
		for(byte index = 0;index < numbers.length;index++) 
			numbers[index] = scanner.nextDouble();
		
		sort(numbers);
		
		for(byte index = 0;index < numbers.length;index++) 
			System.out.print(numbers[index] + " ");
		
		// Close scanner
		scanner.close();

	}
	
	public static void sort(double[] numbers) {
		
		for(int iterationNumber = 1; 
		iterationNumber < numbers.length;
		iterationNumber++) {
			for(int j = 0; j < numbers.length-1;j++) {
				if(numbers[j] >numbers[j+1]) {
					double temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
	}

}
