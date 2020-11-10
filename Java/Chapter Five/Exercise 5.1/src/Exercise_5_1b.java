import java.util.Scanner;

public class Exercise_5_1b {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int element = 0; // An integer on a sequence.
		double total = 0;
		long numberOfPositiveNumbers = 0;
		long numberOfNegetiveNumbers = 0;
		long numberOfElements = 0;
		
		System.out.print("Enter an integer, the input ends if it is 0: ");
		do {
			element = scanner.nextInt();
			if(element>0)
				numberOfPositiveNumbers++;
			else if(element<0)
				numberOfNegetiveNumbers++;
			else
				break;
			total += element; 
			numberOfElements++;
				
		}while(element != 0);
		
		System.out.println("The number of positive is " + numberOfPositiveNumbers);
		System.out.println("The number of negetive is " + numberOfNegetiveNumbers);
		System.out.println("The total is " + total);
		System.out.printf("The average is %1.2f", total/numberOfElements);
		
		scanner.close();
	}

}
