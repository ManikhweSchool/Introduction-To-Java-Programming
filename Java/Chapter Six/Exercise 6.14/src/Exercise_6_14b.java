
public class Exercise_6_14b {

	public static void main(String[] args) {
		
		displayTable();
	}
	
	public static double compute(int i) {
		
		double sum = 0;
		
		boolean isOdd = true;
		
		for(int number =1; number<=2*i-1;number+=2) {
			sum += (isOdd)?1.0/number:-1.0/number;
			isOdd = !isOdd;
		}
		
		return 4*sum;
	}
	
	public static void displayTable() {
		
		System.out.println("i\t\tm(i)");
		System.out.println("------------------------------------------------");
		
		for(int i = 1; i <= 901;i+=100)
			System.out.printf("%d\t\t%6.4f\n", i, compute(i));
	}

}
