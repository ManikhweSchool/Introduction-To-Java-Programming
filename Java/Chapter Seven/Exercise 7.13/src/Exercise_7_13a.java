
public class Exercise_7_13a {

	public static void main(String[] args) {
		
		int[] numbers = {2,4,6,8,10,12,14,16,18,20,
						22,24,26,28,30};
		
		for(int j = 1; j <= 5;j++) {
			for(int i = 1;i <= 10;i++)
				System.out.print(getRandom(numbers) + " ");
			System.out.println();
		}
			
	}
	
	public static int getRandom(int...numbers) {
		
		boolean contains;
		
		do {
			int randomNumber = 1 + (int)(Math.random()*54);
			contains = false;
			for(int i = 0; i < numbers.length;i++) {
				if(randomNumber==numbers[i]) {
					contains = true;
					break;
				}
			}
			
			if(!contains)
				return randomNumber;
		}while(contains);
		
		return -1;
	}

}
