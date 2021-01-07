
public class Exercise_9_6b {

	static int[] numbers = new int[100000];
	
	public static void fillNumbers() {
		
		for(int i =0; i < numbers.length;i++) {
			numbers[i] = (int)(Math.random()*100000);
		}
	}
	
	public static void main(String[] args) {
		
		
		fillNumbers();
		
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		selectionSort();
		stopWatch.stop();
		System.out.print("The time taken is : " 
		+ stopWatch.getElapsedTime());
		//displayNumbers();
	}
	
	public static void displayNumbers() {
		
		for(int i = 1; i <= numbers.length;i++) {
			System.out.print(numbers[i-1] + ((i%10!=0)?"\t":"\n"));
		}
	}
	
	public static void selectionSort() {
		
		for(int i = 0; i < numbers.length-1;i++) {
			int currentNumber = numbers[i];
			int min = numbers[i+1];
			int minIndex = i+1;
			for(int j = i+1;j <numbers.length;j++) {
				if(min<numbers[j]) {
					min = numbers[j];
					minIndex = j;
				}
			}
			
			if(currentNumber<min) {
				numbers[i] = min;
				numbers[minIndex] = currentNumber;
			}
		}
	}

}
