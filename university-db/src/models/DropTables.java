package models;
import java.sql.*;

public class DropTables {
	
	public static void main(String[] args) {
		try {
			setup();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static Connection connect = null;
	private static final int num_databases = 7;
	
	public static void setup() throws SQLException{
		
		try {
			//Set up connection parameters
			String userName = "root";
			String password = "password";
			String dbServer = "jdbc:mysql://localhost:3306/university-db"; //Set up connection
			connect = DriverManager.getConnection(dbServer,userName,password);
		} catch(Exception e) {
			System.out.println("Couldn't connect to the database");
		}
		//drop tables
		drop_tables();
	}

	
	public static void drop_tables() throws SQLException{
		
		Statement stmt = null;
		String sql = "";
		stmt = connect.createStatement();
		stmt.execute("SET FOREIGN_KEY_CHECKS=0");
		int x = 0;
		while (x < num_databases){
			stmt = connect.createStatement();
			switch (x){
			case 0:
				sql = "DROP TABLE students ";
				break;
			case 1:
				sql = "DROP TABLE departments ";
				break;
			case 2:
				sql = "DROP TABLE degrees ";
				break;
			case 3:
				sql = "DROP TABLE courses ";
				break;
			case 4:
				sql = "DROP TABLE register ";
				break;
			case 5:
				sql = "DROP TABLE major ";
				break;
			case 6:
				sql = "DROP TABLE minor ";
				break;
			}
			stmt.executeUpdate(sql);
			x++;
		}
	}
}
