package grupniProjekat;

/**
 * Naziv interfejsa: WorldDao
 * 
 * @author Dejan Mladjenovic
 */

import java.sql.SQLException;
import java.util.ArrayList;

public interface WorldDao {
	
	public ArrayList<Country> CountryName() throws SQLException;
	public ArrayList<Country> Population() throws SQLException;
	public ArrayList<City> City() throws SQLException;

}
