
public class Exercise_2_18b {

	public static void main(String[] args) {
		
		final int ONE = 1;
		final int TWO = 2;
		final int THREE = 3;
		final int FOUR = 4;
		final int FIVE = 5;
		final int SIX = 6;
		
		// Display heading
		System.out.println("a\tb\tpow(a,b)");
		System.out.println(ONE + "\t" + TWO + "\t" + (int)Math.pow(ONE, TWO));
		System.out.println(TWO + "\t" + THREE + "\t" + (int)Math.pow(TWO, THREE));
		System.out.println(THREE + "\t" + FOUR + "\t" + (int)Math.pow(THREE, FOUR));
		System.out.println(FOUR + "\t" + FIVE + "\t" + (int)Math.pow(FOUR,FIVE));
		System.out.println(FIVE + "\t" + SIX + "\t" + (int)Math.pow(FIVE, SIX));
	}

}
