
public class Exercise_5_6b {

	public static void main(String[] args) {
		
		final double KILOMETERS_PER_MILE = 1.609;
		final double MAXIMUM_MILES = 10;
		final double MAXIMUM_KILOMETERS = 65;
		
		
		System.out.println("Miles\tKilometers\t|\tKilometers\tMiles");
		
		for(int fromMiles = 1,fromKilometers = 20; 
		fromMiles<=MAXIMUM_MILES && fromKilometers <= MAXIMUM_KILOMETERS;
		fromKilometers += 5,fromMiles += 1) {
			
			double toKilometers = fromMiles*KILOMETERS_PER_MILE;
			double toMiles = fromKilometers/KILOMETERS_PER_MILE;
			
			System.out.printf("%d\t%2.3f\t\t|\t%d\t\t%2.3f\n",
			fromMiles,toKilometers,fromKilometers,toMiles);
		}
	}

}
