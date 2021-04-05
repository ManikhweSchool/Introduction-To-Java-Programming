
public class Exercise_7_7a {

	public static void main(String[] args) {
		
		byte[] counts = new byte[10];
		
		for(byte numberOfTimes = 0; numberOfTimes <100;
		numberOfTimes++)
			counts[(byte)(Math.random()*10)]++;
		
		System.out.println("Number\tOccurances\n");
		for(byte number = 0; number <=9;number++)
			System.out.println(number + "\t" + counts[number]);
			
	}
	
	

}
