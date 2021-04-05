import java.util.ArrayList;

public class Exercise_7_7c {

	/*Applied Concepts To Research - ArrayList*/
	//visit www.manikhweschool.com to learn more about it.
	public static void main(String[] args) {
		
		ArrayList<Byte> counts = new ArrayList<>();
		
		// Initialize our list.
		counts.add((byte)(0));
		counts.add((byte)(0));
		counts.add((byte)(0));
		counts.add((byte)(0));
		counts.add((byte)(0));
		counts.add((byte)(0));
		counts.add((byte)(0));
		counts.add((byte)(0));
		counts.add((byte)(0));
		counts.add((byte)(0));
		
		for(byte i = 0; i < 100;i++) {
			byte randomPosition = (byte)(Math.random()*10);
			counts.set(randomPosition, (byte)(counts.get(randomPosition)+1));
		}
		
		System.out.println("Number\tOccurances");
		for(byte number = 0; number <=9; number++)
			System.out.println(number + "\t" + counts.get(number));
			
	}

}
