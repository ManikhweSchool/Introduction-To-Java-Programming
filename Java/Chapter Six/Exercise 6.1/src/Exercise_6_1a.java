
public class Exercise_6_1a {

	public static void main(String[] args) {
		
		// Current value of n.
		int n =1;
		
		// Used to display 10 numbers per line.
		int count = 0;
		
		while(n<=100) {
			int pentagonalNumber = getPentagonalNumber(n);
			
			if(count%10==0 && count != 0)
				System.out.print("\n" + pentagonalNumber + "\t");
			else
				System.out.print(pentagonalNumber + "\t");
			count++;
			n++;
		}
		
	}
	
	public static int getPentagonalNumber(int n) {
	
		int pentNum =  n*(3*n-1)/2;
		
		return pentNum;
	}

}
