import java.util.Scanner;

public class Exercise_2_10a {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		// Declare a variable to hold weight of water.
		double ww;
		
		// Declare a variable to hold our initial temperature.
		double it;
		
		// Declare a variable to hold our final temperature.
		double ft;
		
		System.out.print("Enter the amount of water in kilograms : ");
		ww = input.nextDouble();
		
		System.out.print("Enter the initial temperature : ");
		it = input.nextDouble();
		
		System.out.print("Enter the final temperature : ");
		ft = input.nextDouble();
		
		double en = ww * (ft - it) *4184;
		
		System.out.printf("The energy needed is %2.1f", en);
		
		input.close();
	}

}
