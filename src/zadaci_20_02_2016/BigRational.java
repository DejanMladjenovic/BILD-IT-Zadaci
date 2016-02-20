package zadaci_20_02_2016;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Naziv klase: BigRational
 * 
 * @author Dejan Mladjenovic
 */

public class BigRational extends Number implements Comparable<BigRational>{
	
	/*
	 * Redesign and implement the Rational class in Listing 13.13 
	 * using BigInteger for the numerator and denominator.
	 */
	
	/**
	 * 
	 */
	//Osobine
	private BigInteger numerator;
	private BigInteger denominator;

	//Konstruktor bez argumenata
	public BigRational(){
		this.numerator = BigInteger.ZERO;
		this.denominator = BigInteger.ONE;
	}
	
	//Konstruktor sa odredjenim vrijednostima
	public BigRational(BigInteger numerator, BigInteger denominator){
		BigInteger gcd = gcd(numerator, denominator);
		this.numerator = ((denominator.compareTo(BigInteger.ZERO) == 1) 
				? BigInteger.ONE : new BigInteger("-1")).multiply(numerator).divide(gcd);
		this.denominator = denominator.abs().divide(gcd);
	}
	
	/**Vraca najveci zajednicki djelilac za dva broja*/
	private static BigInteger gcd(BigInteger n, BigInteger d){
		BigInteger n1 = n.abs();
		BigInteger n2 = d.abs();
		BigInteger gcd = BigInteger.ONE;

		for (BigInteger k = BigInteger.ONE; k.compareTo(n1) <= 0
				&& k.compareTo(n2) <= 0; k = k.add(BigInteger.ONE)){
			if (n1.remainder(k).equals(BigInteger.ZERO)
					&& n2.remainder(k).equals(BigInteger.ZERO)){
				gcd = k;
			}
		}
		return gcd;
	}
	/**Vraca numerator*/
	public BigInteger getNumerator(){
		return numerator;
	}
	/**Vraca denominator*/
	public BigInteger getDenominator(){
		return denominator;	
	}
	/**Vraca zbir dva objekta*/
	public BigRational add(BigRational secondRational){
		BigInteger n = numerator.multiply(secondRational.getDenominator()).add(
				denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new BigRational(n, d);
	}
	/**Vraca razliku dva objekta*/
	public BigRational subtract(BigRational secondRational){
		BigInteger n = numerator.multiply(secondRational.getDenominator()).subtract(
				denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new BigRational(n, d);
	}
	/**vraca proizvod dva objekta*/
	public BigRational multiply(BigRational secondRational){
		BigInteger n = numerator.multiply(secondRational.getNumerator());
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new BigRational(n, d);
	}
	/**Vracda kolicnik dva objekta*/
	public BigRational divide(BigRational secondRational){
		BigInteger n = numerator.multiply(secondRational.getDenominator());
		BigInteger d = denominator.multiply(secondRational.getNumerator());
		return new BigRational(n, d);
	}
	/**Vraca ispis objekta*/
	@Override
	public String toString(){
		if(denominator.equals(BigInteger.ONE))
			return numerator + "";
		else
			return numerator + "/" + denominator;
	}
	/**Provjerava jednakost dva objekta*/
	@Override
	public boolean equals(Object other){
		if((this.subtract((BigRational) (other))).getNumerator().compareTo(BigInteger.ZERO) == 0)
			return true;
		return false;
	}
	/**Vraca double vrijednost broja*/
	@Override
	public double doubleValue(){
		BigDecimal n = new BigDecimal(numerator);
		BigDecimal d = new BigDecimal(denominator);
		return n.divide(d).doubleValue();
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
	public int compareTo(BigRational o) {
		if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) == 1)
			return 1;
		else if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) == 0)
			return 0;
		else
			return -1;
	}

}
