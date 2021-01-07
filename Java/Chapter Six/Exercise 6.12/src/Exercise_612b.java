
public class Exercise_612b {

	public static void main(String[] args) {
		
		printChars('r','@',6);
	}
	
	public static void printChars(char ch1, char ch2, 
	int numberPerLine) {
		
		int count = 1;
		
		for(char character = (ch1<ch2)?ch1:ch2;
		character < ((ch1>ch2)?ch1:ch2);character++) {
			System.out.printf("%c" + 
			((count%numberPerLine==0)?"\n":" "), 
			character);
			count++;
		}
	}

}
