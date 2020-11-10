
public class Exercise_5_20c {

	public static void main(String[] args) {
		
		boolean isPrime;
		short count = 0;
		
		for(short number = 2; number <= 1000; number++) {
			isPrime = true;
			short divisor = 2;
			while(divisor<=Math.sqrt(number) && isPrime) {
				if(number%divisor==0)
					isPrime = false;
				divisor++;
			}
			
			if(isPrime) {
				count++;
				System.out.print(number + ((count%8==0)?"\n":" "));
			}
				
				
		}

	}

}
