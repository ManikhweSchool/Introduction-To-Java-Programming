
public class Exercise_7_13c {
	// Applied Concepts To Research - Recursion
	// visit www.manikhweschool.com for more recursion exercises.
	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10,
		12,13,14,15,16,17,18,19,20};

		for(int j = 1; j <= 5;j++) {
			for(int i = 1;i <= 10;i++)
				System.out.print(getRandom(numbers) + " ");
			System.out.println();
		}
	

	}
	
	public static int getRandom(int... numbers) {
		
		int randomNumber = 1+(int)(Math.random()*54);
		boolean contains = false;
		
		for(int i = 0;i < numbers.length;i++) {
			if(randomNumber==numbers[i]) {
				contains = true;
				break;
			}
		}
		
		if(!contains)
			return randomNumber;
		else
			return getRandom(numbers);
	}

}
