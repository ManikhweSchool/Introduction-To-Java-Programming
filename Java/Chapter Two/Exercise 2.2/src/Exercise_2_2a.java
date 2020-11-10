import java.util.Scanner;

public class Exercise_2_2a {

	public static void main(String[] args) {
		
		double rad;
		double len;
		
		System.out.print("Enter the radius and length of a cylinder : ");
		
		Scanner scanner = new Scanner(System.in);

		rad = scanner.nextDouble();
		len = scanner.nextDouble();
		
		double a = rad*rad*Math.PI;
		double vol = a*len;
		
		System.out.println("The area is " + a);
		System.out.println("The volume is " + vol);
		
		scanner.close();
	}

}
