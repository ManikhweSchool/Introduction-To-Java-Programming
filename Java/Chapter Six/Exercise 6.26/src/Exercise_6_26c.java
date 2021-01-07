
public class Exercise_6_26c {

	public static void main(String[] args) {
		
		displayPalindromic();
	}
	
	public static void displayPalindromic() {
		
		int count = 0;
		
		long number = 0;
		
		while(count<100) {
			if(isPrime(number) && isPalindrome(number)) {
				count++;
				if(count%10==0)
					System.out.println(number);
				else
					System.out.print(number + " ");
			}
			number++;
		}
	}
	
	public static boolean isPrime(long number) {
		
		if(number==0 || number==1) return false;
		
		for(long i = 2; i<=Math.sqrt(number);i++)
			if(number%i==0)
				return false;
		
		return true;
	}
	
	public static boolean isPalindrome(long number) {
		
		String word = String.valueOf(number);
		
		int high = word.length()-1;
		int low = 0;
		
		while(high>low) {
			if(word.charAt(low) != word.charAt(high))
				return false;
			high--;
			low++;
		}
		
		return true;
	}
	
	

}
