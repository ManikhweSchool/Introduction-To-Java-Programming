import java.util.Scanner;

public class Exercise_3_24a {

	public static void main(String[] args) {
		
		// Create a scanner to read user input.
		Scanner myReader = new Scanner(System.in);
		
		// Prompts the user to enter a number in the range 1-52.
		System.out.print("Enter a number between (1-52) : ");
		int userInput = myReader.nextInt();
		
		if(!(userInput >=1 && userInput <= 52)) {
			System.out.print("Error : Make sure you enter a "
			+ "number between(1-52)");
			System.exit(0);
		}
			
		System.out.print("The card you picked is ");
		
		// The first 13 cards are all clubs.
		if(userInput==1) System.out.print("Ace of Club");
		else if(userInput==2) System.out.print("2 of Club");
		else if(userInput==3) System.out.print("3 of Club");
		else if(userInput==4) System.out.print("4 of Club");
		else if(userInput==5) System.out.print("5 of Club");
		else if(userInput==6) System.out.print("6 of Club");
		else if(userInput==7) System.out.print("7 of Club");
		else if(userInput==8) System.out.print("8 of Club");
		else if(userInput==9) System.out.print("9 of Club");
		else if(userInput==10) System.out.print("10 of Club");
		else if(userInput==11) System.out.print("Jack of Club");
		else if(userInput==12) System.out.print("Queen of Club");
		else if(userInput==13) System.out.print("King of Club");
		
		// The second 13 set of cards are all diamonds.
		else if(userInput==14) System.out.print("Ace of Diamond");
		else if(userInput==15) System.out.print("2 of Diamond");
		else if(userInput==16) System.out.print("3 of Diamond");
		else if(userInput==17) System.out.print("4 of Diamond");
		else if(userInput==18) System.out.print("5 of Diamond");
		else if(userInput==19) System.out.print("6 of Diamond");
		else if(userInput==20) System.out.print("7 of Diamond");
		else if(userInput==21) System.out.print("8 of Diamond");
		else if(userInput==22) System.out.print("9 of Diamond");
		else if(userInput==23) System.out.print("10 of Diamond");
		else if(userInput==24) System.out.print("Jack of Diamond");
		else if(userInput==25) System.out.print("Queen of Diamond");
		else if(userInput==26) System.out.print("King of Diamond");
		
		// The third 13 set of cards are all hearts.
		else if(userInput==27) System.out.print("Ace of Hearts");
		else if(userInput==28) System.out.print("2 of Hearts");
		else if(userInput==29) System.out.print("3 of Hearts");
		else if(userInput==30) System.out.print("4 of Hearts");
		else if(userInput==31) System.out.print("5 of Hearts");
		else if(userInput==32) System.out.print("6 of Hearts");
		else if(userInput==33) System.out.print("7 of Hearts");
		else if(userInput==34) System.out.print("8 of Hearts");
		else if(userInput==35) System.out.print("9 of Hearts");
		else if(userInput==36) System.out.print("10 of Hearts");
		else if(userInput==37) System.out.print("Jack of Hearts");
		else if(userInput==38) System.out.print("Queen of Hearts");
		else if(userInput==39) System.out.print("King of Hearts");
		
		// The last 13 set of cards are all spades.
		else if(userInput==40) System.out.print("Ace of Spade");
		else if(userInput==41) System.out.print("2 of Spade");
		else if(userInput==42) System.out.print("3 of Spade");
		else if(userInput==43) System.out.print("4 of Spade");
		else if(userInput==44) System.out.print("5 of Spade");
		else if(userInput==45) System.out.print("6 of Spade");
		else if(userInput==46) System.out.print("7 of Spade");
		else if(userInput==47) System.out.print("8 of Spade");
		else if(userInput==48) System.out.print("9 of Spade");
		else if(userInput==49) System.out.print("10 of Spade");
		else if(userInput==50) System.out.print("Jack of Spade");
		else if(userInput==51) System.out.print("Queen of Spade");
		else System.out.print("King of Spade");
		
		// Close
		myReader.close();

	}

}
