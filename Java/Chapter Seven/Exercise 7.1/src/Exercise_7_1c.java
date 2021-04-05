import java.util.Scanner;

public class Exercise_7_1c {

	public static void main(String[] args) {
		
		// Create a scanner
		Scanner scanner = new Scanner(System.in);
		
		// Prompts the user to enter number of scores.
		System.out.print("Enter the number of students : ");
		short numberOfStudents = scanner.nextShort();
		byte[] scores = new byte[numberOfStudents];
		
		short index;
		// Prompts the user to enter scores.
		System.out.print("Enter " + numberOfStudents + " scores : ");
		for(index = 0; index < scores.length;index++)
			scores[index] = scanner.nextByte();
		
		byte best = getBestScore(scores);
		
		for(index = 0; index < scores.length;index++)
			System.out.println("Student" + index +
			" score is " + scores[index] + " and grade is "
			+ getGrade(scores[index],best));
		
		// Close scanner
		scanner.close();

	}
	
	public static char getGrade(byte score, byte best) {
		
		char grade;
		
		if(score>=best-10)
			grade = 'A';
		else if(score>=best-20)
			grade = 'B';
		else if(score>=best-30)
			grade = 'C';
		else if(score>=best-40)
			grade = 'D';
		else
			grade = 'E';
		
		return grade;
	}
	
	public static byte getBestScore(byte[] scores) {
		
		byte max = scores[0];
		
		for(int i = 1; i < scores.length;i++)
			if(max < scores[i])
				max = scores[i];
		return max;
	}

}
