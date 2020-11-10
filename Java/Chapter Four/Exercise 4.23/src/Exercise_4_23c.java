import java.util.Scanner;

public class Exercise_4_23c {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter employee's name : ");
		String name = scanner.nextLine();
		
		System.out.print("Enter number of hours worked in a week : ");
		double workedHours = scanner.nextDouble();
		
		System.out.print("Enter hourly pay rate : ");
		double hourlyPayRate = scanner.nextDouble();
		
		System.out.print("Enter federal tax withholding rate : ");
		double federalTaxWithholdingRate = scanner.nextDouble();
		
		System.out.print("Enter state tax withholding rate : ");
		double stateTaxWithholdingRate = scanner.nextDouble();
		
		double grossPay = workedHours*hourlyPayRate;
		double federalWithholding = grossPay*federalTaxWithholdingRate;
		double stateWithholding = grossPay*stateTaxWithholdingRate;
		double totalDeductions = federalWithholding+stateWithholding;
		double netPay = grossPay-totalDeductions;
		
		System.out.printf("\nEmployee's name : %s\nHours Worked : %s"
		+ "\nPay Rate : $%s\nGross Pay : $%s\nDeductions : \n\tFederal "
		+ "Withholding (20.0%): $%1.2f\n\tState Withholding (9.0%): $%1.2f"
		+ "\n\tTotal Deduction: $%1.2f\nNet Pay: $%1.2f"
		, name,String.valueOf(workedHours),String.valueOf(hourlyPayRate),
		String.valueOf(grossPay), federalWithholding, 
		stateWithholding,totalDeductions, netPay);
		
		scanner.close();
	}

}
