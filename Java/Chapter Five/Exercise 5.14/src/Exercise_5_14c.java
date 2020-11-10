import java.util.Scanner;

public class Exercise_5_14c {

	public static void main(String[] args) {
		
		// Create scanner to read user input.
		Scanner myReader = new Scanner(System.in);

		System.out.print("Enter two integers : ");
		int n1 = myReader.nextInt();
		int n2 = myReader.nextInt();
		
		if(n1==0 || n2 == 0) {
			System.out.print("Invalid Input");
			System.exit(0);
		}
		
		boolean keepLooking = true;
		int d;
		
		if(n1<n2) d=n1;else d= n2;
		
		while(keepLooking) {
			if(n1%d==0 && n2%d==0) {
				System.out.print("The GCD of " + n1 + " and " +
				n2 + " is " + d + ".");
				keepLooking = false;
			}
			d--;
		}
		
		// Close Scanner
		myReader.close();
	}

}
