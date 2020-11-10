
public class Exercise_5_7a {

	public static void main(String[] args) {
		
		final double INCREASE_RATE = 0.05;
		
		// Current year tuition
		double cyt = 10000;
		// Year number
		short yn = 1;
		
		while(yn<10) {
			cyt += cyt*INCREASE_RATE;
			yn++;
		}
		cyt += cyt*INCREASE_RATE;
		
		// TOTAL TUITION WORTH OF FOUR YEARS AFTER TEN YEARS.
		double tt = 0;
		
		System.out.println("The tuition fee after ten years is " + cyt);
		
		for(yn = 1; yn<=4;yn++) {
			cyt += cyt*INCREASE_RATE;
			tt += cyt;
		}
		
		
		System.out.println("The four years' worth tuition "
				+ "after ten years is " + tt);
		
	}

}
