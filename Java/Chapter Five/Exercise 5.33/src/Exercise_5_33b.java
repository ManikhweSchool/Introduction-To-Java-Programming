
public class Exercise_5_33b {

	public static void main(String[] args) {
		
		short numberOfPertectNumbers = 2;
		int divisorsTotal;
		short number = 29;
		
		System.out.print(" 6 28 ");
		
		while(number<100000) {
			divisorsTotal = 0;
			for(int divisor = 1; divisor<=number/2;divisor++) 
				if(number%divisor==0)
					divisorsTotal += divisor;
			
			if(divisorsTotal==number) {
				System.out.print(number + " ");
				numberOfPertectNumbers++;
			}
			
			if(numberOfPertectNumbers==4)
				break;
			number++;
		}
	}

}
