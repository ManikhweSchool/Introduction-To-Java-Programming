
public class Exercise_5_23a {

	public static void main(String[] args) {
		
		double leftToRight = 0;
		double rightToLeft = 0;
		int n = 50000;
		
		while(n>=1) {
			rightToLeft += 1.0/n;
			n--;
		}
		
		n = 1;
		
		while(n<=50000) {
			leftToRight += 1.0/n;
			n++;
		}
		
		System.out.println("The sum from right to left is " + rightToLeft);
		System.out.print("The sum from left to right is " + leftToRight);
		
	}

}
