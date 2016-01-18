package zadaci_18_01_2016;


/**
 * Nazv klase: Zadatak4
 * 
 * @author Dejan Mladjenovic
 *
 */

public class Zadatak4 {
	
	/*
	 *  Napisati metodu koja printa 100 nasumiènih uppercase karaktera i 100 nasumiènih brojeva, 10 po liniji.
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

	ispis();//Poziva metodu
		
	}
	
	/**Vraca po 100 nasumicnih brojeva i velikih slova*/
	public static void ispis(){
		
		//Ispisuje 100 nasumicnih brojeva(10 po liniji)
		System.out.println("Brojevi:");
		int broj;
		int brojac = 0;
		for(int i = 0; i < 100; i++){
			brojac++;
			broj = (int)(Math.random() * 100);
			if(brojac % 10 == 0){
				System.out.printf("%4d\n", broj);
			}else{
				System.out.printf("%4d", broj);
			}
		}
		
		//Ispisuje 100 nasumicnih velikih slova(10 po liniji)
		System.out.println("Slova:");
		char slovo;
		int brojacSlova = 0;
		for(int i = 0; i < 100; i++){
			brojacSlova++;
			slovo = (char) (65 + Math.random() * 26);
			if(brojacSlova % 10 == 0){
				System.out.println("  " + slovo);
			}else{
				System.out.print("  " + slovo);
			}
		}
		
	}
	
	

}
