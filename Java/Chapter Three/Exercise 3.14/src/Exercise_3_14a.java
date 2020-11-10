import java.util.Scanner;

public class Exercise_3_14a {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int face = (int)(Math.random()*2);
		
		System.out.print("Enter your guess( 0 or 1) : ");
		int guess = scanner.nextInt();
		
		if(face==guess)
			System.out.print("Your guess was correct.");
		else 
			System.out.print("Your guess was incorrect.");
		
		scanner.close();

	}

}
