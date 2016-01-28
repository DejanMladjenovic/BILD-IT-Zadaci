package miniProjekat2;

/**
 * Naziv klae: Craps10000Times
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Craps10000Times {
	
	/*
	 * Napisati program za igru Craps. Igra se sastoji od bacanja dvije kocke sa brojevima od 1 do 6.
	 * Ukoliko je zbir bacenih kocki 2, 3, ili 12, vi gubite. Ako je zbir 7 ili 11, vi pobjedjujete.
	 * U ostalim slucajevima, dobijeni zbir se memorise i igra nastavlja dok zbir ne bude 7 ili 
	 * prvodobijeni zbir. Ako je zbir 7 vi gubite , a ako je zbir jednak prvodobijenom zbiru vi pobjedjujete.
	 * Pokreni igru 10000 puta i ispisi broj pobjeda i broj poraza.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		int brojac = 0;//Brojac ponavljanja igre
		int win = 0;//Brojac pobjeda
		int lose = 0;//Brojac poraza

		do {

			// Baci kocke
			int dice1 = (int) (1 + Math.random() * 6);
			int dice2 = (int) (1 + Math.random() * 6);

			// Zbir bacanja kocki
			int sum = dice1 + dice2;
			int point = sum;// zbir prvog bacanja

			if (sum == 2 || sum == 3 || sum == 12) {//Ako je zbir jednak 2, 3 ili 12, izgubili ste
				lose++;
			} else if (sum == 7 || sum == 11) {//Ako je zbir jednak 7 ili 11, pobijedili ste 
				win++;
			} else {// Ako je zbir jednak 4, 5, 6, 8, 9 ili 10, bacajte ponovo
				do {
					dice1 = (int) (1 + Math.random() * 6);
					dice2 = (int) (1 + Math.random() * 6);
					sum = dice1 + dice2;
				} while (sum == 7 ^ sum != point);// Bacajte kocke dok ne
													// dobijete
													// zbir 7 ili zbir prvog
													// bacanja
				if (sum == 7) {// Ako je rezultat ponovnog bacanja 7, izgubili
								// ste
					lose++;
				} else {// Ako je rezultat ponovnog bacanja jednak zbiru prvog
						// bacanja, pobijedili ste
					win++;
				}
			}
			brojac++;
		} while (brojac < 10000);
		
		//Ispisi rezultat
		System.out.println("Ukupno pobjeda " + win);
		System.out.println("Ukupno poraza " + lose);
	}
}
