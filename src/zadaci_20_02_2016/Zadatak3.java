package zadaci_20_02_2016;

/**
 * Naziv klase: Zadatak3
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak3 {
	
	/*
	 * Write a program similar to Listing 7.9, Calculator.java. Instead of using integers, use rationals.
	 * You will need to use the split method in the String class, Replacing and Splitting Strings, 
	 * to retrieve the numerator string and denominator string, and convert strings into integers 
	 * using the Integer.parseInt method.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Provjeri argumente
		if(args.length != 3){
			System.out.println("Koristite: operand1 operator operand2");
			System.exit(0);
		}
				
		String operand1 = args[0];//Prvi operand
		String operator = args[1];//Operator
		String operand2 = args[2];//Drugi operand
		
		//Prvi broj
		int numerator1 = 0;
		int denominator1 = 0;
		//Drugi broj
		int numerator2 = 0;
		int denominator2 = 0;
		//Pretvori argumente u brojeve
		try{//Prvi broj
			numerator1 = Integer.parseInt(operand1.split("/")[0]);
			denominator1 = Integer.parseInt(operand1.split("/")[1]);
			//Drugi broj
			numerator2 = Integer.parseInt(operand2.split("/")[0]);
			denominator2 = Integer.parseInt(operand2.split("/")[1]);
		}catch(NumberFormatException e){
			System.out.println("Greska u argumentima!");
			System.exit(0);
		}
		
		//Kreiraj objekte
		Rational r1 = new Rational(numerator1, denominator1);
		Rational r2 = new Rational(numerator2, denominator2);
		
		//Kreiraj objekat za rezultat
		Rational rezultat = new Rational();
		
		//Izracunaj rezultat
		switch (operator) {
		case "+":
			rezultat = r1.add(r2);
			break;
		case "-":
			rezultat = r1.subtract(r2);
			break;
		case ".":
			rezultat = r1.multiply(r2);
			break;
		case "/":
			rezultat = r1.divide(r2);
			break;
		default: 
			System.out.println("Neispravan unos!");
			System.exit(0);
		}
		
		//Ispisi rezultat
		System.out.println(operand1 + " " + operator + " " + operand2 + " = " + rezultat);
	}

}
