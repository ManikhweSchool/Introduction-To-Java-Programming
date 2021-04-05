
public class Exercise_7_8a {

	public static void main(String[] args) {
		
		System.out.println("Average 1 : " 
		+average(new int[]{2,4,5,6,7,8,2,3,1,70}));
		System.out.print("Average 2 : " 
		+average(new double[]{2.4,4.55,5,6.0,87,8.0,52,3,1,3.30}));
	}
	
	public static double average(double[] array) {
		
		double sum = 0;
		
		for(int i = 0; i < array.length;i++)
			sum += array[i];
		return sum/array.length;
	}
	
	public static int average(int[] array) {

		int sum = 0;
		
		for(int i = 0; i < array.length;i++)
			sum += array[i];
		return sum/array.length;
	}

}
