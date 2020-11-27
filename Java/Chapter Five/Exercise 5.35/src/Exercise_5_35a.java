
public class Exercise_5_35a {

	public static void main(String[] args) {
		
		
		double sum = 0;
		int number = 0;
		
		for(;number <= 624;number++) {
			sum += 1.0/(Math.sqrt(number)+Math.sqrt(number+1));
		}
		
		System.out.print("The summation is : " + sum);

	}

}
