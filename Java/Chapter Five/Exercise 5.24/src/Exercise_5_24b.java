
public class Exercise_5_24b {

	public static void main(String[] args) {
		
		byte i = 1;
		double total = 0;
		
		for(; i <= 97; i += 2) 
			total += i/(i+2.0);
		
		
		System.out.print("The sum is " + total);
	}

}
