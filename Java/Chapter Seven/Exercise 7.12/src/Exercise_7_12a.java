import java.util.Scanner;

public class Exercise_7_12a {

	public static void main(String[] args) {
		
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		double[] list = new double[10];
		System.out.print("Enter ten numbers : ");
		
		
		int count = 0;
		
		while(count<10) 
			list[count++] = scanner.nextDouble();
		reverse(list);
		
		for(double item : list)
			System.out.print(item + " ");
		
		// Close scanner
		scanner.close();

	}
	
	public static void reverse(double[] array) {
		
		int low = 0;
		int high = array.length-1;
		double temp; // Useful for swapping two unequal elements.
		
		while(low<high){
			if(array[low] != array[high]) {
				temp = array[low];
				array[low] = array[high];
				array[high] = temp;
			}
			low++;
			high--;
		}
		
	}

}
