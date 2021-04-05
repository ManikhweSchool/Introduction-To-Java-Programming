import java.util.Scanner;

public class Exercise_7_31a {

	public static void main(String[] args) {
		
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter list1: ");
		int list1Size = scanner.nextInt();
		
		if(list1Size<=0) {
			System.out.print("Size Must Be Atleast One.");
			System.exit(0);
		}
		
		int[] list1 = new int[list1Size];
		for(int o = 0; o < list1.length;o++)
			list1[o] = scanner.nextInt();
		
		System.out.print("Enter list2: ");
		int list2Size = scanner.nextInt();
		
		if(list2Size<=0) {
			System.out.print("Size Must Be Atleast One.");
			System.exit(1);
		}
		int[] list2 = new int[list2Size];
		for(int o = 0; o < list2.length;o++)
			list2[o] = scanner.nextInt();
		
		if(!isInAscendingOrder(list1) && 
		!isInDescendingOrder(list1)) {
			System.out.println("List 1 is not sorted.");
			System.exit(2);
		}
		
		if(!isInAscendingOrder(list2) && 
		!isInDescendingOrder(list2)) {
			System.out.println("List 2 is not sorted.");
			System.exit(3);
		}
		
		int[] array = merge(list1,list2);
		
		for(int i : array)
			System.out.print(i + " ");
		
		// Close scanner
		scanner.close();
	}

