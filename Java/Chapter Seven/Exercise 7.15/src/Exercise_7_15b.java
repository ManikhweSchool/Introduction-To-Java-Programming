import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Exercise_7_15b {

	// Applied Concept To Research - LinkedHashSet
	// visit www.manikhweschool.com to learn more about it.
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
	
	public static int[] eliminateDuplicates(int[] list) {
		
		TreeSet<Integer> set = new TreeSet<>();
		
		for(int number : list)
			set.add(number);
		
		int[] newList = new int[set.size()];
		
		int itemIndex = 0;
		for(int item : set)
			newList[itemIndex++] = item;
		
		return newList;
	}

}
