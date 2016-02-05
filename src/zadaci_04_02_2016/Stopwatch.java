package zadaci_04_02_2016;

/**
 * Naziv klase: Stopwatch
 * 
 * @author Dejan Mladjenovic
 */

public class Stopwatch {
	
	/*
	 * Dizajnirati klasu Stopwatch. Klasa sadrzi:
	 * -privatne osobine naziva startTime i endTime sa geter metodama,
	 * -konstruktor bez argumenata koji inicijalizuje startTime sa trenutnim vremenom
	 * -metodu startTime() koja resetuje startTime na trenutno vrijeme
	 * -metodu stopTime() koja postavlja endTime na trenutno vrijeme
	 * -metodu getElapsedTime() koja vraca proteklo vrijeme stoperice u milisekundama
	 */

	//Osobine
	private long startTime;//Pocetno vrijeme
	private long endTime;//Krajnje vrijeme
	
	//Konstruktor
	public Stopwatch() {
		this.startTime = System.currentTimeMillis();	
	}
	
	//Metode	
	public long getStartTime() {
		return startTime;
	}
	
	public long getEndTime() {
		return endTime;
	}
	
	public void start(){
		startTime = System.currentTimeMillis();
	}
	
	public void end(){
		endTime = System.currentTimeMillis();
	}
	
	public long getElapsedTime(){
		return endTime - startTime;
	}

}
