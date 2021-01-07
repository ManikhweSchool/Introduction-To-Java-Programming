
public class Exercise_6_1b {

	public static void main(String[] args) {
		
		// Current value of n.
		int n =1;
		
		// Used to display 10 numbers per line.
		int count = 0;
		
		while(n<=100) {
			
			if(count%10==0 && count != 0)
				System.out.print("\n" + getPentagonalNumber(n) + "\t");
			else
				System.out.print(getPentagonalNumber(n) + "\t");
			count++;
			n++;
		}
		
	}
	
	public static int getPentagonalNumber(int n) {
		
		return n*(3*n-1)/2;
	}

}
