
public class Exercise_5_4b {

	public static void main(String[] args) {
		
		final double KILOMETERS_PER_MILE = 1.609;
		
		System.out.println("Miles\tKilometers");
		/*
		for(int numberOfMiles = 1; numberOfMiles<=10;numberOfMiles++)
			System.out.printf("%d\t%1.3f\n", numberOfMiles, 
			numberOfMiles*KILOMETERS_PER_MILE);*/
		
		byte i = 1;
		
		while(i<=10) {
			System.out.printf("%d\t%1.3f\n", i, 
			i*KILOMETERS_PER_MILE);
			i++;
		}
	}

}
