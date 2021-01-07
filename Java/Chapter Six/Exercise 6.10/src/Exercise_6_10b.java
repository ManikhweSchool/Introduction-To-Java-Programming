
public class Exercise_6_10b {

	final static int MAX = 10000;
	
	public static void main(String[] args) {
		
		System.out.print("There are " + findNumberOfPrimes() + 
		" prime numbers less than " + MAX + ".");

	}
	
	public static int findNumberOfPrimes() {
		
		int count = 0;
		
		for(int number = 1; number <= MAX;number++) {
			if(isPrime(number))
				count++;
		}
		
		return count;
	}
	
	public static boolean isPrime(int number) {
		
		for(int divisor = 2; divisor<number/2;divisor++) {
			if(number%divisor==0)
				return false;
		}
		
		return true;
	}

}
