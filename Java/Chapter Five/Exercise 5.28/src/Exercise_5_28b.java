import java.util.Scanner;

public class Exercise_5_28b {

	public static void main(String[] args) {
		
		// Create a scanner
		Scanner scanner = new Scanner(System.in);

		// Prompts the user to enter a year
		System.out.print("Enter year : ");
		short year = scanner.nextShort();
		
		if(year < 0) {
			System.out.println("Error : Incorrect Year Input.");
			System.exit(0);
		}
		
		// Prompts the user to enter a day.
		System.out.print("Enter day(1-7) : ");
		byte day = scanner.nextByte();
		
		if(day<0) {
			System.out.println("Error : Incorrect Day Input.");
			System.exit(1);
		}
		
		String dayName;
		String monthName;
		
		for(int month = 1; month <=12; month++) {
			switch(month) {
			case 1 : monthName = "January"; break;
			case 2 : monthName = "February"; break;
			case 3 : monthName = "March"; break;
			case 4 : monthName = "April"; break;
			case 5 : monthName = "May"; break;
			case 6 : monthName = "June"; break;
			case 7 : monthName = "July"; break;
			case 8 : monthName = "August"; break;
			case 9 : monthName = "September"; break;
			case 10 : monthName = "October"; break;
			case 11 : monthName = "November"; break;
			default : monthName = "December";
			}
			
			switch(day) {
			case 1 : dayName = "Monday"; break;
			case 2 : dayName = "Tuesday"; break;
			case 3 : dayName = "Wednesday"; break;
			case 4 : dayName = "Thursday"; break;
			case 5 : dayName = "Friday"; break;
			case 6 : dayName = "Surtaday"; break;
			default : dayName = "Sunday";
			
			}
			
			System.out.println(monthName + " 1, " + year +
			" is " + dayName);
			
			if(month==1 || month==3 || month==5 || month==7 ||
			month==8 || month==10 || month==12)
				day = (byte) (1+ (day+30)%7);
			else if(month==2)
				if((year%4==0 && year%100 != 0) || (year%400==0))
				day = (byte) (1+ (day+28)%7);
				else
					day = (byte) (1+ (day+27)%7);
			else
				day = (byte) (1+ (day+29)%7);
				
		}
		
		// Close scanner
		scanner.close();
	}

}
