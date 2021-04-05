import java.util.Scanner;

public class Exercise_7_27a {

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
		+ "Identical ? : " + equals(list1,list2));
				
		// Close scanner
		input.close();

	}
	
	public static boolean equals(int[] list1, int[] list2) {
		
		if(list1.length != list2.length)
			return false;
		
		boolean[] available = new boolean[list2.length];
		
		for(int i = 0; i < list1.length;i++) {
			boolean numberAvailable = false;
			for(int j = 0; j < list2.length;j++) {
				if(list2[j]==list1[i] && !available[j]) {
					available[j] = true;
					numberAvailable = true;
					break;
				}
			}
			
			if(!numberAvailable)
				return false;
		}
		
		return true;
	}

}
