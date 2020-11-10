
public class Exercise_5_5b {

	public static void main(String[] args) {
		
		final double POUNDS_PER_KILOGRAM = 2.2;
		final int MAXIMUM_KILOGRAMS = 199;
		final int MAXIMUM_POUNDS = 515;
		
		int fromPounds = 20;
		double toPounds;
		
		int fromKilograms = 1;
		double toKilograms;
		
		System.out.println("Kilograms\tPounds\t|\tPounds\tKilograms");

		do {
			toKilograms = fromPounds/POUNDS_PER_KILOGRAM;
			toPounds = fromKilograms*POUNDS_PER_KILOGRAM;
			
			System.out.printf("%d\t\t%3.1f\t|\t%d\t%3.2f\n", 
			fromKilograms,toPounds,fromPounds,toKilograms);
			
			fromKilograms += 2;
			fromPounds+=5;
			
		}while(fromPounds<=MAXIMUM_POUNDS && 
		fromKilograms<=MAXIMUM_KILOGRAMS);
		
	}

}
