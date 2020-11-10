import java.util.Scanner;

public class Exercise_3_11c {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a month and year : ");
		byte month = input.nextByte();
		int year = input.nextInt();
		
		if(month < 1 || month > 12 || year < 1) {
			System.out.print("Error : Month should be between 1 and 12.\nYear should be atleast 1.");
			System.exit(0);
		}
		
		switch(month) {
		case 1 :
			System.out.print("January");
			break;
		case 2 : 
			System.out.print("February");
			break;
		case 3 :
			System.out.print("March");
			break;
		case 4 : 
			System.out.print("April");
			break;
		case 5 :
			System.out.print("May");
			break;
		case 6 : 
			System.out.print("June");
			break;
		case 7 : 
			System.out.print("July");
			break;
		case 8 :
			System.out.print("August");
			break;
		case 9 : 
			System.out.print("September");
			break;
		case 10 :
			System.out.print("October");
			break;
		case 11 : 
			System.out.print("November");
			break;
		case 12 :
			System.out.print("December");
		}
		
		if(month==1 || month==3 || 
		month==5 || month==7 || month==8
		|| month==10 || month==12)
			System.out.print(" " + year + " had 31 days");
		else if(month==2) 
			System.out.print(" " + year + " had " + 
			(((year%4==0 && year%100 != 0) || year%400==0)? 29 :28)
			+ " days.");
		else
			System.out.print(" " + year + " had 30 days");
		input.close();
	}
}
