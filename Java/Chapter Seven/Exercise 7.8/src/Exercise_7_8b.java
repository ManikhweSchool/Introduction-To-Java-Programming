import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Exercise_7_8b {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int count  =1;
		
		if((byte)(Math.random()*2)==0) {
			System.out.print("Enter ten integer digits : ");
			
			BigInteger[] list = new BigInteger[10];
			
			while(count<=10) {
				list[count-1] = scanner.nextBigInteger();
				count++;
			}
			
			System.out.println("Integers Average : " + average(list));
		}
		else {
			System.out.print("Enter ten decimal digits : ");
			
			BigDecimal[] list = new BigDecimal[10];
			
			while(count<=10) {
				list[count-1] = scanner.nextBigDecimal();
				count++;
			}
			
			System.out.println("Decimal Average : " + average(list));
		}
		
		
		scanner.close();
	}
	
	public static BigDecimal average(BigDecimal[] array) {
		
		BigDecimal sum = array[0];
		
		sum = sum.add(array[1]);
		sum = sum.add(array[2]);
		sum = sum.add(array[3]);
		sum = sum.add(array[4]);
		sum = sum.add(array[5]);
		sum = sum.add(array[6]);
		sum = sum.add(array[7]);
		sum = sum.add(array[8]);
		sum = sum.add(array[9]);
		
		BigDecimal average = sum.divide(new BigDecimal("10"));
		
		return average;
	}
	
	public static BigInteger average(BigInteger[] array) {
		
		BigInteger sum = array[0];
		
		sum = sum.add(array[1]);
		sum = sum.add(array[2]);
		sum = sum.add(array[3]);
		sum = sum.add(array[4]);
		sum = sum.add(array[5]);
		sum = sum.add(array[6]);
		sum = sum.add(array[7]);
		sum = sum.add(array[8]);
		sum = sum.add(array[9]);
		
		BigInteger average = sum.divide(new BigInteger("10"));
		
		return average;
	}
	
}
