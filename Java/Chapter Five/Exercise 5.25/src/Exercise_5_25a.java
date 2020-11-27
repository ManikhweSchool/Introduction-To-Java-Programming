
public class Exercise_5_25a {

	public static void main(String[] args) {
		
		int i = 10000;
		
		// Iterate for all i values.
		while(i <= 100000) {
			double sum = 0;
			int count = 1;
			short j = 1;
			
			// Iterate for 1, 3, 5...2*i
			while(j<=2*i-1) {
				if(j < 2*i-1) {
					if(count%2==0)
						sum -= 1.0/j;
					else
						sum += 1.0/j;
					count++;
				}
				else
					sum += Math.pow(-1, i+1)/j;
				j += 2;
				
			}
			
			System.out.println("The PI approximate for i = " + i 
			+ " is " + 4*sum);
			i += 10000; 
		}

	}

}
