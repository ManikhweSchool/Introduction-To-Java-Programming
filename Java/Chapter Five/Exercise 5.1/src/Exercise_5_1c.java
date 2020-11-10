import java.util.Scanner;

public class Exercise_5_1c {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an integer, the input end if it is zero : ");
		String numbers = scanner.nextLine();
		
		if(!numbers.endsWith("0") || !numbers.contains(" ") ||
		(numbers.indexOf("0") != numbers.lastIndexOf("0"))) {
			System.out.println("Error : Invalid Input");
			System.exit(0);
		}
		
		byte numberOfPositiveElements = 0;
		byte numberOfNegetiveElements = 0;
		double total = 0;
		int numberOfElements = 0;
		
		Scanner numbersReader = new Scanner(numbers);
		String elementAsString;
		int element; // Current Element On The Sqeunce Of Numbers.
		// 11234 23562 98@3 -1232 0
		while(numbersReader.hasNext()) {
			elementAsString = numbersReader.next();
			for(int i = 0; i < elementAsString.length();i++) {
				if(i==0 && elementAsString.charAt(i)=='-')
					continue;
				if(!Character.isDigit(elementAsString.charAt(i))) {
					System.out.println("Error : A number must only contain digits.");
					System.exit(0);
				}
			}
			element = Integer.parseInt(elementAsString);
			
			if(element<0)numberOfNegetiveElements++;
			else if(element>0) numberOfPositiveElements++;
			else
				break;
			
			total += element;
			numberOfElements++;
		}
		
		System.out.println("The number of positive is " + numberOfPositiveElements);
		System.out.println("The number of negetive is " + numberOfNegetiveElements);
		System.out.println("The total is " + total);
		System.out.printf("The average is %1.2f", total/numberOfElements);
		
		scanner.close();
		numbersReader.close();
	}

}
