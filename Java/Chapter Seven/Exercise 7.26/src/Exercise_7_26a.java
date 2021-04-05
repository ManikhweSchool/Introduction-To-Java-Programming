import java.util.Scanner;

public class Exercise_7_26a {

	public static void main(String[] args) {
		
		// Create a scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter list1 : ");
		int list1Size = input.nextInt();
		int[] list1 = new int[list1Size];
		
		for(int i = 0; i < list1Size;i++) 
			list1[i] = input.nextInt();
		
		System.out.print("Enter list2 : ");
		int list2Size = input.nextInt();
		int[] list2 = new int[list1Size];
		
		for(int i = 0; i < list2Size;i++) 
			list2[i] = input.nextInt();
		
		System.out.print("Are The Two Lists "
		+ "Strictly Identical ? : " + equals(list1,list2));
		
		// Close scanner
		input.close();
	}
	
	public static boolean equals(int[] list1, int[] list2) {
		
		if(list1.length != list2.length)
			return false;
		
		for(int index = 0; index < list2.length;index++)
			if(list1[index] != list2[index])
				return false;
		return true;
	}
}
