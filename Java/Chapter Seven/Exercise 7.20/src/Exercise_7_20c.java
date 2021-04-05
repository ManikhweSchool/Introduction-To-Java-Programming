
public class Exercise_7_20c {

	public static void main(String[] args) {
		
		Double[] array = {2.5,4.0,6.66,37.9,
						 44.5,88.7,1.7,3.3,4.9,
						 18.8};
		
		sort(array);
		
		for(Double item : array)
			System.out.print(item + " ");
		
	}
	
	public static void sort(Double[] array) {
		
		if(array.length<2) return;
		
		Double max;
		int maxIndex;
		
		for(int i = array.length-1;i>0;i--) {
			max = array[i-1];
			maxIndex = i-1;
			for(int j = maxIndex-1;j>=0;j--) {
				if(array[j].compareTo(max)>0) {
					max = array[j];
					maxIndex = j;
				}
			}
			
			if(max.compareTo(array[i])>0) {
				Double temp = array[i];
				array[i] = max;
				array[maxIndex] = temp;
			}
		}
	}

}
