package zadaci_04_02_2016;

/**
 * Naziv klase: AccountTest
 * 
 * @author Dejan Mladjenovic
 */

public class AccountTest {
	
	/*
	 * Napisati test program koji kreira Account objekat sa account ID 1122,
	 * stanjem od 20000 i godisnjom kamatnom stopom 4,5%.
	 * Koristiti withdraw metodu da bismo uzeli 2500 sa racuna,
	 * i deposit metodu da bismo stavili na racun 3000.
	 * zatim ispisati stanje, mjesecnu ratu i datum kreiranja racuna.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj objekat
		Account racun = new Account(1122, 20000);
		
		racun.withdraw(2500);//Izvrsi isplatu
		racun.deposit(3000);//Izvrsi uplatu
		racun.print();//Ispisi podatke
	}

}
