package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ModifyRecords {
	
	public static void main(String[] args) {
		try {
			setup();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static Connection connect = null;

	public static void setup() throws SQLException {
	
		try {
			//Set up connection parameters
			String userName = "root";
			String password = "password";
			String dbServer = "jdbc:mysql://localhost:3306/university-db"; //Set up connection
			connect = DriverManager.getConnection(dbServer,userName,password);
		} catch(Exception e) {
			System.out.println("Couldn't connect to the database");
		}
		//modify statements
		modify1();
		modify2();
		modify3();
	}

	public static void modify1() throws SQLException {
		//change the name of the student with ssn = 746897816 to Scott
		Statement stmt = null;
		String sql = "";
		stmt = connect.createStatement();
		//stmt.execute("SET FOREIGN_KEY_CHECKS=0");
		sql = "UPDATE students SET name = 'Scott' " +
			  "WHERE ssn = 746897816";
		stmt.executeUpdate(sql);
		//stmt.execute("SET FOREIGN_KEY_CHECKS=1");
	}
	
	public static void modify2() throws SQLException {
		//change the major of the student with ssn = 746897816 to Computer Science, Master.
		Statement stmt = null;
		String sql = "";
		stmt = connect.createStatement();
		//stmt.execute("SET FOREIGN_KEY_CHECKS=0");
		sql = "UPDATE major SET name = 'Computer Science' , level = 'MS' " +
			  "WHERE snum = 1004";
		stmt.executeUpdate(sql);
		//stmt.execute("SET FOREIGN_KEY_CHECKS=1");
	}
	
	public static void modify3() throws SQLException {
		//delete all registration records that were in “Spring2015”
		Statement stmt = null;
		String sql = "";
		stmt = connect.createStatement();
		//stmt.execute("SET FOREIGN_KEY_CHECKS=0");
		sql = "DELETE FROM register " +
			  "WHERE regtime = 'Spring2021' ";
		stmt.executeUpdate(sql);
	}
}
