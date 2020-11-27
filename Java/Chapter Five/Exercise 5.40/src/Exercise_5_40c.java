
public class Exercise_5_40c {

	public static void main(String[] args) {
		
		final int NUMBER_OF_TRIALS = 1000000;
		
		int numberOfHeads = 0;
		
		int numberOfTimes = 1;
		
		for(;numberOfTimes<=NUMBER_OF_TRIALS;numberOfTimes++) 
			if((int)(Math.random()*2)==1)
				numberOfHeads++;
		
		System.out.print("Heads : " + numberOfHeads +
		"\nTails : " + (NUMBER_OF_TRIALS-numberOfHeads));
		
	}

}
