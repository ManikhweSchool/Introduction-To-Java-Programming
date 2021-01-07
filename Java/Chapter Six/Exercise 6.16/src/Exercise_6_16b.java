
public class Exercise_6_16b {

	public static void main(String[] args) {
		
		System.out.println("Year\tDays\n");
		for(int year = 2000; year <= 2020;year += 1) 
			System.out.println(year + "\t" + numberOfDaysInAYear(year));
		
	}
	
	public static int numberOfDaysInAYear(int year) {
		return ((year%4 == 0 && year%4000 != 0) || 
		(year%400==0))?366:365;
	}


}
