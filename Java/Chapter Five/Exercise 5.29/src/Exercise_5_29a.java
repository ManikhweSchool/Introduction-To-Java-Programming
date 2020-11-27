import java.util.Scanner;

public class Exercise_5_29a {

	public static void main(String[] args) {
		
		// Create a scanner to read user input.
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter year : ");
		short year = input.nextShort();
		
		System.out.print("Enter day(1-7) : ");
		byte day = input.nextByte();
		
		String monthName;
		byte month =1;
		
		while(month<=12) {
			if(month==1) monthName = "January";
			else if(month==2) monthName = "February";
			else if(month==3) monthName = "March";
			else if(month==4) monthName = "April";
			else if(month==5) monthName = "May";
			else if(month==6) monthName = "June";
			else if(month==7) monthName = "July";
			else if(month==8) monthName = "August";
			else if(month==9) monthName = "September";
			else if(month==10) monthName = "October";
			else if(month==11) monthName = "November";
			else monthName = "December";
			
			System.out.println("\n \t\t" + monthName + " " + year);
			System.out.println("----------------------------------------");
			System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSurt");
			
			String days ;
			byte startingIndex;
			
			switch(day) {
			case 1 : days = "\t";startingIndex = 1; break;
			case 2 : days = "\t\t";startingIndex = 2; break;
			case 3 : days = "\t\t\t";startingIndex = 3; break;
			case 4 : days = "\t\t\t\t";startingIndex = 4; break;
			case 5 : days = "\t\t\t\t\t";startingIndex = 5; break;
			case 6 : days = "\t\t\t\t\t\t";startingIndex = 6; break;
			default : days = ""; startingIndex = 0;
			}
			
			byte lastDayOfMonth;
			
			if(month==1 || month==3 || month==5 || 
			month==7 || month==8 || month==10 || month==12)
				lastDayOfMonth = 31;
			else if(month==2)
				if((year%4==0 && year%100 != 0) || year%400==0)
					lastDayOfMonth = 29;
				else
					lastDayOfMonth = 28;
			
			else
				lastDayOfMonth = 30;
			
			byte dayOfMonth;
			
			for(dayOfMonth = 1; dayOfMonth <= lastDayOfMonth;dayOfMonth++, startingIndex++) {
				days += dayOfMonth + (((startingIndex+1)%7==0)?"\n":"\t");
			}
			
			System.out.println(days + "\n");
			day = (byte) (1 + (day + lastDayOfMonth-1)%7);
			month++;
		}
		
		// close scanner
		input.close();
	}

}
