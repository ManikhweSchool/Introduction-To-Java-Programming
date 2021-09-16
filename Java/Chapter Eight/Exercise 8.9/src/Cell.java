
public class Cell {

	private char token;
	
	public Cell() {
		token = ' ';
	}
	
	public Cell(char token) {
		if(token==' ' || token == 'X' || token=='O')
			this.token = token;
	}
	
	public char getToken() {
		return token;
	}
	
	@Override
	public boolean equals(Object anotherCell) {
		
		Cell givenCell = (Cell)anotherCell;
		
		return token==givenCell.getToken();
	}
}
