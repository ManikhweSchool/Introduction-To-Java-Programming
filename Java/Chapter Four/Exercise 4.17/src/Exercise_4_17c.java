import java.util.Scanner;

public class Exercise_4_17c {

	public static void main(String[] args) {
		
		
		// Create a scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a year : ");
		long year = scanner.nextLong();
		
		System.out.print("Enter a month : ");
		String month  = scanner.next();
		
		if(year > 0 && month.length()==3) {
		
			String months = "Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec";
			
			if(months.indexOf(month) != -1) {
				
				byte numberOfDays = 0;
				
				switch(months.indexOf(month)) {
				case 0 : numberOfDays += 31;break;
				case 4 : 
					
					if((year%4==0 && year%400 != 0) || (year%400==0))
						numberOfDays += 29;
					else
						numberOfDays += 28;
					
					break;
				case 8 : numberOfDays += 31;break; 
				case 12 : numberOfDays += 30;break;
				case 16 : numberOfDays += 31;break;
				case 20 : numberOfDays += 30;break;
				case 24 : numberOfDays += 31;break;
				case 28 : numberOfDays += 31;break;
				case 32 : numberOfDays += 30;break;
				case 36 : numberOfDays += 31;break;
				case 40 : numberOfDays += 30;break;
				case 44 : numberOfDays += 31;break;
				}
				
				System.out.print(month + " " + year + " has " + numberOfDays + " days.");
			}
			else
				System.out.print("There Is No Month Starting With " + month + ".");
				
		}
		else
			System.out.print("Make Sure You Give A Valid Input.");
		
		
		// Close scanner
		scanner.close();

	}

}
