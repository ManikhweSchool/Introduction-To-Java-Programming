import java.util.HashMap;
import java.util.Scanner;

public abstract class Exercise_7_33c {

	/*
	 * Applied Concepts To Research - HashMap class and Integer class.
	 * visit www.manikhweschool.com to learn more about them.
	 * */
	public static void main(String[] args) {
		
		// Map is a key/value data structure.
		HashMap<Integer,String> map = new HashMap<>();
		
		map.put(0, "Monkey");
		map.put(1, "Rooster");
		map.put(2, "Dog");
		map.put(3, "Pig");
		map.put(4, "Rat");
		map.put(5, "Ox");
		map.put(6, "Tiger");
		map.put(7, "Rabbit");
		map.put(8, "Dragon");
		map.put(9, "Snake");
		map.put(10, "Horse");
		map.put(11, "Sheep");
	
	
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Enter a year : ");
		
		int animalKey = scanner.nextInt()%12;
		
		System.out.print(map.get(animalKey));
		
		scanner.close();
	}
}
