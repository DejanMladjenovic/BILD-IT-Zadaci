package grupniProjekat;

/**Naziv klase City
 * 
 * @author Dejan Mladjenovic
 */

public class City {

	// Osobine
	int ID;
	String Name;
	String CountryCode;
	String District;
	long Population;

	// Konstruktor bez argumenata
	public City() {
	}

	// Konstruktor sa odredjenim vrijednostima
	public City(int ID, String Name, String CountryCode, String District, long Population) {
		this.ID = ID;
		this.Name = Name;
		this.CountryCode = CountryCode;
		this.District = District;
		this.Population = Population;
	}

	//Geteri
	public int getID() {
		return ID;
	}

	public String getName() {
		return Name;
	}

	public String getCountryCode() {
		return CountryCode;
	}

	public String getDistrict() {
		return District;
	}

	public long getPopulation() {
		return Population;
	}
	
	public void toPrint() {
		System.out.printf("%-5s%-15.12s%-15s%-15.12s%-15d\n", this.getID(), this.getName(),
				this.getCountryCode(), this.getDistrict(), this.getPopulation());
	}
}
