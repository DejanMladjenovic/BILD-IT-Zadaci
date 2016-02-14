package zadaci_12_02_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Naziv klase: PerfectSquare
 * 
 * @author Dejan Mladjenovic
 */

public class PerfectSquare {
	
	/*
	 * Write a program that prompts the user to enter an integer
	 * m and find the smallest integer n such that m * n is a perfect square. 
	 * (Hint: Store all smallest factors of m into an array list. n is the product of the factors 
	 * that appear an odd number of times in the array list. For example, consider m = 90,
	 * store the factors 2, 3, 3, 5 in an array list. 2 and 5 appear an odd number of times
	 * in the array list. So, n is 10.)
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Kreiraj listu
		ArrayList<Integer> list = new ArrayList<>();

		//Pitaj korisnika da unese broj
		System.out.println("Unesite cijeli broj:");
		int broj;
		while(true){
			try{
				broj = unos.nextInt();
				break;
			}catch(InputMismatchException e){
				System.out.println("Pogresan unos! Pokusajte ponovo!");
				unos.nextLine();
			}
		}
		//Ubaci faktore datog broja u listu
		list = smallestFactors(broj);
		
		//Izracunaj proizvod najmanjih faktora broja koji se ponavljaju neparan broj puta
		broj(list);
		
		//Ispisi rezultat
		System.out.println("Najmanji broj n da bi " + broj + " * n bilo savrsen kvadrat je " + broj(list));
		System.out.println(broj + " * " + broj(list) + " = " + (broj * broj(list)));
	}
	
	/**Vraca listu najmanjih faktora datog broja*/
	public static ArrayList<Integer> smallestFactors(int broj){
		
		ArrayList<Integer> list = new ArrayList<>();
		int factor = 2;
		while(broj != 1){
			if(broj % factor == 0){
				list.add(factor);
				broj /= factor;
			}else
				factor++;
		}
		return list;
	}
	
	/**Vraca proizvod najmanjih faktora koji se ponavljaju neparan broj puta u listi*/
	public static int broj(ArrayList<Integer> list){
		
		ArrayList<Integer> factors = new ArrayList<>();
		int rezultat = 1;
		for (int i = 0; i < list.size(); i++) {
			int brojac = 1;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j) == list.get(i) && i != j) {
					brojac++;
				}
			}
			if (brojac % 2 != 0 && !factors.contains(list.get(i))) {
				factors.add(list.get(i));
				rezultat *= list.get(i);
			}
			brojac = 1;
		}
		return rezultat;
	}
}
