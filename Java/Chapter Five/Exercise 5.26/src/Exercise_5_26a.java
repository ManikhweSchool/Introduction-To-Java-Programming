
public class Exercise_5_26a {

	public static void main(String[] args) {
		
		double e;
		
		for(int i = 10000; i <= 100000; i+=10000) {
			e = 0;
			for(int j = 1; j <= i; j++) {
				double denominator = 1;
				for(int k = j; k>= 1; k--) 
					denominator *= k;
				e += 1.0/denominator;
			}
			
			System.out.println("The e approximate for i = " + i + " is "
			+ e);
		}

	}

}
