
public class Grid {

	private Cell[][] cells;
	
	public static final byte NUMBER_OF_ROWS = 3;
	public static final byte NUMBER_OF_COLUMNS = 3;
	
	public Grid() {
		cells = new Cell[NUMBER_OF_ROWS][NUMBER_OF_COLUMNS];
		createCells();
	}
	
	private void createCells() {
		
		for(int i = 0; i < NUMBER_OF_ROWS;i++)
			for(int j = 0;j < NUMBER_OF_COLUMNS;j++)
				cells[i][j] = new Cell();
	}
	
	public String insert(byte row, byte column,char token) {
		
		if(row <3 && row>=0 && column <3 && column>=0) {
			if(cells[row][column].getToken()==' ') {
				if(token=='X' || token=='O') {
					cells[row][column] = new Cell(token);
					return "Token inserted";
				}
				else
					return "Invalid Token";
				
			}
			else
				return "Choosen cell is occupied";
		}
		else
			return "Invalid row or column.";
	}
	
	public boolean isDraw() {
		
		for(byte r = 0; r < cells.length;r++)
			for(byte c = 0; c < cells.length;c++)
				if(cells[r][c].getToken()==' ')
					return false;
		
		return true;
	}
	
	public boolean isGameOver(byte row, byte column) {
		return isHorizontalSolutuion(row, column)
				|| isVerticalSolutuion(row, column) ||
				isDiagonalSolutuion(row, column);
	}
	
	private boolean isHorizontalSolutuion(byte row, byte column) {
		if(column<1) 
			return cells[row][column].equals(cells[row][column+1])
			&& cells[row][column].equals(cells[row][column+2]);
				
		else if(column>1) 
			return cells[row][column].equals(cells[row][column-1])
			&& cells[row][column].equals(cells[row][column-2]);
				
		else 
			return cells[row][column].equals(cells[row][column+1])
			&& cells[row][column].equals(cells[row][column-1]);
	}
	
	private boolean isVerticalSolutuion(byte row, byte column) {
		if(row<1) 
			return cells[row][column].equals(cells[row+1][column])
			&& cells[row][column].equals(cells[row+2][column]);
						
		else if(row>1) 
			return cells[row][column].equals(cells[row-1][column])
			&& cells[row][column].equals(cells[row-2][column]);
						
		else 
			return cells[row][column].equals(cells[row+1][column])
			&& cells[row][column].equals(cells[row-1][column]);
	}
	
	private boolean isDiagonalSolutuion(byte row, byte column) {
		if(cells[1][1].getToken()=='X' || cells[1][1].getToken()=='O')
			return (cells[1][1].getToken()==cells[0][0].getToken()
			&& cells[1][1].getToken()==cells[2][2].getToken()) ||
			(cells[1][1].getToken()==cells[0][2].getToken()
			&& cells[1][1].getToken()==cells[2][0].getToken());
		return false;
	}
	
	public void display() {
		
		for(byte row = 0; row < cells.length;row++) {
			System.out.println("-------");
			for(byte column = 0; column < cells.length;column++) {
				if(cells[row][column].getToken()=='O')
					System.out.print("|O");
				else if(cells[row][column].getToken()=='X')
					System.out.print("|X");
				else
					System.out.print("| ");
				
			}
			System.out.println('|');
		}
		System.out.println("-------");
	}
	
}
