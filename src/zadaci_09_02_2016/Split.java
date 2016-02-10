package zadaci_09_02_2016;

import java.util.ArrayList;

/**Naziv klase: Split
 * 
 * @author Dejan Mladjenovic
 */

public class Split {
	
	/*
	 * The split method in the String class returns an array of strings 
	 * consisting of the substrings split by the delimiters. However, the delimiters are not returned. 
	 * Implement the following new method that returns an array of strings consisting of the substrings 
	 * split by the matching delimiters, including the matching delimiters.
	 * -public static String[] split(String s, String regex)
	 * For example, split("ab#12#453", "#") returns ab, #, 12, #, 453 in an array of String
	 */

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj niz stringova i pozovi metodu
		String[] niz = split("abc#12#453", "#");
		
		//Ispisi rezultat
		for(int i = 0; i < niz.length; i++){
			System.out.print(niz[i] + " ");
		}
	}

	/**Metoda vraca niz Stringova* odvojenih delimiterom 
	   ukljucujuci i delimiter*/
	public static String[] split(String s, String regex){
		
		String[] str = s.split(regex);
		ArrayList<String> lista = new ArrayList<>();
		for (int i = 0; i < str.length; i++) {
			lista.add(str[i]);
			lista.add(regex);
		}
		lista.remove(lista.size() - 1);
		String[] list = new String[lista.size()];
		lista.toArray(list);

		return list;
	}
}
