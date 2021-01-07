
public class Exercise_6_27a {

	public static void main(String[] args) {
		
		int count = 0;
		long number = 0;
		
		while(count<100) {
			if(isPrime(number) && !isPalindrome(number)
			&& isPrime(reversedPrime(number))) {
				count++;
				if(count%10==0)
					System.out.println(number);
				else
					System.out.print(number + " ");
			}
				
			number++;	
		}
		
	}
	
	public static long reversedPrime(long prime) {
		
		long reversedPrime = 0; // 131 
		
		while(prime>0) {
			reversedPrime *= 10;
			reversedPrime += (prime%10);
			prime /= 10;
			
			if(prime==0)
				break;
		}
		
		return reversedPrime;
	}
	
	
	public static boolean isPalindrome(long number) {
		
		String word = String.valueOf(number);
		
		int rightIndex = word.length()-1;
		int leftIndex = 0;
		
		while(rightIndex>leftIndex) {
			if(word.charAt(leftIndex) != 
			word.charAt(rightIndex))
				return false;
			rightIndex--;
			leftIndex++;
		}
		
		return true;
	}
	
	public static boolean isPrime(long number) {
		
		if(number==0 || number==1) return false;
		
		for(long divisor = 2; divisor <= Math.sqrt(number);divisor++)
			if(number%divisor==0)
				return false;
		return true;
	}
	
	

}
