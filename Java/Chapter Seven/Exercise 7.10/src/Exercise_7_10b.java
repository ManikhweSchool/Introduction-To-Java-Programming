import java.util.Scanner;

public class Exercise_7_10b {

	/*Applied Concepts To Research - Generics.*/
	//visit www.manikhweschool.com to learn more it.
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter 10 numbers : ");
		Double[] list = new Double[10];
		int count = 1;
		while(count<=10) {
			list[count-1] = scanner.nextDouble();
			count++;
		}
		
		System.out.print("The minimum number's index is : " 
		+ indexOfSmallestElement(list));
		
		scanner.close();

	}
	
	public static <E extends Comparable<E>> int indexOfSmallestElement(E[] array) {
		
		E min = array[0];
		int smallIndex = 0;
		
		for(int i = 1; i < array.length;i++)
			if(min.compareTo(array[i])>0) {
				min = array[i];
				smallIndex = i;
			}
		return smallIndex;
	}

}
