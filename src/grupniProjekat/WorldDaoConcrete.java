package grupniProjekat;

/**
 * Naziv klase: WorldDaoConcrete
 * 
 * @author Dejan Mladjenovic
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class WorldDaoConcrete implements WorldDao {
	Connection connection;

	/**Kreira konekciju sa bazom podataka*/
	public Connection getConnected(String dataBaseName) throws Exception {
		try {
			String driver = "com.mysql.jdbc.Driver";
			String CONN_STRING = "jdbc:mysql://localhost/" + dataBaseName;
			String USERNAME = "root";
			String PASSWORD = "";
			Class.forName(driver);

			connection = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
			System.out.println("Database Connected");
			return connection;
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return null;
	}

	/**Pretrazuje bazu po nazivu drzave*/
	@Override
	public ArrayList<Country> CountryName() throws SQLException {
		
		ArrayList<Country> list = new ArrayList<>();
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite naziv drzave:");
		String drzava = unos.nextLine();
		String query = "SELECT * FROM country WHERE Name LIKE '" + drzava + "%' ORDER BY Name" ;
		unos.close();
		try(Statement prep = connection.createStatement();) {
			ResultSet result = prep.executeQuery(query);
			while(result.next()){
				list.add(new Country(result.getString("Code"), result.getString("Name"),
						result.getString("Continent"), result.getString("Region"), result.getDouble("SurfaceArea"),
						result.getInt("IndepYear"), result.getLong("Population"), result.getDouble("LifeExpectancy"),
						result.getDouble("GNP"), result.getDouble("GNPOld"), result.getString("LocalName"),
						result.getString("GovernmentForm"), result.getString("HeadOfState"), result.getInt("Capital"),
						result.getString("Code2")));
			}	
		}
		return list;
	}

	/**Pretrazuje bazu po broju stanovnika*/
	@Override
	public ArrayList<Country> Population() throws SQLException {
		
		ArrayList<Country> list = new ArrayList<>();
		Scanner unos = new Scanner(System.in);
		System.out.println("Izaberite populaciju za pretragu:");
		System.out.print("Od: ");
		long start = unos.nextLong();
		System.out.print("Do: ");
		long end = unos.nextLong();
		String query = "SELECT * FROM country WHERE Population BETWEEN " + start + " AND " + end + " ORDER BY Population";
		try(Statement prep = connection.createStatement();) {
			ResultSet result = prep.executeQuery(query);
			while(result.next()){
				list.add(new Country(result.getString("Code"), result.getString("Name"),
						result.getString("Continent"), result.getString("Region"), result.getDouble("SurfaceArea"),
						result.getInt("IndepYear"), result.getLong("Population"), result.getDouble("LifeExpectancy"),
						result.getDouble("GNP"), result.getDouble("GNPOld"), result.getString("LocalName"),
						result.getString("GovernmentForm"), result.getString("HeadOfState"), result.getInt("Capital"),
						result.getString("Code2")));				
			}
		}
		return list;
	}

	/**Pretrazuje bazu po nazivu grada*/
	@Override
	public ArrayList<City> City() throws SQLException {
		
		ArrayList<City> list = new ArrayList<>();
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite naziv grada:");
		String grad = unos.nextLine();
		String query = "SELECT * FROM city WHERE Name LIKE '" + grad + "%' ORDER BY Name" ;
		unos.close();
		try(Statement prep = connection.createStatement();) {
			ResultSet result = prep.executeQuery(query);
			while(result.next()){
				list.add(new City(result.getInt("ID"), result.getString("Name"), result.getString("CountryCode"),
						result.getString("District"), result.getInt("Population")));
			}		
			
		}
		return list;
	}
	
}
