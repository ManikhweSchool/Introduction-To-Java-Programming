import java.util.Scanner;

public class Exercise_5_48b {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a word/sentence : ");
		
		String userInput = scanner.nextLine();
		
		int index = 1;
		
		while(index < userInput.length()) {
			if(index%2 != 0) 
				System.out.print(userInput.charAt(index-1));
				
			
			index++;
		}
		
		
		scanner.close();
	}

}
