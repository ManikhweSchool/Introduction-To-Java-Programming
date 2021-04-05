import java.util.Scanner;

public class Exercise_7_9c {

	/*Applied Concepts To Research - Generics And Comparable 
	 * Interface*/
	//visit www.manikhweschool.com to learn more about them.
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		int count = 1;
		System.out.print("Enter ten decimal numbers : ");
		Double[] list = new Double[10];
		
		while(count <=10) {
			list[count-1] = myScanner.nextDouble();
			count++;
		}
		
		System.out.print("The minimum number is : " + min(list));
		
		myScanner.close();
	}
	
	public static <E extends Comparable<E>> E min(E[] array) {
		
		E min = array[0];
		
		for(int i = 0; i < array.length;i++)
			if(min.compareTo(array[i])>0)
				min = array[i];
		return min;
				
	} 

}
