
public class Exercise_5_3a {

	public static void main(String[] args) {
		
		System.out.println("Kilograms\tPounds");
		
		for(int i = 1; i <= 199;i+=2)
			System.out.printf("%d\t\t%6.1f\n", i, i*2.2);
	}

}
