import java.util.Scanner;

public class Exercise_4_24c {

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		
		String firstCity,secondCity,thirdCity;
		
		System.out.print("Enter the first city : ");
		firstCity = scanner.nextLine();
		System.out.print("Enter the second city : ");
		secondCity = scanner.nextLine();
		System.out.print("Enter the third city : ");
		thirdCity = scanner.nextLine();
		
		if(firstCity.isEmpty() || secondCity.length()==0 || thirdCity.isEmpty()) {
			System.out.println("Error : All three cities must have names.");
			System.exit(0);
		}
		
		if(firstCity.equalsIgnoreCase(secondCity) || 
		firstCity.equalsIgnoreCase(thirdCity) ||
		secondCity.equalsIgnoreCase(thirdCity)) {
			System.out.println("Error : Make Sure There Are No Duplicate Cities.");
			System.exit(1);
		}
		
		String orderedCities = ""; 
		
		if(firstCity.compareTo(secondCity)<0) {
			if(firstCity.compareTo(thirdCity)<0) {
				orderedCities += firstCity;
				if(secondCity.compareTo(thirdCity)<0) 
					orderedCities += " " + secondCity + " " + thirdCity;
				else
					orderedCities += " " + thirdCity + " " + secondCity;
			}
			else
				 orderedCities += thirdCity + " " + firstCity + " " + secondCity;
			
		}
		else if(firstCity.compareTo(secondCity)>0) {
			if(secondCity.compareTo(thirdCity)<0) {
				orderedCities += secondCity;
				if(firstCity.compareTo(thirdCity)<0) 
					orderedCities += " " + firstCity + " " + thirdCity;
				else
					orderedCities += " " + thirdCity + " " + firstCity;
			}
			else
				orderedCities += thirdCity + " " + secondCity + " " + firstCity;
			
		}
		else {
			if(secondCity.compareTo(thirdCity)<0)
				orderedCities += secondCity + " " + firstCity + " " + thirdCity;
			else
				orderedCities += thirdCity + " " + secondCity + " " + firstCity + " ";
		}
		
		System.out.println("The three cities in alphabetical order are " + orderedCities);
		
		
		scanner.close();
	}

}
