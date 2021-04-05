import java.util.Scanner;

public class Exercise_7_30a {

	public static void main(String[] args) {
		
		// Create a scanner 
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("Enter the number of values : ");
		short size = myScanner.nextShort();
		
		if(size<4) {
			System.out.print("Size must be atleast four.");
			System.exit(0);
		}
		
		short[] array = new short[size];
		
		System.out.print("Enter the values : ");
		int index;
		for(index = 0; index < size; index++)
			array[index] = myScanner.nextShort();
		
		if(index < array.length) {
			System.out.print("The Number Of Elements "
			+ "Should Match Array Size.");
			System.exit(1);
		}
		
		if(!isConsecutiveFour(array))
			System.out.print("The list has no consecutive four numbers.");
		else
			System.out.print("The list has consecutive four numbers.");
		
		// Close scanner
		myScanner.close();

	}
	
	public static boolean isConsecutiveFour(short[] values) {
		
		for(int i = 0; i < values.length-4;i++) {
			int count = 1;
			for(int j = i+1;j <=i+3;j++) {
				if(values[i] != values[j])
					break;
				else
					count++;
			}
			
			if(count==4) return true;
		}
		
		return false;
	}

}
