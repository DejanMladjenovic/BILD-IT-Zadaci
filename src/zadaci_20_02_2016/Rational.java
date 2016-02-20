package zadaci_20_02_2016;

/**
 * Naziv klase: Rational
 * 
 * @author Dejan Mladjenovic
 */

public class Rational extends Number implements Comparable<Rational> {
	
	/*
	 * Rewrite the Rational class in Listing 13.13 using a new internal representation 
	 * for the numerator and denominator. Create an array of two integers as follows:
	 * private long[] r = new long[2];
	 * Use r[0] to represent the numerator and r[1] to represent the denominator.
	 * The signatures of the methods in the Rational class are not changed, so a client
	 * application that uses the previous Rational class can continue to use this new
	 * Rational class without being recompiled.
	 */

	//Osobine
	private long[] r = new long[2];

	//Konstruktor bez argumenata
	public Rational(){
		this.r[0] = 0;
		this.r[1] = 1;
	}
	
	//Konstruktor sa odredjenim vrijednostima
	public Rational(long numerator, long denominator){
		long gcd = gcd(numerator, denominator);
		this.r[0] = ((denominator > 0) ? 1 : -1) * numerator / gcd;
		this.r[1] = Math.abs(denominator) / gcd;
	}
	
	/**Vraca najveci zajednicki djelilac za dva broja*/
	public static long gcd(long n, long d){
		long n1 = Math.abs(n);
		long n2 = Math.abs(d);
		int gcd = 1;

		for (int k = 1; k <= n1 && k <= n2; k++){
			if (n1 % k == 0 && n2 % k == 0) {
				gcd = k;
			}
		}
		return gcd;
	}
	/**Vraca numerator*/
	public long getNumerator(){
		return r[0];
	}
	/**Vraca denominator*/
	public long getDenominator(){
		return r[1];	
	}
	/**Vraca zbir dva objekta*/
	public Rational add(Rational secondRational){
		long n = r[0] * secondRational.getDenominator()
				+ r[1] * secondRational.getNumerator();
		long d = r[1] * secondRational.getDenominator();
		return new Rational(n, d);
	}
	/**Vraca razliku dva objekta*/
	public Rational subtract(Rational secondRational){
		long n = r[0] * secondRational.getDenominator()
				- r[1] * secondRational.getNumerator();
		long d = r[1] * secondRational.getDenominator();
		return new Rational(n, d);
	}
	/**vraca proizvod dva objekta*/
	public Rational multiply(Rational secondRational){
		long n = r[0] * secondRational.getNumerator();
		long d = r[1] * secondRational.getDenominator();
		return new Rational(n, d);
	}
	/**Vracda kolicnik dva objekta*/
	public Rational divide(Rational secondRational){
		long n = r[0] * secondRational.getDenominator();
		long d = r[1] * secondRational.getNumerator();
		return new Rational(n, d);
	}
	/**Vraca ispis objekta*/
	@Override
	public String toString(){
		if(r[1] == 1)
			return r[0] + "";
		else
			return r[0] + "/" + r[1];
	}
	/**Provjerava jednakost dva objekta*/
	@Override
	public boolean equals(Object other){
		if((this.subtract((Rational) (other))).getNumerator() == 0)
			return true;
		return false;
	}
	/**Vraca double vrijednost broja*/
	@Override
	public double doubleValue(){
		return r[0] * 1.0 / r[1];
	}	
	/**Vraca int vrijednost broja*/
	@Override
	public int intValue(){
		return (int)doubleValue();
	}
	/**Vraca float vrijednost broja*/
	@Override
	public float floatValue(){
		return (float)doubleValue();
	}
	/**Vraca long vrijednost broja*/
	@Override
	public long longValue() {
		return (long) doubleValue();
	}
	
	/**Uporedjuje dva objekta*/
	@Override
	public int compareTo(Rational o) {
		if (this.subtract(o).getNumerator() > 0)
			return 1;
		else if (this.subtract(o).getNumerator() < 0)
			return -1;
		else
			return 0;
	}	
}
