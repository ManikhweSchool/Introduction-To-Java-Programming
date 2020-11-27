
public class Exercise_5_33a {

	public static void main(String[] args) {
		
		int sumOfDivisors;
		
		// Question 1.
		for(int numberToCheck = 10000; numberToCheck>= 6; numberToCheck--) {
			sumOfDivisors = 0;
			
			// Question 2.
			for(int divisor = numberToCheck/2; divisor>=1;divisor--) {
				if(numberToCheck%divisor==0)
					sumOfDivisors += divisor;
			}
			
			if(sumOfDivisors==numberToCheck)
				System.out.print(numberToCheck + "\t");
		}
		
		// Question 3.
	}

}
