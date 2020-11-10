
public class Exercise_3_4a {

	// http://www.primeuniversity.edu.bd/160517/vc/eBook/download/IntroductiontoJava.pdf
	public static void main(String[] args) {
		
		// Generate a random number between 1 and 12.
		int randomNumber = (int)(Math.random()*12);
		
		randomNumber++;
		
		if(randomNumber==1)
			System.out.print(1 + " January");
		else if(randomNumber==2) 
			System.out.print(2 + " February");
		else if(randomNumber==3) 
			System.out.print(3 + " Martch");
		else if(randomNumber==4) 
			System.out.print(4 + " April");
		else if(randomNumber==5) 
			System.out.print(5 + " May");
		else if(randomNumber==6) 
			System.out.print(6 + " June");
		else if(randomNumber==7) 
			System.out.print(7 + " July");
		else if(randomNumber==8) 
			System.out.print(8 + " August");
		else if(randomNumber==9) 
			System.out.print(9 + " September");
		else if(randomNumber==10) 
			System.out.print(10 + " October");
		else if(randomNumber==11) 
			System.out.print(11 + " November");
		else
			System.out.print(12 + " December");

	}

}
