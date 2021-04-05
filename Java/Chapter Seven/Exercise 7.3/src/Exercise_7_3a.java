import java.util.Scanner;

public class Exercise_7_3a {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = new int[100];
		
		// Prompt a user to enter numbers.
		System.out.print("Enter the integers between 1 and 100 : ");
		
		int currentNumber = 0;
		
		do {
			currentNumber = scanner.nextInt();
			if(currentNumber != 0)
				numbers[currentNumber-1]++;
		}while(currentNumber != 0);
		
		for(int i = 0; i < numbers.length;i++)
			if(numbers[i] != 0)
				System.out.println(i+1 + " occures " + 
				numbers[i] + ((numbers[i]==1)?" time.":" times."));
		
		scanner.close();
	}

}
