
public class Exercise_7_16a {

	public static void main(String[] args) {
		
		int[] list = new int[100000];
		int key = 1+(int)(Math.random()*100000);
		
		for(int i = 1; i <=100000;i++)
			list[i-1] = 1+(int)(Math.random()*100000);
		
		calculateTimeTaken(list,key,false);
		selectionSort(list);
		calculateTimeTaken(list,key,true);
	}
	
	public static void selectionSort(int[] list) {
		
		for(int i = 0; i < list.length-1;i++) {
			int currentMin = list[i];
			int currentMinIndex = i;
			for(int j = i+1;j<list.length;j++) {
				if(currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			
			if(currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
	
	public static int linearSearch(int[] list, int key) {
		
		for(int i = 0; i < list.length;i++)
			if(key==list[i])
				return i;
		return -1;
	}
	
	public static int binarySearch(int[] list, int key) {
		
		int low = 0;
		int high = list.length-1;
		
		while(low<high) {
			int mid = (low+high)/2;
			if(key < list[mid])
				high = mid-1;
			else if(key>list[mid])
				low = mid+1;
			else
				return mid;
		}
		
		return -low-1;
	}
	
	public static void calculateTimeTaken(int[] list, 
	int key, boolean useBinarySearch) {
		
		long startTime = System.currentTimeMillis();
		System.out.print("Start Time : " + startTime);
		
		if(!useBinarySearch) {
			System.out.print("\tLinear Search Time : ");
			linearSearch(list,key);
		}
		else {
			System.out.print("\tBinary Search Time : ");
			binarySearch(list,key);
		}
		
		long endTime = System.currentTimeMillis();
		long executionTime = endTime-startTime;
		
		System.out.println(executionTime);
		System.out.println("End Time : " + endTime);
	}

}
