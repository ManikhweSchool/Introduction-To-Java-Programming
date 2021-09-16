import java.util.Scanner;

public class Exercise_8_11a {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		short number = scanner.nextShort();
		
		if(number<=512 && number>=1) {
			boolean[][] grid = new boolean[3][3];
			
			createGrid(grid,number);
			display(grid);
		}
		else {
			System.err.print("Error : Invalid Number");
		}
		
		scanner.close();
	}
	
	public static void createGrid(boolean[][] grid, short number) {
		
		short sum = 0;
		byte exponent = 8;
		
		boolean finished = false;
		
		for(byte i = 0; i < grid.length && !finished;i++) {
			for(byte j = 0; j < grid[0].length;j++) {
				if(sum + Math.pow(2, exponent)<=number) {
					sum += Math.pow(2, exponent);
					grid[i][j] = true;
					if(sum==number) {
						finished = true;
						break;
					}
				}
				exponent--;
			}
		}
	}
	
	public static void display(boolean[][] grid) {
		
		for(byte i = 0; i < grid.length;i++) {
			for(byte j = 0; j < grid[0].length;j++) {
				if(grid[i][j]) 
					System.out.print("T ");
				
				else
					System.out.print("F ");
			}
			System.out.println();
		}
	}

}
