
public class Exercise_5_10c {

	public static void main(String[] args) {
		

		int count = 1;
		
		for(int i = 100; i <= 1000;i++) {
			if(i%5==0 && i%6==0) {
				System.out.print(i + ((count%10==0)?"\n":" "));
				count++;
			}
		}
	}

}
