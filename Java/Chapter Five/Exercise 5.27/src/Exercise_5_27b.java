
public class Exercise_5_27b {

	public static void main(String[] args) {
		
		short numberOfYears = 0;
		short year = 101;
		
		while(year<=2100) {
			if((year%4==0 && year%100 != 0) || (year%400==0))
				System.out.print(year + (((++numberOfYears)%10 != 0)?
				" " : "\n"));
			/*
			if(numberOfYears%100==0) 
				System.out.println("\nThe above years are the first " +
				((numberOfYears/10)*10) + " leap years of the period.");
			*/
			
			year++;
		}
		System.out.print("\nThe number of leap years on the given period is " + numberOfYears);

	}

}
