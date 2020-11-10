
public class Exercise_5_15a {

	public static void main(String[] args) {
		
		// Count number of characters already displayed.
		int c = 0;
		
		final short MAX_INDEX = 126;
		final byte MIN_INDEX = 33;
		
		int i = MIN_INDEX;
		
		while(i<=MAX_INDEX) {
			System.out.print(((char)i) + (((c+1)%10==0)?"\n":" "));
			c++;
			i++;
		}
	}

}
