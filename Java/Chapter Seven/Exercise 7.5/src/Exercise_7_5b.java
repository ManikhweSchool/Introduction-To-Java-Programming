import java.util.LinkedHashSet;
import java.util.Scanner;

public class Exercise_7_5b {
	/*Applied Concepts To Research - LinkedHashSet.*/
	//visit www.manikhweschool.com to learn more about it.
	public static void main(String[] args) {
		

		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter ten numbers : ");
		String[] numbersAsString = reader.nextLine().split(" ");
		
		if(numbersAsString.length != 10) {
			System.err.print("Error : Make sure yout enter 10 numbers.");
			System.exit(0);
		}
		
		LinkedHashSet<Integer> setOfNumbers = new LinkedHashSet<>();
		
		for(int i = 0; i < numbersAsString.length;i++) {
			String number = numbersAsString[i];
			setOfNumbers.add(Integer.parseInt(number));
		}
		
		System.out.println("The number of distinct numbers is " + setOfNumbers.size());
		System.out.println("The distinct numbers are : ");
		
		for(Integer number : setOfNumbers)
			System.out.print(number + " ");
		
		reader.close();
			
	}

}
