
public class Exercise_1_4a {

	/* Student A's solution requires one to know the number of 
	 * digits of the answer for on one of the computations in 
	 * order to give a good looking answer.*/
	public static void main(String[] args) {
		
		System.out.println("a^1        a^2        a^3");
		System.out.println("1          "+(1*1)+"          "+(1*1*1));
		System.out.println("2          "+(2*2)+"          "+(2*2*2));
		System.out.println("3          "+(3*3)+"          "+(3*3*3));
		/* Notice this line, because 4*4 = 16 which is 2 digits,
		   this output affects the position of the answer for 4*4*4
		   even though the number of spaces between 4*4 and 4*4*4 is 
		   the same as other lines. This work well for other lines 
		   because their answer only have 1 digit.
		*/
		System.out.println("4          "+(4*4)+"           "+(4*4*4));
	}

}
