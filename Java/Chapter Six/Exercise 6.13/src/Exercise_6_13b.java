
public class Exercise_6_13b {

	public static void main(String[] args) {
		
		displayResult();

	}
	
	public static void displayResult() {
		
		System.out.println("i\t\tm(i)");
		
		for(int i = 1;i < 21;i++) {
			System.out.printf("%d\t\t%7.4f\n", i,compute(i));
		}
	}

	public static double compute(int i) {
		
		double sum = 0;
		
		for(int currentNumber = 1; currentNumber<=i;currentNumber++) 
			sum += currentNumber/(currentNumber+1.0);
		
		return sum;
			
	}
}
