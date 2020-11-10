import java.util.Scanner;

public class Exercise_4_18c {

	public static void main(String[] args) {
		
		// Create a scanner
		Scanner scanner = new Scanner(System.in);

		// Prompts the user two characters.
		System.out.print("Enter two characters : ");
		String characters = scanner.nextLine();
		
		if(characters.length()==2) {
			char character1 = characters.charAt(0);
			char character2 = characters.charAt(1);
			if((character1=='M' || character1=='C' || character1=='i')
			&&
			(character2=='1')|| character2=='2' || character2=='3'
			|| character2=='4') {
				
				switch(character1) {
				case 'M' : System.out.print("Mathematics ");break;
				case 'C' : System.out.print("Computer Science ");break;
				default : System.out.print("Information Technology ");
				
				}
				
				switch(character2) {
				case '1' : System.out.print("Freshmen");break;
				case '2' : System.out.print("Sophomore");break;
				case '3' : System.out.print("Junior");break;
				default : System.out.print("Senior");
				}
			}
			else
				System.out.print("Invalid input");
		}
		else
			System.out.print("Invalid input");
		
		
		scanner.close();

	}

}
