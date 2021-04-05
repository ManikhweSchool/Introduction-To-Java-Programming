
public class Exercise_7_14a {

	public static void main(String[] args) {
		
		int[] numbers1 = {12,8,24,32,40};
		System.out.println("numbers1 gcd : " + gcd(numbers1));
		int[] numbers2 = {122,58,234,132,528,342,470, 8,32,70};
		System.out.print("numbers2 gcd : " + gcd(numbers2));

	}
	
	public static int gcd(int...numbers) {
		
		int gcd = 1;
		int count = 1;
		int min = min(numbers);
		
		boolean dividable = true;
		
		do {
			dividable = true;
			for(int i = 0; i < numbers.length && 
			(gcd+count)<=min;i++) {
				if(numbers[i]%(gcd+count) != 0) {
					dividable = false;
					break;
				}
			}
			
			if(dividable) {
				gcd += count;
				count = 1;
				dividable = false;
			}
			else
				count++;
				
		}while(!dividable && (gcd+count)<=min);
		
		return gcd;
	}
	
	public static int min(int...numbers) {
		
		int min = numbers[0];
		
		for(int i = 0; i < numbers.length;i++)
			if(min<numbers[i])
				min = numbers[i];
		return min;
	}

}
