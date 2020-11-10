
public class Exercise_5_19a {

	public static void main(String[] args) {
		
		final byte NUMBER_OF_LINES = 8;
		int leftExponent, rightExponent;
		
		for(int row = 0; row < NUMBER_OF_LINES;row++) {
			leftExponent = 0;
			rightExponent = -1;
			/*When done printing numbers on the left of the middle number
			 * inclusively, we assign the left exponent value to the 
			 * right exponent variable.*/
			for(int column = -NUMBER_OF_LINES+1;column < NUMBER_OF_LINES;column++) {
				// Print the middle number
				if(column==0) {
					System.out.print((int)Math.pow(2, leftExponent) + "\t");
					if(row==0)
						break;
					else {
						rightExponent = leftExponent;
						System.out.print((int)Math.pow(2, --rightExponent) + "\t");
					}
				}
				else if(row != 0 && column >-row-1 && column<row+1) {
					if(column<0)
						System.out.print((int)Math.pow(2, leftExponent++) + "\t");
					else if(column>0) {
						// Make sure the last number of the row is 1.
						if(rightExponent==0)
							break;
						else {
							System.out.print((int)Math.pow(2, --rightExponent) + "\t");
						}
					}
				}
				else
					// Deal with all spaces to the left of each row.
					System.out.print("\t");
			}
			System.out.println();
		}

	}

}
