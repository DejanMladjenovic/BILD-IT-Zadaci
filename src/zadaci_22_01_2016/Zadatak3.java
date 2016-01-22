package zadaci_22_01_2016;

/**
 * Naziv klase: Zadatak1
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Zadatak3 {
	
	/*
	 * Napišite program koji ispisuje sve brojeve, od 100 do 1000, 
	 * 10 brojeva po liniji, koji su djeljivi i sa 5 i sa 6. 
	 * Razmak izmeðu brojeva treba biti taèno jedan space.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		System.out.println("Brojevi od 100 do 1000 djeljivi i sa 5 i sa 6:\n");
		int brojac = 0;
		//Prodji kroz sve brojeve u zadatom intervalu
		for(int i = 100; i < 1000; i++){
			//Ako je broj djeljiv i sa 5 i sa 6 ispisi ga
			if(i % 5 == 0 && i % 6 == 0){
				brojac++;//Broji brojeve koji ispunjavaju uslov
				if(brojac % 10 == 0)//Kad brojac dodje do 10 prebaci ispis u novi red
					System.out.println(i);
				else
					System.out.print(i + " ");
			}
		}

	}

}
