
public class Exercise_1_13a {

	// Student A has a simplest solution.
	public static void main(String[] args) {
		
		// a = 3.4, b = 50.2, c = 2.1, d = 0.55, e = 44.5, f = 5.9
		// x = (e*d-b*f)/(a*d - b*c) y = (a*f-e*c)/(a*d-b*c)
		
		System.out.println("Simple Solution");
		System.out.println("x = "+(44.5*0.55-50.2*5.9)/(3.4*0.55-50.2*2.1));
		System.out.println("y = "+(3.4*5.9-44.5*2.1)/(3.4*0.55-50.2*2.1));
		
	}

}
