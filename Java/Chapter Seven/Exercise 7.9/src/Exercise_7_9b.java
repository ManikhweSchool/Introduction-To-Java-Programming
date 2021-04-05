import java.util.Scanner;

public class Exercise_7_9b {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		int count = 1;
		System.out.print("Enter ten decimal numbers : ");
		double[] list = new double[10];
		
		while(count <=10) {
			list[count-1] = myScanner.nextDouble();
			count++;
		}
		
		System.out.print("The minimum number is : " + min(list));
		
		myScanner.close();

	}

	public static double min(double[] array) {
		
		double min = array[0];
		
		for(int i = 0; i < array.length;i++)
			if(min>array[i])
				min = array[i];
		return min;
	}
}
