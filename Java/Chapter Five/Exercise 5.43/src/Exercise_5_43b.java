
public class Exercise_5_43b {

	public static void main(String[] args) {
		
		
		byte firstNumber = 1;
		byte secondNumber;
		byte count = 0;
		
		while(firstNumber <= 7) {
			secondNumber = 1;
			while(secondNumber<=7) {
				if(firstNumber<secondNumber) {
					System.out.println(firstNumber + " " 
					+ secondNumber);
					count++;
				}
				secondNumber++;
			}
			firstNumber++;
		}
		
		System.out.print("\nThe total number "
		+ "of all combinations is " + count + ".");
	}

}
