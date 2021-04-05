import java.util.Scanner;

public class Exercise_7_2a {

	public static void main(String[] args) {
		 
		
		Scanner scanner = new Scanner(System.in);

		int[] numbers = new int[10];
		int i;
		
		System.out.print("Enter 10 numbers : ");
		for(i = 0; i < numbers.length;i++)
			numbers[i] = scanner.nextInt();
		
		for(i = numbers.length-1; i >= 0;i--)
			System.out.print(numbers[i] + " ");
		
		scanner.close();
	}
	
	

}
