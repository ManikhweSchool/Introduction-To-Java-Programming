import java.util.Scanner;

public class Exercise_7_10a {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter 10 numbers : ");
		double[] list = new double[10];
		int count = 1;
		while(count<=10) {
			list[count-1] = scanner.nextDouble();
			count++;
		}
		
		System.out.print("The minimum number's index is : " + indexOfSmallestElement(list));
		
		scanner.close();

	}
	
	public static int indexOfSmallestElement(double[] array) {
		
		double min = array[0];
		int minIndex = 0;
		
		for(int i = 0; i < array.length;i++)
			if(min>array[i]) {
				min = array[i];
				minIndex = i;
			}
		return minIndex;	
	}

}
