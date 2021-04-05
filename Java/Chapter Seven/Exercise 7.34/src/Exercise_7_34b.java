import java.util.Scanner;

public class Exercise_7_34b {

	public static void main(String[] args) {
		
		System.out.print("Enter a string : ");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		System.out.print(sort(word));
		
		// Close scanner
		scanner.close();

	}
	
	public static String sort(String s) {
		
		char min;
		int minIndex;
		StringBuilder sortedString = new StringBuilder(s);
		
		for(int i = 0; i < sortedString.length()-1;i++) {
			min = sortedString.charAt(i+1);
			minIndex = i+1;
			for(int j = i+1;j < sortedString.length();j++) {
				if(min>sortedString.charAt(j)) {
					min = sortedString.charAt(j);
					minIndex = j;
				}
					
			}
			
			if(sortedString.charAt(i)>min) {
				char tempChar = sortedString.charAt(i);
				sortedString.setCharAt(i, min);
				sortedString.setCharAt(minIndex, tempChar);
			}
		}
		
		
		return sortedString.toString();
	}

}
