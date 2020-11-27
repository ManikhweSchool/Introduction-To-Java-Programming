
public class Exercise_5_40a {

	public static void main(String[] args) {
		
		// Question 1.
		int numberOfTrails = 1000000;
		int numberOfTails = 0;
		int numberOfHeads = 0;
		int trailsSoFar = 1;
		
		while(trailsSoFar<=numberOfTrails) {
			if((int)(Math.random()*2)==0)
				numberOfHeads++;
			else
				numberOfTails++;
			trailsSoFar++;
		}
		
		// Question 2
		
		System.out.print("Heads : " + numberOfHeads + "\tTails : "
		+ numberOfTails);
	}

}
