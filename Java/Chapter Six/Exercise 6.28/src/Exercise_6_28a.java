
public class Exercise_6_28a {

	public static void main(String[] args) {
		
		displayTable();
	}
	
	public static void displayTable() {
		
		System.out.println("p\t\t2^p-1");
		System.out.println("---------------------------------");
		
		for(int number = 0; number <= 31; number++) {
			if(isPrime(number))
				System.out.println(number + "\t\t" + ((int)(Math.pow(2,number))-1));
		}
	}
	
	public static boolean isPrime(long number) {
		
		if(number==0 || number==1) return false;
		
		for(int i = 2; i <= number/2;i++)
			if(number%i==0)
				return false;
		return true;
	}

}
