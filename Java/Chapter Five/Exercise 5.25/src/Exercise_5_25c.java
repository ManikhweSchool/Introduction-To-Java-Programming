public class Exercise_5_25c {

	public static void main(String[] args) {
		
		for(int i = 10000; i <= 100000; i+=10000) {
			double sum = 0;
			boolean usePlus = true;
			
			for(int j = 1; j <= 2*i-1; j += 2) {
				if(j < 2*i-1) {
					sum =  ((usePlus)? sum + 1.0/j: sum - 1.0/j);
					usePlus = !usePlus;
					
				}
				else
					sum += Math.pow(-1, i+1)/j;
			}
			System.out.println("PI is approximately " + 4*sum + " for i = " + i);
		}
	}
}