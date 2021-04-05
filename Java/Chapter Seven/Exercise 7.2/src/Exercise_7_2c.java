import java.util.Scanner;

public class Exercise_7_2c {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter numbers : ");
		String[] numbers = scanner.nextLine().split(" ");
		
		for(int i = numbers.length-1; i > -1; i--)
			System.out.print(numbers[i] + " ");
		
		scanner.close();
	}
	
	

}
