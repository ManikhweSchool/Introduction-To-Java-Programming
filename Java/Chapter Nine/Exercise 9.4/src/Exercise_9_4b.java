import java.util.Random;

public class Exercise_9_4b {

	public static void main(String[] args) {
	
		Random random = new Random(1000);
		
		for(byte number = 1; number <= 100; number++) {
			System.out.print(random.nextInt(100) + 
			((number%10==0)?"\n":"\t"));
		}
	}
}