	public static int[] merge(int[] list1, int[] list2) {
		
		int[] list = new int[list1.length+list2.length];
		
		int list1Index;
		int list2Index;
		int listIndex;
		
		// Case 1 : Both lists have only one element.
		if(list1.length==1 && list2.length==1) {
			
			if((int)(Math.random()*2)==0) {
				list[0] = list1[0];
				list[1] = list2[0];
			}
			else {
				list[0] = list2[0];
				list[1] = list1[0];
			}
				
		}
		// Case 2 :  List 1 has only one element and list 2 has many.
		else if(list1.length==1 && list2.length>1) {
			list2Index = list2.length-1;
			listIndex = 0;
			
			// List 2 is in ascending order
			if(list2[0]<list2[list2.length-1]) {
				while(list2Index>=0) {
					if(list2[list2Index]>=list1[0])
						list[listIndex++] = list2[list2Index--];
					else {
						list[listIndex++] = list1[0];
						for(;list2Index>=0;)
							list[listIndex++] = list2[list2Index--];
						break;
					}
				}
			}
			// List 2 is in descending order
			else {
				while(list2Index>=0) {
					if(list2[list2Index]<=list1[0])
						list[listIndex++] = list2[list2Index--];
					else {
						list[listIndex++] = list1[0];
						for(;list2Index>=0;)
							list[listIndex++] = list2[list2Index--];
						break;
					}
					
				}	
			}
			if(listIndex==list.length-1) 
				list[list.length-1] = list1[0];
		}
		//Case 3 :  List 2 has only one element and list 1 has many.
		else if(list2.length==1 && list1.length>1) {
			list1Index = list1.length-1;
			listIndex = 0;
			
			// List 1 is in ascending order
			if(list1[0]<list1[list1.length-1]) {
				while(list1Index>=0) {
					if(list1[list1Index]<list1[0])
						list[listIndex++] = list1[list1Index--];
					else {
						list[listIndex++] = list2[0];
						for(;list1Index>=0;)
							list[listIndex++] = list1[list1Index--];
						break;
					}
				}
			}
			// List 1 is in descending order
			else {
				while(list1Index>=0) {
					if(list1[list1Index]<list2[0])
						list[listIndex++] = list1[list1Index--];
					else {
						list[listIndex++] = list2[0];
						for(;list1Index>=0;)
							list[listIndex++] = list1[list1Index--];
						break;
					}
				}
			}
			if(listIndex==list.length-1) 
				list[list.length-1] = list2[0];
		}
		//Case 4 :  Both list are in ascending order.
		else if(list1[0]<list1[1] && list2[0]<list2[1]) {
			list2Index = 0;
			list1Index = 0;
			listIndex = 0;
			
			while(listIndex<list.length) {
				
				while(listIndex<list.length &&
				list1Index<list1.length &&
				list2Index<list2.length &&
				list1[list1Index]<list2[list2Index] ) 
					list[listIndex++] = list1[list1Index++];
				
				if(list1Index<list1.length &&
				list2Index<list2.length &&
				listIndex<list.length &&
				list1[list1Index]>=list2[list2Index] )
					list[listIndex++] = list2[list2Index++];
				
				// Deal with list 2 remaining elements.
				else if(listIndex<list.length &&
				list1Index==list1.length &&
				list2Index<list2.length) 
					list[listIndex++] = list2[list2Index++];
				
				// Deal with list 1 remaining elements.
				else if(listIndex<list.length && 
				list2Index==list2.length &&
				list1Index<list1.length) {
					list[listIndex++] = list1[list1Index++];
				}
			}
		}
		// Case 5 :  Both list are in descending order.
		else if(list1[0]>list1[1] && list2[0]>list2[1]) {
			list2Index = list2.length-1;
			list1Index = list1.length-1;
			listIndex = 0;
			
			while(listIndex<list.length) {
				
				while(listIndex<list.length &&
				list1Index>=0 &&
				list2Index>=0 &&
				list1[list1Index]<list2[list2Index] ) 
					list[listIndex++] = list1[list1Index--];
				
				if(listIndex<list.length &&
				list1Index>=0 &&
				list2Index>=0 &&
				list1[list1Index]>=list2[list2Index] )
					list[listIndex++] = list2[list2Index--];
				
				// Deal with list 2 remaining elements.
				else if(listIndex<list.length &&
				list1Index==-1 &&
				list2Index>=0) 
					list[listIndex++] = list2[list2Index--];
				
				// Deal with list 1 remaining elements.
				else if(listIndex<list.length && 
				list2Index==-1 &&
				list1Index>=0) 
					list[listIndex++] = list1[list1Index--];
				
			}
		}
		//Case 6 :  List 1 is in descending order and list 2 is in ascending order.
		else if(list1[0]>list1[1] && list2[0]<list2[1]) {
			list2Index = list2.length-1;
			list1Index = 0;
			listIndex = 0;
			
			while(listIndex<list.length) {
				
				while(listIndex<list.length &&
				list1Index<list1.length &&
				list2Index>=0 &&
				list1[list1Index]>=list2[list2Index] ) 
					list[listIndex++] = list1[list1Index++];
				
				if(listIndex<list.length &&
				list1Index<list1.length &&
				list2Index>=0 &&
				list1[list1Index]<list2[list2Index] )
					list[listIndex++] = list2[list2Index--];
				
				// Deal with list 2 remaining elements.
				else if(listIndex<list.length &&
				list1Index==list1.length &&
				list2Index>=0) 
					list[listIndex++] = list2[list2Index--];
				
				// Deal with list 1 remaining elements.
				else if(listIndex<list.length && 
				list1Index<list1.length &&
				list2Index==-1) 
					list[listIndex++] = list1[list1Index++];
				
			}
		}
		//Case 7 :  List 2 is in descending order and list 1 is in ascending order.
		else {
			list2Index = 0;
			list1Index = list1.length-1;
			listIndex = list.length-1;
			
			while(listIndex>=0) {
				
				while(listIndex>=0 &&
				list1Index>=0 &&
				list2Index<list2.length &&
				list1[list1Index]>=list2[list2Index] ) 
					list[listIndex--] = list1[list1Index--];
				
				if(listIndex>=0 &&
				list1Index>=0 &&
				list2Index<list2.length &&
				list1[list1Index]<list2[list2Index] )
					list[listIndex--] = list2[list2Index++];
				
				// Deal with list 2 remaining elements.
				else if(listIndex>=0 &&
				list1Index<0 &&
				list2Index<list2.length) 
					list[listIndex--] = list2[list2Index++];
				
				// Deal with list 1 remaining elements.
				else if(listIndex>=0 && 
				list1Index>=0 &&
				list2Index==list2.length) 
					list[listIndex--] = list1[list1Index--];
				
			}
		}
		
		return list;
	}

	public static boolean isInAscendingOrder(int[] list) {
		
		for(int i = 0; i < list.length-1;i++)
			if(list[i] > list[i+1])
				return false;
		return true;
	}
	
	public static boolean isInDescendingOrder(int[] list) {
		
		for(int i = 0; i < list.length-1;i++)
			if(list[i] < list[i+1])
				return false;
		return true;
	}
}
