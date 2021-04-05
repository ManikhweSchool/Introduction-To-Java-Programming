import java.util.Scanner;

public class Exercise_7_11a {

	public static void main(String[] args) {
		
		// Create a scanner
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter ten numbers : ");
		
		double[] list = new double[10];
		
		byte count = 1;
		
		while(count<=list.length) {
			list[count-1] = scanner.nextDouble();
			count++;
		}
		
		System.out.printf("The mean is : %1.2f\n",mean(list));
		System.out.printf("The standard deviation is : %1.5f\n",
		deviation(list));
		
		// Close
		scanner.close();
	}
	
	/** Compute the mean of an array of double values */ 
	public static double mean(double[] list) {
		
		double sum = 0;
		
		for(int i = 0; i < list.length;i++)
			sum += list[i];
		
		return sum/list.length;
	} 
	
	/** Compute the deviation of double values */ 
	public static double deviation(double[] list) {
		
		double numerator = 0;
		double mean = mean(list);
		
		for(int i = 1; i <= list.length;i++)
			numerator += Math.pow(list[i-1]-mean,2);
		
		return Math.sqrt(numerator/(list.length-1));
	}

}
