
public class Exercise_5_20a {

	public static void main(String[] args) {
		
		boolean isPrime;
		int count = 0;
		
		for(int i = 2; i <= 1000;i++) {
			isPrime = true;
			for(int j = 2; j < i/2;j++) {
				if(i%j==0) {
					isPrime = false;
					break;
				}
				
			}
			
			if(isPrime) {
				count++;
				System.out.print(i + ((count%8==0)?"\n":" "));
			}
		}
	}

}
