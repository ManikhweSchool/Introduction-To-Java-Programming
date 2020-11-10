import java.util.Scanner;

public class Exercise_4_23a {

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
		
		String formattedOutput = "\n\n";
		
		formattedOutput += "Employee's name : " + name + "\n";
		formattedOutput += "Hours Worked : " + workedHours + "\n";
		formattedOutput += "Pay Rate : " + hourlyPayRate + "\n";
		formattedOutput += "Gross Pay : $" + grossPay + "\n";
		
		formattedOutput += "Deductions :\n\tFederal Withholding (20.0%) : $" 
		+ federalWithholding + "\n";
		
		formattedOutput += "\tState Withholding (9.0%): $" + 
		stateWithholding + "\n";
		
		formattedOutput += "\tTotal Deduction : $" + totalDeductions + "\n";
		formattedOutput += "Net Pay : $" + netPay;
		
		System.out.println(formattedOutput);
		
		scanner.close();
	}

}
