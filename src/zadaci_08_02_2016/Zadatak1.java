package zadaci_08_02_2016;

import java.math.BigDecimal;

/**
 * Naziv klase: Zadatak1
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak1 {
	
	/*
	 * Find the first ten numbers with 50 decimal digits that are divisible by 2 or 3.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Prvi objekat sa 50 cifara
		BigDecimal broj = new BigDecimal("100000000000000000000000000000000000000000000000000");

		//BigDecimal objekat 2
		BigDecimal dva = new BigDecimal("2");
		
		//Bigdecimal objekat 3
		BigDecimal tri = new BigDecimal("3");
		
		//Brojac brojeva koji su djeljivi sa 2 i li sa 3
		int brojac = 0;
		while(brojac < 10){
			//Ostatak dijeljenja datog broja sa 2
			BigDecimal moduloDva = broj.remainder(dva);
			
			//Ostatak dijeljenja datog broja sa 3
			BigDecimal moduloTri = broj.remainder(tri);
			
			//Ako broj ispunjava uslov ispisi ga
			if(moduloDva == BigDecimal.ZERO || moduloTri == BigDecimal.ZERO){
				System.out.println(broj);
				brojac++;
			}
			//Povecaj vrijednost objekta za 1 
			broj = broj.add(BigDecimal.ONE);
		}
		
	}

}
