import java.util.Scanner;

public class Exercise_7_25a {

	public static void main(String[] args) {
		
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		
		double[] eqn = new double[3];
		System.out.print("Enter a, b, & c : ");
		eqn[0] = scanner.nextDouble();
		eqn[1] = scanner.nextDouble();
		eqn[2] = scanner.nextDouble();
		
		double[] roots = new double[2];
		
		byte numberOfRoots = (byte)solveQuadratic(eqn,roots);
		
		if(numberOfRoots==2)
			System.out.printf("There are %d roots : %3.2f & %3.2f",
			numberOfRoots,roots[0], roots[1]);
		else if(numberOfRoots==1)
			System.out.printf("There is only %d root : %3.2f",
			numberOfRoots, roots[0]);
		else 
			System.out.print("There are no roots.");
		
		// Close scanner
		scanner.close();

	}
	
	public static int solveQuadratic(double[] eqn, double[] roots) {
		
		if(eqn.length != 3) return -1;
		
		double discriminant = Math.pow(eqn[1], 2)-4*eqn[0]*eqn[2];
		
		int numberOfRoots;
		
		if(discriminant<0)
			numberOfRoots = 0;
		else if(discriminant==0) {
			roots[0] = -eqn[1]/2*eqn[0];
			numberOfRoots = 1;
		}
		else {
			roots[0] = -eqn[1]/2*eqn[0] + 
			Math.sqrt(discriminant)/(2*eqn[0]);
			roots[1] = -eqn[1]/2*eqn[0] - 
			Math.sqrt(discriminant)/(2*eqn[0]);
			numberOfRoots = 2;
		}
		
		
		return numberOfRoots;
	}

}
