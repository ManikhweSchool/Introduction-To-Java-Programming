
public class Exercise_5_15c {

	public static void main(String[] args) {
		
		short count = 0;
		
		for(short characterIndex =33;
		characterIndex<=126;characterIndex++) {
			System.out.print(((char)characterIndex));
			if((count+1)%10==0)
				System.out.println();
			else
				System.out.print(" ");
			count++;
		}

	}

}
