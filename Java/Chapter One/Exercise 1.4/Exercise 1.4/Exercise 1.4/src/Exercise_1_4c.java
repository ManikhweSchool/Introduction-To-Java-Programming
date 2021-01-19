
public class Exercise_1_4c {

	// Student C finds a way to get rid of many multiplication signs.
	public static void main(String[] args) {
		
		
		// What if you want something like a^10, a^50 or a^100, what you do?
		// This is where you use one of the functions/methods provided by the 
		// java Math utility class.
		System.out.println("\na^1\t\ta^6\t\ta^7");
		System.out.println("1\t\t"+Math.pow(1,6)+"\t\t"+Math.pow(1,7));
		System.out.println("2\t\t"+Math.pow(2,6)+"\t\t"+Math.pow(2,7));
		System.out.println("3\t\t"+Math.pow(3,6)+"\t\t"+Math.pow(3,7));
		System.out.println("4\t\t"+Math.pow(4,6)+"\t\t"+Math.pow(4,7));
		
		/* When ever you have to perform math operators you have got to check the 
		 * Math class first. Probably what you need to do is already there in the 
		 * Math utility.		
		*/
	}

}
