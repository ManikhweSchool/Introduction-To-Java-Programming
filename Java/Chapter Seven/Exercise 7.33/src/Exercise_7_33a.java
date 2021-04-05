import java.util.Scanner;

public class Exercise_7_33a {

	public static void main(String[] args) {
		
		String[] animals = {"Monkey","Rooster","Dog",
							"Pig","Rat","Ox","Tiger","Rabbit",
							"Dragon","Snake","Horse","Sheep"};
		
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a year : ");
		long year = scanner.nextLong();
		
		System.out.print(animals[(int)(year%12)]);
		
		// Close scanner
		scanner.close();
	}

}
