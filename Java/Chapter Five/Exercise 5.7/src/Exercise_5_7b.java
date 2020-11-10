
public class Exercise_5_7b {

	public static void main(String[] args) {
		
		
		float currentYearTuition = 10000.0f;
		short numberOfYears = 0;
		
		do {
			numberOfYears++;
			currentYearTuition += currentYearTuition*0.05;
			
		}while(numberOfYears <10);
		
		double tenthYearTuition = currentYearTuition;
		numberOfYears = 0;
		float finalTuition = 0;
		
		while(++numberOfYears<=4) {
			currentYearTuition += currentYearTuition*0.05;
			finalTuition += currentYearTuition;
		}
		
		System.out.printf("The tuition fees after ten years is $%8.2f\n"
		+ "The four years's worth tuition after ten years is $%8.2f",
		tenthYearTuition,finalTuition);
		
	}

}
