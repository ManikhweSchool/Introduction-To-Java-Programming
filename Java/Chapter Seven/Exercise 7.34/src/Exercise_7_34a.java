import java.util.Scanner;

public class Exercise_7_34a {

	public static void main(String[] args) {
		
		System.out.print("Enter a string : ");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		System.out.print(sort(word));
		
		// Close scanner
		scanner.close();

	}
	
	public static String sort(String s) {
		
		char[] characters = s.toCharArray();
		
		char min;
		int minIndex;
		
		for(int i = 0; i < characters.length-1;i++) {
			min = characters[i+1];
			minIndex = i+1;
			for(int j = i+1; j < characters.length;j++) {
				if(min>characters[j]) {
					min = characters[j];
					minIndex = j;
				}
			}
			
			if(characters[i]>min) {
				char temp = characters[i];
				characters[i] = min;
				characters[minIndex] = temp;
			}
		}
		
		return String.valueOf(characters);
	}

}
