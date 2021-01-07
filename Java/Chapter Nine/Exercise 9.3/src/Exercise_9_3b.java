
public class Exercise_9_3b {

	public static void main(String[] args) {
		
		
		java.util.Date date = new java.util.Date();
		
		long elapsedTime = 10000;
		
		for(;elapsedTime<=10000000000l;elapsedTime*=10) {
			System.out.println("\nTime in milliseconds : " + elapsedTime);
			date.setTime(elapsedTime);
			System.out.println(date);
		}
		
		
			
	}

}
