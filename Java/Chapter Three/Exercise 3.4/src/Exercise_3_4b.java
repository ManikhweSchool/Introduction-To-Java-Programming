
public class Exercise_3_4b {

	// http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		byte randomNumber = (byte)(Math.random()*12 + 1);

		switch(randomNumber) {
		case 1 : 
			System.out.print(1 + " January");
			break;
		case 2 :
			System.out.print(2 + " February");
			break;
		case 3 :
			System.out.print(3 + " March");
			break;
		case 4 :
			System.out.print(4 + " April");
			break;
		case 5 :
			System.out.print(5 + " May");
			break;
		case 6 :
			System.out.print(6 + " June");
			break;
		case 7 :
			System.out.print(7 + " July");
			break;
		case 8 :
			System.out.print(8 + " August");
			break;
		case 9 : 
			System.out.print(9 + " September");
			break;
		case 10 :
			System.out.print(10 + " October");
			break;
		case 11 :
			System.out.print(11 + " November");
			break;
		default :
			System.out.print(12 + " December");
		}
	}

}
