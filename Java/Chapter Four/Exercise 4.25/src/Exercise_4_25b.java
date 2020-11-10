
public class Exercise_4_25b {

	public static void main(String[] args) {
		
		// A random first character
		char firstCharacter = (char)(65+Math.random()*26);
		
		// A random second character
		char secondCharacter = (char)(65+Math.random()*26);
		
		// A random third character
		char thirdCharacter = (char)(65+Math.random()*26);
		
		// A first random digit (0-9)
		byte firstDigit = (byte)(Math.random()*10);
		
		// A second random digit (0-9)
		byte secondDigit = (byte)(Math.random()*10);
				
		// A third random digit (0-9)
		byte thirdDigit = (byte)(Math.random()*10);
		
		// A forth random digit (0-9)
		byte forthDigit = (byte)(Math.random()*10);
		
		System.out.println("" + firstCharacter + 
		secondCharacter + thirdCharacter +
		+ firstDigit + secondDigit + thirdDigit
		+ forthDigit);
		
	}

}
