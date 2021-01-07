import java.util.Scanner;

public class Exercise_5_44a {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter an integer : ");
		short number = scanner.nextShort();
		
		short category = 0;
		
		// Determines whether a number has been categorized.
		boolean  categorized = false;
		
		// Bits respresentations
		String bits = "";
		
		// Starting index on the 16-bit string/number.
		byte startingIndex = 15;
		
		
		// Deal with numbers that can be represented by 4-bits.
		for(byte i = 0; i <=3;i++)
			category += Math.pow(2, i);
		
		if(Math.abs(number) >=0 && Math.abs(number) <= category) {
			
			bits += "000000000000";
			startingIndex = 3;
			categorized = true;
		}
		
		// Deal with numbers that can be represented by 8-bits.
		for(byte i = 4; i <=7 && !categorized;i++)
			category += Math.pow(2, i);
		
		if(number <= category && !categorized) {
			
			bits += "00000000";
			startingIndex = 7;
			categorized = true;
		}
		
		// Deal with numbers that can be represented by 8-bits.
		for(byte i = 8; i <=11 && !categorized;i++)
			category += Math.pow(2, i);
				
		if(number <= category && !categorized) {
					
			bits += "0000";
			startingIndex = 11;
			categorized = true;
		}
		
		// Determine which bits are zeros and which bits are ones.
		int sum = 0;
		
		for(int i = startingIndex; i >= 0; i--) {
			if(sum + Math.pow(2, i) <= Math.abs(number)) {
				sum += Math.pow(2, i);
				bits += "1";
			}
			else
				bits += "0";
		}
		
		if(number<0) {
			String negatedBits = "";
			
			// Create negated bits
			for(int i = 0; i < bits.length();i++) 
				negatedBits += (bits.charAt(i)=='0')?"1":"0";
			
			// Represent a two's complement of a number in reversed order.
			String reversedTwosComplement = "";
			
			// Determines whether or not a 1 is inserted to the negated bits.
			boolean isOneInserted = false;
			
			
			for(int bitIndex = negatedBits.length()-1; 
			bitIndex >=0;bitIndex--) {
				if(negatedBits.charAt(bitIndex)=='0' 
				&& !isOneInserted) {
					reversedTwosComplement += 1;
					isOneInserted = true;
					
				}
				else if(negatedBits.charAt(bitIndex)=='1' 
				&& !isOneInserted) {
					reversedTwosComplement += 0;
				}
				else
					reversedTwosComplement += 
					negatedBits.charAt(bitIndex);
			}
			
			String twoComplementsBits = "";
			
			for(int bitIndex = reversedTwosComplement.length()-1;
			bitIndex>=0;bitIndex--) {
				twoComplementsBits += reversedTwosComplement.charAt(bitIndex);
				
			}
			
			bits = twoComplementsBits;
		}
		
		System.out.print("Decimal Value : " + number + " has "
		+ "a 16-bit value : " + bits);
		
		scanner.close();

	}

}
