import java.util.Scanner;

public class Exercise_7_21b {

	public static String[] allPath;
	
	public static void main(String[] args) {
		
		// Create
		Scanner scanner =  new Scanner(System.in);
		
		System.out.print("Enter number of balls to drop : ");
		int numberOfBalls = scanner.nextInt();
		System.out.print("Enter number of slots in bean machine : ");
		int numberOfSlots = scanner.nextInt();
		
		int[] slots = new int[numberOfSlots];
		
		
		findAllPath(numberOfBalls,numberOfSlots);
		findNumberOfBallsInSlots(slots);
		displayAllPath();
		displayHistogram(slots);
		
		// Close scanner
		scanner.close();
		
	}
	
	public static void findAllPath(int numberOfBalls,
	int numberOfSlots) {
		
		allPath = new String[numberOfBalls];
		
		for(int ballNumber = 1; ballNumber<=numberOfBalls;ballNumber++) {
			
			String currentPath = "";
			
			for(int pathPortionIndex = 1; 
			pathPortionIndex <= numberOfSlots-1;
			pathPortionIndex++) {
				currentPath += ((byte)(Math.random()*2)==0)?'R':'L';
			}
			
			allPath[ballNumber-1] = currentPath;
		}
	}
	
	public static void displayAllPath() {
		
		if(allPath==null) return;
		for(int i = 0; i < allPath.length;i++)
			System.out.println(allPath[i]);
	}
	
	public static void displayHistogram(int[] slots) {
		
		int maxSlot = slots[0];
		
		for(int i = 1; i < slots.length;i++) {
			if(maxSlot<slots[i])
				maxSlot = slots[i];
		}
		
		System.out.println();
		
		for(int i = maxSlot;i>0;i--) {
			for(int j = 0; j < slots.length;j++) {
				if(slots[j]==maxSlot) {
					System.out.print(0);
					slots[j]--;
				}
				else
					System.out.print(" ");
			}
			maxSlot--;
			System.out.println();
		}
	}
	
	public static void findNumberOfBallsInSlots(int[] slots) {
		
		for(int i = 0; i < allPath.length;i++)
			slots[countNumberOfRs(allPath[i])]++;
		
	}
	
	public static int countNumberOfRs(String path) {
		
		int count = 0;
		
		for(int i = 0; i < path.length();i++)
			if(path.charAt(i)=='R')
				count++;
		
		return count;
	}

}
