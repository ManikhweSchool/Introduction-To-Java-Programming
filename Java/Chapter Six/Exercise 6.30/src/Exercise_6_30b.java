
public class Exercise_6_30b {

	public static void main(String[] args) {
		
		rollDice();
	}
	
	public static void rollDice() {
		
		short dice1, dice2, sum;
		
		sum = 0;
		
		while(!(sum == 2 || sum == 3 || sum == 12 || sum == 7
		|| sum == 11)) {
			
			dice1 = (short) ((short)(Math.random()*6) +1);
			dice2 = (short) ((short)(Math.random()*6) +1);
			
			sum = (short) (dice1 +dice2);
			
			System.out.println("You rolled " + dice1 + " + "
			+ dice2 + " = " + sum);
			
			if(sum==4 || sum==5 || sum==6 || sum==8 || sum==9 ||
			sum==10)
				System.out.println("point is " + sum);
			else if(sum==7 || sum==11)
				System.out.println("You win");
			else
				System.out.println("You lose");
		}
	}

}
