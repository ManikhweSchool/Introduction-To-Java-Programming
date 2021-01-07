
public class Exercise_6_12a {

	public static void main(String[] args) {
		
		printChars('x', '(', 5);

	}
	
	public static void printChars(char ch1, 
	char ch2, int numberPerLine) {
		 
		int count = 1;
		
		char currentCharacter = (ch1<ch2)?ch1:ch2;
		char lastChar = (ch1>ch2)?ch1:ch2;
		
		while(currentCharacter <= lastChar) {
			if(count%numberPerLine==0)
				System.out.println(currentCharacter);
			else
				System.out.print(currentCharacter + " ");
			count++;
			currentCharacter++;
		}
	}

}
