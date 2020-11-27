import java.util.Scanner;

public class Exercise_5_41a {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter numbers : ");
		
		String sequence = input.nextLine();
		
		int count = 1;
		char max = sequence.charAt(0);
		int index  = 0;
		
		if(sequence.length()>= 2 && sequence.charAt(sequence.length()-1) == '0') {
			while(sequence.charAt(++index) != '0') {
				if(max<sequence.charAt(index)) {
					max = sequence.charAt(index);
					count = 1;
				}
				else if(max==sequence.charAt(index))
					count++;
			}
			System.out.print("The largest number is " + max +
			". The occurance\nof the largest number is " + count);
		}
		else {
			System.out.print("Errror : Invalid Input");
			
		}
			
		
		
		
		
		
		
		input.close();

	}

}
