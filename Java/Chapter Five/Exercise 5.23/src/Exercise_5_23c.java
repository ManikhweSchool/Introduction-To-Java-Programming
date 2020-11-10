
public class Exercise_5_23c {

	public static void main(String[] args) {
		
		double leftToRight = 0;
		double  rightToLeft = 0;
		int n;
		
		for(n = 50000; n >= 1; n--) 
			rightToLeft += 1.0/n;
			
		
		
		n++;
		
		for(; n<=50000;n++)
			leftToRight += 1.0/n;
		
		System.out.println("The sum from right to left is " + rightToLeft);
		System.out.print("The sum from left to right is " + leftToRight);
	}

}
