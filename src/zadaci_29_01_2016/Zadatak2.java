package zadaci_29_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Naziv klase: Zadatak2
 * 
 * @author Dejan Mladjenovic
 */

public class Zadatak2 {
	
	/*
	 * Napisati program koji igra sa protivnikom rock-paper-scissors.
	 * Program nasumièno generiše brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze.
	 * Program pita korisnika da unese 0, 1 ili 2 te mu ispisuje poruku da li je korisnik pobijedio, 
	 * da li je raèunar pobijedio ili je bilo neriješeno. 
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Rezultat igre
		String rezultat = null;
		
		//Generisi nasimucno broj za racunar
		int racunar =(int) (Math.random() * 3);
	
		//Izbor racunara
		String r = null;
		if (racunar == 0)
			r = "papir";
		else if(racunar == 1)
			r = "bunar";
		else
			r = "makaze";
		
		//Izbaci pitanje korisniku da izabere broj za unos
		System.out.println("Unesite 0 za papir, 1 za bunar ili 2 za makaze: ");
		int odgovor;
		while (true) {
			try {
				odgovor = unos.nextInt();
				if (odgovor != 0 ^ odgovor != 1 ^ odgovor != 2) {
					System.err.println("Pogresan broj! Pokusajte ponovo!");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				System.err.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
		
		//Izbor korisnika
		String o = null;
		if(odgovor == 0)
			o = "papir";
		else if(odgovor == 1)
			o = "bunar";
		else
			o = "makaze";
		
		//Uporedi izbor racunara sa korisnikovim izborom
		if(racunar == 0){
			if(odgovor == 1)
				rezultat = "Racunar je pobjednik!";
			else if(odgovor == 2)
				rezultat = "Vi ste pobjednik!";
			else
				rezultat = "Nerijeseno!";
		}else if(racunar == 1){
			if(odgovor == 0)
				rezultat = "Vi ste pobjednik!";
			else if(odgovor == 1)
				rezultat = "Nerijeseno!";
			else
				rezultat = "Racunar je pobjednik!";
		}else if(racunar == 2){
			if(odgovor == 0)
				rezultat = "Racunar je pobjednik!";
			else if(odgovor == 1)
				rezultat = "Vi ste pobjednik!";
			else
				rezultat = "Nerijeseno!";		
		}
		
		//Ispisi rezultat
		System.out.println("Racunar je izabrao " + r + ". Vi ste izabrali " + o  + ".");
		System.out.println(rezultat);
		
	}

}
