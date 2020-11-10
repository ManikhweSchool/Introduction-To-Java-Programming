
public class Exercise_4_25a {

	public static void main(String[] args) {
		
		String plateNumber = "";
		
		// A first random number for the first letter.
		byte firstCharacterPresenter = (byte)(1+(Math.random()*26));
		
		// A second random number for the first letter.
		byte secondCharacterPresenter = (byte)(1+(Math.random()*26));
				
		// A third random number for the first letter.
		byte thirdCharacterPresenter = (byte)(1+(Math.random()*26));
		
		// Deal with first letter of the plate number.
		switch(firstCharacterPresenter) {
		case 1 : plateNumber += 'A';break;
		case 2 : plateNumber += 'B';break;
		case 3 : plateNumber += 'C';break;
		case 4 : plateNumber += 'D';break;
		case 5 : plateNumber += 'E';break;
		case 6 : plateNumber += 'F';break;
		case 7 : plateNumber += 'G';break;
		case 8 : plateNumber += 'H';break;
		case 9 : plateNumber += 'I';break;
		case 10 : plateNumber += 'J';break;
		case 11 : plateNumber += 'K';break;
		case 12 : plateNumber += 'L';break;
		case 13 : plateNumber += 'M';break;
		case 14 : plateNumber += 'N';break;
		case 15 : plateNumber += 'O';break;
		case 16 : plateNumber += 'P';break;
		case 17 : plateNumber += 'Q';break;
		case 18 : plateNumber += 'R';break;
		case 19 : plateNumber += 'S';break;
		case 20 : plateNumber += 'T';break;
		case 21 : plateNumber += 'U';break;
		case 22 : plateNumber += 'V';break;
		case 23 : plateNumber += 'W';break;
		case 24 : plateNumber += 'X';break;
		case 25 : plateNumber += 'Y';break;
		default : plateNumber += 'Z';
		}
		// Deal with second letter of the plate number.
		switch(secondCharacterPresenter) {
		case 1 : plateNumber += 'A';break;
		case 2 : plateNumber += 'B';break;
		case 3 : plateNumber += 'C';break;
		case 4 : plateNumber += 'D';break;
		case 5 : plateNumber += 'E';break;
		case 6 : plateNumber += 'F';break;
		case 7 : plateNumber += 'G';break;
		case 8 : plateNumber += 'H';break;
		case 9 : plateNumber += 'I';break;
		case 10 : plateNumber += 'J';break;
		case 11 : plateNumber += 'K';break;
		case 12 : plateNumber += 'L';break;
		case 13 : plateNumber += 'M';break;
		case 14 : plateNumber += 'N';break;
		case 15 : plateNumber += 'O';break;
		case 16 : plateNumber += 'P';break;
		case 17 : plateNumber += 'Q';break;
		case 18 : plateNumber += 'R';break;
		case 19 : plateNumber += 'S';break;
		case 20 : plateNumber += 'T';break;
		case 21 : plateNumber += 'U';break;
		case 22 : plateNumber += 'V';break;
		case 23 : plateNumber += 'W';break;
		case 24 : plateNumber += 'X';break;
		case 25 : plateNumber += 'Y';break;
		default : plateNumber += 'Z';
			
		}
		
		// Deal with third letter of the plate number.
		switch(thirdCharacterPresenter) {
		case 1 : plateNumber += 'A';break;
		case 2 : plateNumber += 'B';break;
		case 3 : plateNumber += 'C';break;
		case 4 : plateNumber += 'D';break;
		case 5 : plateNumber += 'E';break;
		case 6 : plateNumber += 'F';break;
		case 7 : plateNumber += 'G';break;
		case 8 : plateNumber += 'H';break;
		case 9 : plateNumber += 'I';break;
		case 10 : plateNumber += 'J';break;
		case 11 : plateNumber += 'K';break;
		case 12 : plateNumber += 'L';break;
		case 13 : plateNumber += 'M';break;
		case 14 : plateNumber += 'N';break;
		case 15 : plateNumber += 'O';break;
		case 16 : plateNumber += 'P';break;
		case 17 : plateNumber += 'Q';break;
		case 18 : plateNumber += 'R';break;
		case 19 : plateNumber += 'S';break;
		case 20 : plateNumber += 'T';break;
		case 21 : plateNumber += 'U';break;
		case 22 : plateNumber += 'V';break;
		case 23 : plateNumber += 'W';break;
		case 24 : plateNumber += 'X';break;
		case 25 : plateNumber += 'Y';break;
		default : plateNumber += 'Z';
					
		}
		
		// Find first random digit (0-9)
		byte firstDigit = (byte)(Math.random()*10);
		
		// Find second random digit (0-9)
		byte secondDigit = (byte)(Math.random()*10);

		// Find third random digit (0-9)
		byte thirdDigit = (byte)(Math.random()*10);
				
		// Find forth random digit (0-9)
		byte forthDigit = (byte)(Math.random()*10);
		
		plateNumber += firstDigit ;
		plateNumber += secondDigit;
		plateNumber += thirdDigit;
		plateNumber += forthDigit;
		
		System.out.println("A random generated number plate is " + plateNumber);
	}
	

}
