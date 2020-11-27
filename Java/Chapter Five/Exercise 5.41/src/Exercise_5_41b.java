import java.util.Scanner;

public class Exercise_5_41b {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter numbers : ");	
		String sequence = input.nextLine();
		
		if(sequence.length()>=2 && 
		sequence.contains(" ") && 
		sequence.charAt(sequence.length()-1)=='0') {
			byte index = 0;
			while(index < sequence.length() && sequence.charAt(index) != 0) {
				if(!Character.isDigit(sequence.charAt(index)) &&
				sequence.charAt(index) != ' ') {
					System.out.print("Error : Only Numbers Are Allowed.");
					System.exit(0);
				}
				index++;
			}
			
			int count = 0;
			short max = Short.parseShort(sequence.substring(0, 
			sequence.indexOf(" ")));
			
			// Contain currentNumber.
			short number;
			
			do {
				number = Short.parseShort(sequence.substring(0, 
				sequence.indexOf(" ")));
				
				if(max < number) {
					max = number;
					count = 1;
				}
				else if(max == number)
					count++;
				
				if(sequence.contains(" "))
					sequence = sequence.substring(sequence.indexOf(" ")+1);
				else 
					sequence = "0";
				
			}while(!sequence.equals("0"));
			
			System.out.print("The largest number is " + max +
			". The occurance\nof the largest number is " + count);
		}
			
		
		
		input.close();
	}

}
