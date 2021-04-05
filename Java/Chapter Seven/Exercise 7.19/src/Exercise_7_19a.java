import java.util.Scanner;

public class Exercise_7_19a {

	public static void main(String[] args) {
		
		System.out.print("Enter a list : "); 
		Scanner input = new Scanner(System.in);
		String[] numbers = input.nextLine().trim().split(" ");
		
		boolean isSorted = true;
		
		if(Integer.parseInt(numbers[0]) != numbers.length-1)
			System.exit(0);
		
		for(int i = 1; i < numbers.length-1;i++) {
			if((Integer.parseInt(numbers[i]) > 
			Integer.parseInt(numbers[i+1])))
				isSorted = false;
		}
		
		System.out.println("The list is " + ((isSorted)?"already":"not") + " sorted.");
				
		input.close();
	}
	
	

}
