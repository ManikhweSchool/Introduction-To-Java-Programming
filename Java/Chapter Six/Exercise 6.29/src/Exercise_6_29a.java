
public class Exercise_6_29a {

	public static void main(String[] args) {
		
		
		for(short number = 1; number <= 100; number++) {
			if(isPrime(number))
				if(isPrime((short)(number+2)))
					System.out.println("(" + number + ","
					+ (number+2) + ")");
					
		}
	}

	public static boolean isPrime(short number) {
		
		if(number<=1) return false;
		
		for(int i = 2; i <= Math.sqrt(number);i++)
			if(number%i==0)
				return false;
		return true;
	}
}
