import java.util.Scanner;

public class Exercise_8_19c {

	public static void main(String[] args) {
		
		// Create a scanner.
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Enter number of rows : ");
		byte rows = scanner.nextByte();
				
		System.out.print("Enter number of columns : ");
		byte columns = scanner.nextByte();
				
		int[][] values = new int[rows][columns];
				
		System.out.print("Enter matrix : ");
		for(byte r = 0; r < values.length;r++)
			for(byte c = 0; c < values[r].length;c++)
				values[r][c] = scanner.nextInt();
				
		if(isConsecutiveFour(values))
			System.out.print("True");
		else
			System.out.print("False");
				
		// Close scanner
		scanner.close();
	}
	
	public static boolean isConsecutiveFour(int[][] values) {
		
		byte number; // Used for finding count.
		byte count;
		
		for(byte r = 0; r < values.length;r++) {
			for(byte c = 0; c < values[r].length;c++) {
				count = 1;
				
				// Horizontal Check
				for(number=1; number<=3;number++) 
					if(c+number<values[r].length &&
					values[r][c]==values[r][c+number]) 
						count++;
					else
						break;
					
				if(count==4) {
					System.out.println("Number : " + values[r][c]
					+ " Row : " + r + " Column : " + c);
					return true;
				}
				
				count = 1;
				
				// Vertical Check
				for(number=1; number<=3;number++) 
					if(r+number<values.length &&
					values[r][c]==values[r+number][c]) 
						count++;
					else
						break;
					
				if(count==4) {
					System.out.println("Number : " + values[r][c]
					+ " Row : " + r + " Column : " + c);
					return true;
				}
				
				count = 1;
				
				// Major Diagonal Check
				for(number=1; number<=3;number++) 
					if(r+number<values.length &&
					c+number<values[r].length &&
					values[r][c]==values[r+number][c+number]) 
						count++;
					else
						break;
					
				if(count==4) {
					System.out.println("Number : " + values[r][c]
					+ " Row : " + r + " Column : " + c);
					return true;
				}
				
				count = 1;
				
				// Sub Diagonal Check
				for(number=1; number<=3;number++) 
					if(r+number<values.length &&
					c-number>=0 &&
					values[r][c]==values[r+number][c-number]) 
						count++;
					else
						break;
					
				if(count==4) {
					System.out.println("Number : " + values[r][c]
					+ " Row : " + r + " Column : " + c);
					return true;
				}
			}
		}
		
		return false;
	}

}
