
public class Exercise_7_20b {

	public static void main(String[] args) {
		
		int[] array = {1,2,9,3,6,2,18,2,3,-5,7,2};
		sort(array);
		
		for(int item : array)
			System.out.print(item + " ");
	}
	
	public static void sort(int[] array) {
		
		if(array.length < 2) return;
		
		int max;
		int maxIndex;
		
		for(int i = array.length-1;i > 0;i--) {
			max = array[i-1];
			maxIndex = i-1;
			for(int j = maxIndex-1;j>=0;j--) {
				if(array[j]>max) {
					max = array[j];
					maxIndex = j;
				}
			}
			
			if(max>array[i]) {
				int temp = array[i];
				array[i] = max;
				array[maxIndex] = temp;
			}
		}
		
	}

}
