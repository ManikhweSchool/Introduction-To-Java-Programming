
public class Exercise_5_24a {

	public static void main(String[] args) {
		
		double sum = 0;
		
		byte numerator = 1;
		
		while(numerator <= 97) {
			sum += numerator/(numerator+2.0);
			numerator += 2;
		}
		
		System.out.print("The sum is " + sum);

	}

}
