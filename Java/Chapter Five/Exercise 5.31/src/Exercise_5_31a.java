import java.util.Scanner;

public class Exercise_5_31a {

	public static void main(String[] args) {
		
		// Create scanner
		// Question 1.
		Scanner myscanner = new Scanner(System.in);
		
		// Prompts user to enter initial deposit.
		System.out.print("Enter the initial deposit amount : ");
		// Question 2.
		double amt = myscanner.nextDouble();
		
		// Prompts the user to enter annual interest.
		System.out.print("Enter annual interest : ");
		// Question 3.
		double annIntRate = myscanner.nextDouble();
		
		
		// Prompts the user to enter annual interest.
		System.out.print("Enter maturity period(number of months) : ");
		// Question 4.
		int numOfMon = myscanner.nextInt();
		
		double fAmount = amt;
		// Question 5.
		int monNum = 1;
		
		System.out.println("\tMonth\tCD Value");
		while(monNum <= numOfMon) {
			fAmount = amt + amt*annIntRate/1200;
			System.out.printf("%d\t%5.2f\n",monNum,fAmount);
			amt = fAmount;
			monNum++;
		}
		
		// Question 6.
		
		// Close scanner
		myscanner.close();

	}

}
