
public class Exercise_3_4c {

	public static void main(String[] args) {
		

		byte randomNumber = (byte)(Math.random()*12);
		
		// Making sure the output is user friendly.
		System.out.print("Random Number : " 
		+ (randomNumber+1) + " Corresponding Month : ");

		switch(++randomNumber) {
		case 1 : 
			System.out.print(" January");
			break;
		case 2 :
			System.out.print(" February");
			break;
		case 3 :
			System.out.print(" March");
			break;
		case 4 :
			System.out.print(" April");
			break;
		case 5 :
			System.out.print(" May");
			break;
		case 6 :
			System.out.print(" June");
			break;
		case 7 :
			System.out.print(" July");
			break;
		case 8 :
			System.out.print(" August");
			break;
		case 9 : 
			System.out.print(" September");
			break;
		case 10 :
			System.out.print(" October");
			break;
		case 11 :
			System.out.print(" November");
			break;
		default :
			System.out.print(" December");
		}

	}

}
