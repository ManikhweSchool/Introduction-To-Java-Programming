import java.util.Scanner;

public class Exercise_7_12c {

	// Applied Concept To Research - Generics
	// visit www.manikhweschool.com to learn more about Generics.
	public static void main(String[] args) {
		
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		Long[] list = new Long[10];
		System.out.print("Enter ten numbers : ");
					
		int count = 0;
				
		while(count<10) 
			list[count++] = scanner.nextLong();
		reverse(list);
		displayArray(list);
		// Close scanner
		scanner.close();
	}
	
	public static <E> void reverse(E[] list) {
		
		int low = 0;
		int high = list.length-1;
		E temp;
		
		while(low<high) {
			if(list[low] != list[high]) {
				temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
			low++;
			high--;
				
		}
	}
	
	public static <T> void displayArray(T[] list) {
		
		for(T item : list)
			System.out.print(item + " ");
	}

}
