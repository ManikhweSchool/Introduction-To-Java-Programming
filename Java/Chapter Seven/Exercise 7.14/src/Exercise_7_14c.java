import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercise_7_14c {

	/* Applied Concepts To Research - Auto boxing,
	   Auto un-boxing, Collections Interface, 
	   Arrays Class And ArrayList.*/
	// visit www.manikhweschool.com to more about these concepts.
	public static void main(String[] args) {
		
		Integer[] numbers1 = {new Integer(12),
		new Integer(8),new Integer(24),
		new Integer(32),new Integer(40)};
		System.out.println("numbers1 gcd : " + gcd(numbers1));
		Integer[] numbers2 = {122,58,234,132,528,342,470, 8,32,70};
		System.out.print("numbers2 gcd : " + gcd(numbers2));

	}
	
	public static int gcd(Integer...list) {
		
		int gcd = 1;
		int count = 1;
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(list));
		int min = Collections.min(numbers);
		
		boolean dividable = true;
		
		do {
			dividable = true;
			for(int i = 0; i < numbers.size() && 
			(gcd+count)<=min;i++) {
				if(numbers.get(i)%(gcd+count) != 0) {
					dividable = false;
					break;
				}
			}
			
			if(dividable) {
				gcd += count;
				count = 1;
				dividable = false;
			}
			else
				count++;
				
		}while(!dividable && (gcd+count)<=min);
		
		return gcd;
	}

}
