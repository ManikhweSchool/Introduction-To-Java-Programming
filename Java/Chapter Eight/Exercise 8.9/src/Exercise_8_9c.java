import java.util.Scanner;

public class Exercise_8_9c {

	public static void main(String[] args) {
		
		// Create a scanner
		Scanner scanner = new Scanner(System.in);
		
		Grid grid = new Grid();
		
		byte row,column;
		
		byte turn = 1;
		
		String gameStatus;
		
		do {
			grid.display();
			if(turn%2!=0) {
				System.out.print("Enter a row(0,1 or 2) for player X : ");
				row = scanner.nextByte();
				System.out.print("Enter a column(0,1 or 2) for player X : ");
				column = scanner.nextByte();
				gameStatus = grid.insert(row, column, 'X');
			}
			else {
				System.out.print("Enter a row(0,1 or 2) for player O : ");
				row = scanner.nextByte();
				System.out.print("Enter a column(0,1 or 2) for player O : ");
				column = scanner.nextByte();
				gameStatus = grid.insert(row, column, 'O');
			}
			
			if(gameStatus.equalsIgnoreCase("token inserted")) {
				if(grid.isGameOver(row, column)) {
					grid.display();
					System.out.print(((turn%2!=0)?'X':'O') + " player won.");
					break;
				}
				else if(grid.isDraw()) {
					grid.display();
					System.out.print("Game Over : Draw");
				}
				turn++;
			}
			else {
				System.out.println(gameStatus);
			}
			
		}while(!grid.isDraw());
		
		// Close scanner
		scanner.close();

	}

}
