
public class Exercise_5_10a {

	public static void main(String[] args) {
		
		int count = 1;
		
		final int MAXIMUM = 1000;
		final int MINIMUM = 100;
		
		int number = MINIMUM;
		
		while(number<=MAXIMUM) {
			if(number%5==0 && number%6==0) {
				if(count%10==0)
					System.out.println(number);
				else
					System.out.print(number + " ");
				count++;
			}
			number++;
		}

	}

}
