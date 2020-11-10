import java.util.Scanner;

public class Exercise_3_24b {

	// Student A's solution over uses if else statements.
	public static void main(String[] args) {
		
		
		// Prompts the user to enter a number (1-52).
		System.out.print("Enter a number between(1-52) : ");
		
		// Create a scanner.
		Scanner sc = new Scanner(System.in);
		
		int cardNumber = sc.nextInt();
		
		if(cardNumber <1 || cardNumber>52) 
			System.out.print("Start Over : Enter A Valid Card Number.");
		else {
			System.out.print("The card you picked is ");
			
			/*
			 * The first 13 cards are all clubs.
			 * The second 13 cards are all diamonds.
			 * The third 13 set of cards are all hearts.
			 * The last 13 set of cards spades.
			 * */
			
			switch(cardNumber) {
			case 1 : System.out.print("Ace of Club"); break;
			case 2 : System.out.print("2 of Club"); break;
			case 3 : System.out.print("3 of Club"); break;
			case 4 : System.out.print("4 of Club"); break;
			case 5 : System.out.print("5 of Club"); break;
			case 6 : System.out.print("6 of Club"); break;
			case 7 : System.out.print("7 of Club"); break;
			case 8 : System.out.print("8 of Club"); break;
			case 9 : System.out.print("9 of Club"); break;
			case 10 : System.out.print("10 of Club"); break;
			case 11 : System.out.print("Jack of Club"); break;
			case 12 : System.out.print("Queen of Club"); break;
			case 13 : System.out.print("King of Club"); break;
			
			case 14 : System.out.print("Ace of Diamond"); break;
			case 15 : System.out.print("2 of Diamond"); break;
			case 16 : System.out.print("3 of Diamond"); break;
			case 17 : System.out.print("4 of Diamond"); break;
			case 18 : System.out.print("5 of Diamond"); break;
			case 19 : System.out.print("6 of Diamond"); break;
			case 20 : System.out.print("7 of Diamond"); break;
			case 21 : System.out.print("8 of Diamond"); break;
			case 22 : System.out.print("9 of Diamond"); break;
			case 23 : System.out.print("10 of Diamond"); break;
			case 24 : System.out.print("Jack of Diamond"); break;
			case 25 : System.out.print("Queen of Diamond"); break;
			case 26 : System.out.print("King of Diamond"); break;
			
			case 27 : System.out.print("Ace of Hearts"); break;
			case 28 : System.out.print("2 of Hearts"); break;
			case 29 : System.out.print("3 of Hearts"); break;
			case 30 : System.out.print("4 of Hearts"); break;
			case 31 : System.out.print("5 of Hearts"); break;
			case 32 : System.out.print("6 of Hearts"); break;
			case 33 : System.out.print("7 of Hearts"); break;
			case 34 : System.out.print("8 of Hearts"); break;
			case 35 : System.out.print("9 of Hearts"); break;
			case 36 : System.out.print("10 of Hearts"); break;
			case 37 : System.out.print("Jack of Hearts"); break;
			case 38 : System.out.print("Queen of Hearts"); break;
			case 39 : System.out.print("King of Hearts"); break;
			
			case 40 : System.out.print("Ace of Spade"); break;
			case 41 : System.out.print("2 of Spade"); break;
			case 42 : System.out.print("3 of Spade"); break;
			case 43 : System.out.print("4 of Spade"); break;
			case 44 : System.out.print("5 of Spade"); break;
			case 45 : System.out.print("6 of Spade"); break;
			case 46 : System.out.print("7 of Spade"); break;
			case 47 : System.out.print("8 of Spade"); break;
			case 48 : System.out.print("9 of Spade"); break;
			case 49 : System.out.print("10 of Spade"); break;
			case 50 : System.out.print("Jack of Spade"); break;
			case 51 : System.out.print("Queen of Spade"); break;
			default : System.out.print("King of Spade");
			}
		}
		
		// Close scanner
		sc.close();
	}

}
