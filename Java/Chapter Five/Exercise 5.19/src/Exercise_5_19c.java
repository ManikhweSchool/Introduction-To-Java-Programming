
public class Exercise_5_19c {

	public static void main(String[] args) {
		
		for(int row = 0; row < 8;row++) {
			int exponent = 0;
			// Deal With Left Hand Side
			for(int leftIndex = 8; leftIndex > 1;leftIndex--) {
				if(leftIndex<=row+1)
					System.out.print((int)Math.pow(2, exponent++) + "\t");
				else
					System.out.print("\t");
			}
			
			// Deal With Right Hand Side.
			for(int rightIndex = 1; rightIndex<=row+1;rightIndex++) {
				System.out.print((int)Math.pow(2, exponent--) + "\t");
			}
			
			System.out.println();
		}
	}

}
