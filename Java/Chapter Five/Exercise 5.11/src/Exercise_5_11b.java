
public class Exercise_5_11b {

	public static void main(String[] args) {
		
		short count = 1;
		
		for(short number = 100; number<=200;number++) {
			if(number%5==0 ^ number%6==0) {
				System.out.print(number + 
				((count%10==0)?"\n":" "));
				count++;
			}
		}
	}
}
