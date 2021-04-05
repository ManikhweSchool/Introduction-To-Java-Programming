import java.util.Scanner;

public class Exercise_7_32b {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a list : ");
		int listSize = scanner.nextInt();
		
		int list[] = new int[listSize];
		
		for(int i = 0; i < listSize;i++)
			list[i] = scanner.nextInt();
		
		System.out.println("Pivot Index : " + partition(list));
		for(int element : list)
			System.out.print(element + " ");
		
		scanner.close();

	}
	
	public static boolean isArranged(int[] list, int index) {
		
		int currentIndex = 0;
		
		while(currentIndex<index) {
			if(list[currentIndex]>list[index])
				return false;
			currentIndex++;
		}
		
		while(currentIndex<list.length) {
			if(list[currentIndex]<list[index])
				return false;
			currentIndex++;
		}
		
		return true;
	}
	
	public static int swap(int[] list, 
	int leftIndex, int rightIndex, boolean onLeft) {
		
		if(list[leftIndex]>list[rightIndex]) {
			
			int temp = list[leftIndex];
			list[leftIndex] = list[rightIndex];
			list[rightIndex] = temp;
			
			if(onLeft)return rightIndex;
			else return leftIndex;
		}
		
		if(!onLeft)return rightIndex;
		else return leftIndex;
		
	}
	
	public static int partition(int[] list) {
		
		int position = 0;
		int previousPosition = position;
		
		int leftIndex = 0;
		int rightIndex = list.length/2;
		
		boolean onLeft = true;
		
		while(!isArranged(list,position)) {
			
			if(leftIndex < rightIndex && rightIndex < list.length) {
				position = swap(list,leftIndex,rightIndex,onLeft);
				
				if(previousPosition != position) {
					onLeft = !onLeft;
					previousPosition = position;
				}
				
				if(onLeft)
					rightIndex++;
				else
					leftIndex++;
			}
			else if(leftIndex == rightIndex && rightIndex < list.length) {
				rightIndex++;
				onLeft = true;
				position = swap(list,leftIndex,rightIndex,onLeft);
				
				if(previousPosition != position) {
					onLeft = !onLeft;
					previousPosition = position;
				}
				
				if(onLeft)
					rightIndex++;
				else
					leftIndex++;
			}
			
			else if(rightIndex==list.length) {
				rightIndex = leftIndex+1;
			}
		}
		
		return position;
	}

}
