
public class Exercise_1_13b {

	// Student B uses tab for horizontal line spacing. 
	public static void main(String[] args) {
		
		// a = 3.4, b = 50.2, c = 2.1, d = 0.55, e = 44.5, f = 5.9
		// x = (e*d-b*f)/(a*d - b*c) y = (a*f-e*c)/(a*d-b*c)

		// Use \t to leave horizontal space in one line.
		System.out.print(3.4 + "x + "+ 50.2 + "y " + "= " + 44.5 + "\t");
		System.out.println(2.1 + "x + "+ .55 + "y " + "= " + 5.9);
		System.out.print("x = "+(44.5*0.55-50.2*5.9)/(3.4*0.55-50.2*2.1) + "\t");
		System.out.println("y = "+(3.4*5.9-44.5*2.1)/(3.4*0.55-50.2*2.1));
		
		
	}

}
