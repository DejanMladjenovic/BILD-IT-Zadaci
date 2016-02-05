package zadaci_04_02_2016;

/**
 * Naziv klase: Location
 * 
 * @author Dejan Mladjenovic
 */

public class Location {
	
	/*
	 * Dizajnirati klasu Location koja ce locirati najvecu vrijednosti njenu pozicijuu 2D nizu
	 * Klasa sadrzi:
	 * -public osobine row, column i maxValue gdje su row i column int tipa a maxValue double tipa
	 * -metodu public static Location locateLargest(double[][] a) koja ce vratiti lokaciju
	 * najveceg clana 2D niza. Metoda vraca kao rezultat instancu  od Location
	 */
	
	//Osobine
	public int row;//red
	public static int column;//Kolona
	public static double maxValue;//najveca vrijednost
	
	//Konstruktor
	public Location(int row, int column, double maxValue){
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}
	
	
	//Metode
	/**Metoda locira najvecu vrijednost i njenu poziciju
	 * i vraca instancu od Location*/
	public static Location locateLargest(double[][] a){
		
		double max = 0;	
		int red = 0;
		int kolona = 0;
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[0].length; j++){
				if(a[i][j] > max){
					max = a[i][j];
					red = i;
					kolona = j;
				}
			}
		}
		Location l = new Location(red, kolona, max);
		return l ;
	}

}
