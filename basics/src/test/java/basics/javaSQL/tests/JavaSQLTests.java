package basics.javaSQL.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaSQLTests{
	public static Connection conn = null; 
	
	@Test
	public void canDoDescendingCitySelectLimit10() {
		String query = "SELECT city FROM sakila.city ORDER BY city DESC LIMIT 10;";
		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getString("city"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Test
	public void canGetFilmsWithTitleContainingAirplane() {
		String query = "SELECT title FROM sakila.film WHERE title LIKE '%airplane%';";
		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getString("title"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void canGetHighestPayment() {
		String query = "SELECT MAX(amount) FROM sakila.payment;";
		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getFloat("MAX(amount)"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void canGetRecordsForStoreID1() {
		String query = "SELECT COUNT(*)\n"
				+ "FROM sakila.customer AS c\n"
				+ "WHERE c.store_id = 1";
		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt("COUNT(*)"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void canGetPaymentsFromNancyThomas() {
		String query = "SELECT p.* \n"
				+ "FROM sakila.payment AS p\n"
				+ "JOIN sakila.customer AS c ON c.customer_id = p.customer_id\n"
				+ "WHERE c.email = 'NANCY.THOMAS@sakilacustomer.org'";
		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.print(rs.getInt("payment_id")+", ");
				System.out.print(rs.getInt("customer_id")+", ");
				System.out.print(rs.getInt("staff_id")+", ");
				System.out.print(rs.getInt("rental_id")+", ");
				System.out.print(rs.getFloat("amount")+", ");
				System.out.print(rs.getDate("payment_date")+", ");
				System.out.println(rs.getDate("last_update")+", ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void canGetBobFawcettActorInfo() {
		String query = "SELECT * FROM sakila.film_list WHERE actors LIKE '%BOB FAWCETT%'";
		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.print(rs.getInt("FID")+", ");
				System.out.print(rs.getString("title")+", ");
				//System.out.print(rs.getString("description")+", ");
				System.out.print(rs.getString("category")+", ");
				System.out.print(rs.getFloat("price")+", ");
				System.out.print(rs.getInt("length")+", ");
				System.out.println(rs.getString("rating")+", ");
				//System.out.println(rs.getString("actors")+", ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void canUseStoredProcedure() {
		String query = "CALL film_in_stock(@filmId, 2, @filmCount);";
		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt("inventory_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	@BeforeTest
	public void beforeTest() {	
		createConnection();
	}

	@AfterTest
	public void afterTest() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void createConnection() {
		String connectionStr = "jdbc:mysql://localhost:3306/sakila?user=root";
		String username = "root";
		String password = "password";
		
		try {
			conn = DriverManager.getConnection(connectionStr, username, password);
			System.out.println("Connected");
		} catch (SQLException e) {
			System.out.println("Did not connect");
			e.printStackTrace();
		}
	}
}
