package grupniProjekat;

/**
 * Naziv klase: Country
 * 
 * @author Dejan Mladjenovic
 */

public class Country {

	// Osobine
	String Code;
	String Name;
	String Continent;
	String Region;
	double SurfaceArea;
	int IndepYear;
	long Population;
	double LifeExpectancy;
	double GNP;
	double GNPOld;
	String LocalName;
	String GovernmentForm;
	String HeadOfState;
	int Capital;
	String Code2;

	// Konstruktor bez argumenata
	public Country() {
	}

	// Konstruktor sa odredjenim vrijednostima
	public Country(String Code, String Name, String Continent, String Region,
			double SurfaceArea, int IndepYear, long Population,
			double LifeExpectancy, double GNP, double GNPOld, String LocalName,
			String GovernmentForm, String HeadOfState, int Capital, String Code2) {
		this.Code = Code;
		this.Name = Name;
		this.Continent = Continent;
		this.Region = Region;
		this.SurfaceArea = SurfaceArea;
		this.IndepYear = IndepYear;
		this.Population = Population;
		this.LifeExpectancy = LifeExpectancy;
		this.GNP = GNP;
		this.GNPOld = GNPOld;
		this.LocalName = LocalName;
		this.GovernmentForm = GovernmentForm;
		this.HeadOfState = HeadOfState;
		this.Capital = Capital;
		this.Code2 = Code2;
	}

	//Geteri
	public String getCode() {
		return Code;
	}

	public String getName() {
		return Name;
	}

	public String getContinent() {
		return Continent;
	}

	public String getRegion() {
		return Region;
	}

	public double getSurfaceArea() {
		return SurfaceArea;
	}

	public int getIndepYear() {
		return IndepYear;
	}

	public long getPopulation() {
		return Population;
	}

	public double getLifeExpectancy() {
		return LifeExpectancy;
	}

	public double getGNP() {
		return GNP;
	}

	public double getGNPOld() {
		return GNPOld;
	}

	public String getLocalName() {
		return LocalName;
	}

	public String getGovernmentForm() {
		return GovernmentForm;
	}

	public String getHeadOfState() {
		return HeadOfState;
	}

	public int getCapital() {
		return Capital;
	}

	public String getCode2() {
		return Code2;
	}
	
	/**Vradca ispis objekta*/
	public void toPrint(){	
		System.out.printf("%-5s%-15.12s%-15s%-15.2f%-15d%-12.2f%-15.12s\n", this.getCode(), this.getName(), this.getContinent(),
				this.getSurfaceArea(), this.getPopulation(), this.getGNP(), this.getLocalName());
	}
}
