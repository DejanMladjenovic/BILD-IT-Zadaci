package zadaci_21_01_2016;

/**
 * Naziv klase: Zadatak4
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Zadatak4 {
	
	/*
	 * Pozitivni cijeli broj je savršen broj ukoliko je jednak zbiru svih svojih pozitivnih djelilaca, 
	 * iskljuèujuæi sebe. Na primjer, 6 je prvi savršeni broj jer 6 = 3 + 2 + 1. 
	 * Sljedeæi savršeni broj je 28 jer 28 = 14 + 7 + 4 + 2 + 1. 
	 * Samo 4 savršena broja postoje u rasponu od 0 do 10.000. Napišite program koji ispisuje sva 4.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Ispisi tekst
		System.out.println("Savrseni brojevi:");
		
		////Provjeri koji brojevi ispunjavaju uslov
		for(int i = 1; i <= 10000; i++){
			int zbir = 0;
			for(int j = 1; j < i; j++){
				if(i % j == 0){
					zbir += j;
				}
			}
			//Ispisi rezultat
			if(i == zbir)
				System.out.println(i);
		}

	}
       
}
