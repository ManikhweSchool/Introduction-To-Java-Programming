import java.util.Scanner;

public class Exercise_7_15a {

	public static void main(String[] args) {
		
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter ten decimal numbers : ");
		int count;
		int[] list = new int[10];
		
		for(count = 0; count <10;count++)
			list[count] = scanner.nextInt();
		
		System.out.print("The distinct numbers are : ");
		int[] newList = eliminateDuplicates(list);
		for(int i = 0; i < newList.length;i++)
			System.out.print(newList[i] + " ");
		
		// Close scanner
		scanner.close();

	}
	
	public static boolean contains(int element, int[] list, int lastIndex) {
		
		for(int i = 0; i < lastIndex;i++)
			if(list[i]==element)
				return true;
		return false;
	}
	
	public static int[] eliminateDuplicates(int[] list) {
		
		boolean[] duplicates = new boolean[list.length];
		int i;
		for(i = 0;i < duplicates.length;i++) {
			duplicates[i] = contains(list[i],list,i);
		}
		
		int arrayLength = 0;
		for(i = 0;i < duplicates.length;i++) {
			if(!duplicates[i])
				arrayLength++;
		}
		
		int newArray[] = new int[arrayLength];
		int newArrayIndex = 0;
		
		for(i = 0;i < duplicates.length;i++) {
			if(!duplicates[i])
				newArray[newArrayIndex++] = list[i];
		}
		
		return newArray;
	}

}
