import java.util.Scanner;

public class Exercise_3_7c {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Receive the amount.
		System.out.print("Enter an amount("
		+ "for example 11.56) : ");
		double initialAmount = scanner.nextDouble();
		
		int remainder = (int)(initialAmount*100);
		
		// Find the number of one dollars.
		int dollars = remainder/100;
		remainder = remainder%100;
		
		// Find the number of quarters in the remaining amount.
		int quarters = remainder/25;
		remainder = remainder%25;
		
		// Find the number of dimes in the remaining amount.
		int dimes = remainder/10;
		remainder = remainder%10;
		
		// Find the number of nickels in the remaining amount.
		int nickels = remainder/5;
		remainder = remainder%5;
		
		// Display the result.
		System.out.println("Your amount " + remainder + " consist of ");
		
		if(dollars >= 1)
			System.out.println(dollars + ((dollars>1)?" dollars.":
		" dollar."));
		if(quarters >= 1)
			System.out.println(quarters + ((quarters>1)?" quarters.":
		" quarter."));
		if(dimes >= 1)
			System.out.println(dimes + ((dimes>1)?" dimes.":
		" dime."));
		if(nickels >= 1)
			System.out.println(nickels + ((nickels > 1)?" nickels." 
		 : " nickel."));
		if(remainder >= 1)
			System.out.println(remainder + ((remainder != 1)? " pennies.": " penny."));
		
		// Close scanner
		scanner.close();

	}

}
