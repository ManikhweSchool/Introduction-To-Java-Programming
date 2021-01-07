
public class Exercise_6_24b {

	public static void main(String[] args) {
		
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds/1000;
		
		long currentSecond = totalSeconds%60;
		long totalMinutes = totalSeconds/60;
		
		long currentMinute = totalMinutes%60;
		long totalHours = totalMinutes/60;
		
		long currentHour = totalHours%24;
		long totalDays = totalHours/24;
		
		byte currentDay, currentMonth;
		
		long tempTotalDays = totalDays;
		
		int currentYear = 1970;
		
		while(tempTotalDays>366 || tempTotalDays>365) {
			if(!isLeapYear(currentYear))
				tempTotalDays -= 365;
			else
				tempTotalDays -= 366;
			currentYear++;
		}
		
		currentMonth = 1;
		
		while(tempTotalDays>=28 && currentMonth<=12) {
			if (currentMonth == 1 || currentMonth == 3 
					|| currentMonth == 5 || currentMonth == 7 || 
					currentMonth == 8 || currentMonth == 10 || 
					currentMonth == 12)
						tempTotalDays -= 31;
					else if (currentMonth == 4 || currentMonth == 6 
					|| currentMonth == 9 || currentMonth == 11) 
						tempTotalDays -= 30;
					else {
						 if (!isLeapYear(currentYear)) 
							 tempTotalDays -= 28;
						 else
							 tempTotalDays -= 29;
					}
					currentMonth++;
		}
		
		currentDay = (byte)tempTotalDays;
		
		String currentDate = "Current Date : " + currentDay + 
		"\\" + currentMonth + "\\" + currentYear; 
		String currentTime = "\nCurrent time : " + currentHour + ":" 
		+ currentMinute + ":" + currentSecond + " GMT";
				
		// Display results       
		System.out.println(currentDate + currentTime); 
		
	}
	
	public static boolean isLeapYear(int year) { 
		return year % 400 == 0 || 
		(year % 4 == 0 && year % 100 != 0);    
	} 

}
