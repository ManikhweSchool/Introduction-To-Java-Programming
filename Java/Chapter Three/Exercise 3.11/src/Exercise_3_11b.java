import java.util.Scanner;

public class Exercise_3_11b {

	public static void main(String[] args) {
		
		// Create a scanner.
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter a month and a year : ");
		byte month = reader.nextByte();
		int year = reader.nextInt();
		
		if(month <=12 && month >= 1 && year >= 1) {
			
			switch(month) {
			case 1 : 
				System.out.print("January " + year + " had " + 31 + " days."); 
				break;
			case 2 : 
				if((year%4 == 0 && year%100 != 0) || (year%400 == 0))
					System.out.print("February " + year + " had " + 29 + " days.");
				else
					System.out.print("February " + year + " had " + 28 + " days.");
				break;
			case 3 : 
				System.out.print("March " + year + " had " + 31 + " days."); 
				break;
			case 4 : 
				System.out.print("April " + year + " had " + 30 + " days."); 
				break;
			case 5 : 
				System.out.print("May " + year + " had " + 31 + " days."); 
				break;
			case 6 : 
				System.out.print("June " + year + " had " + 30 + " days.");
				break;
			case 7 : 
				System.out.print("July " + year + " had " + 31 + " days."); 
				break;
			case 8 : 
				System.out.print("August " + year + " had " + 31 + " days."); 
				break;
			case 9 : 
				System.out.print("September " + year + " had " + 30 + " days.");
				break;
			case 10 : 
				System.out.print("October " + year + " had " + 31 + " days."); 
				break;
			case 11 : 
				System.out.print("November " + year + " had " + 30 + " days.");
				break;
			default : 
				System.out.print("December " + year + " had " + 31 + " days."); 
			}
		}
		else 
			System.out.print("Error : MAKE SURE YOUR INPUT ISN'T INVALID.");
		
		// Close scanner
		reader.close();

	}

}
