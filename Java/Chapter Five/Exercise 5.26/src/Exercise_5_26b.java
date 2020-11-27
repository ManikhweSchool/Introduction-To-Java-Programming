
public class Exercise_5_26b {

	public static void main(String[] args) {
		
		double e, item;
		
		for(int j = 10000; j <= 100000; j+=10000) {
			e = 1;
			item = 1;
			int i = 2;
			while(i <=j) {
				item /= i;
				e += item;
				i++;
			}
			System.out.println("The e approximate for i = " + j + " is "
			+ e);
		}

	}

}
