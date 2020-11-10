import java.util.Scanner;

public class Exercise_5_1a {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		// Prompts the user to enter a sequence of numbers.
		System.out.print("Enter an integer, the input ends if it is 0 : ");
		String sequence = scanner.nextLine();
		
		if(!sequence.endsWith("0")) {
			System.out.print("Error : Invalid Input");
			System.exit(0);
		}
		
		if(sequence.length()==1) {
			System.out.print("No numbers are entered except");
			System.exit(1);
		}
		
		int numberOfPositiveNumbers = 0;
		int numberOfNegetiveNumbers = 0;
		double total = 0;
		int number;
		int numberOfNumbers = 0;
		 //0
		while(sequence.contains(" ")) {
			number = Integer.parseInt(
			sequence.substring(0,sequence.indexOf(" ")));
			sequence = sequence.substring(sequence.indexOf(" ")+1);
			
			if(number<0) numberOfNegetiveNumbers++;
			else if(number>0) numberOfPositiveNumbers++;
			// Add this if you want to deal with sequences with more than one zeros.
			else break; 
			
			total += number;
			numberOfNumbers++;
		}
		
		System.out.println("The number of positive is " + numberOfPositiveNumbers);
		System.out.println("The number of negetive is " + numberOfNegetiveNumbers);
		System.out.println("The total is " + total);
		System.out.printf("The average is %1.2f", total/numberOfNumbers);
		
		scanner.close();
	}

}
