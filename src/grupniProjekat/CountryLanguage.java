package grupniProjekat;

public class CountryLanguage {

	// Osobine
	String CountryCode;
	String Language;
	char IsOfficial;
	double Percentage;

	//Konstruktor bez argumenata
	public CountryLanguage() {
	}
	
	//Konstruktor sa odredjenim vrijednostima
	public CountryLanguage(String CountryCode, String Language,
			char IsOfficial, double Percentage) {
		this.CountryCode = CountryCode;
		this.Language = Language;
		this.IsOfficial = IsOfficial;
		this.Percentage = Percentage;
	}

	public String getCountryCode() {
		return CountryCode;
	}

	public String getLanguage() {
		return Language;
	}

	public char getIsOfficial() {
		return IsOfficial;
	}

	public double getPercentage() {
		return Percentage;
	}
}
