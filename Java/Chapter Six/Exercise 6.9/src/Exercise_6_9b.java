
public class Exercise_6_9b {

	public static void main(String[] args) {
		
		displayTable();
	}
	
	/*Show the table on the console.*/
	public static void displayTable() {
		
		double fromMeter = 20;
		double fromFoot = 1.0;
		
		System.out.println("Feet\t\tMeters\t\t|\tMeters\t\tFeet");
		System.out.println("------------------------------------------------------");
		
		for(int count = 1; count<=10;count++) {
			System.out.printf("%4.1f\t\t%5.3f\t\t|\t%4.1f\t\t%7.3f\n", 
			fromFoot, footToMeter(fromFoot), fromMeter,
			meterToFoot(fromMeter));
			fromFoot++;
			fromMeter += 5.0;
		}
	}
	
	/** Convert from feet to meters */ 
	public static double footToMeter(double foot) {
		return  0.305 * foot;
	}
	
	/** Convert from meters to feet */ 
	public static double meterToFoot(double meter) {
		return 3.279 * meter;
	}


}
