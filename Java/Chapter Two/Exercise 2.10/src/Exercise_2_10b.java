import java.util.Scanner;

public class Exercise_2_10b {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount of water in kilograms : ");
		double waterWeight = input.nextDouble();
		
		final short FORMULAR_CONSTANT = 4184;
		
		System.out.print("Enter the initial temperature : ");
		double initialTemperature = input.nextDouble();
		
		System.out.print("Enter the inital temperature : ");
		double finalTemperature = input.nextDouble();
		
		double energyNeeded = waterWeight * (finalTemperature-initialTemperature)*FORMULAR_CONSTANT;
		
		System.out.printf("The energy needed is %3.1f", energyNeeded);
		
		input.close();
	}

}
