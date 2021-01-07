
public class Exercise_6_32b {

	public static void main(String[] args) {
		
		playNTimes(1000);
	}

	public static void playNTimes(int numberOfTimes) {
		
		byte firstRolledNumber;
		byte secondRolledNumber;
		
		byte sum = 0;
		int countWins = 0;
		
		do {
			firstRolledNumber = (byte) (1+ (byte)(Math.random()*6));
			secondRolledNumber = (byte) (1+ (byte)(Math.random()*6));
			
			sum = (byte) (firstRolledNumber+secondRolledNumber);
			
			System.out.println("You Rolled " + firstRolledNumber + " + " +
			secondRolledNumber + " = " + sum);
			
			if(sum==7 || sum==11) {
				System.out.println("You win");
				countWins++;
			}
			else if(sum==2 || sum==3 || sum==12) {
				System.out.println("You lose");
			}
			else {
				System.out.println("point is " + sum);
			}
			
			numberOfTimes--;
			
			
		}while(numberOfTimes>0);
		
		System.out.print("\nYou won " + countWins + " times.");
	}
}
