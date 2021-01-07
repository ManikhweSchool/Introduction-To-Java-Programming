import java.util.GregorianCalendar;

public class Exercise_9_5b {

	public static void main(String[] args) {
		
		GregorianCalendar calendar = new GregorianCalendar();
		
		System.out.println("Current Year : " + calendar.get(GregorianCalendar.YEAR));
		System.out.println("Current Month : " + calendar.get(GregorianCalendar.MONTH));
		System.out.println("Current Day : " + calendar.get(GregorianCalendar.DAY_OF_MONTH));

		calendar.setTimeInMillis(1234567898765L);
		
		System.out.println("\n**************After Using setdTimeInMillis***********");
		
		System.out.println("Current Year : " + calendar.get(GregorianCalendar.YEAR));
		System.out.println("Current Month : " + calendar.get(GregorianCalendar.MONTH));
		System.out.println("Current Day : " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
		
	}

}
