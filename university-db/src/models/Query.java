package models;

import java.sql.*;

public class Query {
	
	public static void main(String[] args) {
		try {
			setup();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static Connection connect = null;
	
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
		//query statements
		query1();
		query2();
		query3();
		query4();
		query5();	
	}

	public static void query1() throws SQLException{
		//The student number and ssn of the student whose name is "Becky"
		Statement stmt = null;
		ResultSet resultSet = null;
		String sqlQuery = "";
		String outputString = "";
		sqlQuery = "SELECT S.snum, S.ssn "
				+ "FROM students S "
				+ "WHERE S.name = 'Becky'";
		stmt = connect.createStatement();
		resultSet = stmt.executeQuery(sqlQuery);
		while (resultSet.next()){
			outputString += resultSet.getInt("snum") + "....";
			outputString += resultSet.getInt("ssn") + "\n";
		}
		System.out.println(outputString);
		resultSet.close();
	}
	
	public static void query2() throws SQLException{
		//The major name and major level of the student whose ssn is 123097834
		Statement stmt = null;
		ResultSet resultSet = null;
		String sqlQuery = "";
		String outputString = "";
		sqlQuery = "SELECT M.name, M.level "
				+ "FROM students S INNER JOIN major M "
				+ "ON M.snum = S.snum " 
				+ "WHERE S.ssn = 123097834 ";
		stmt = connect.createStatement();
		resultSet = stmt.executeQuery(sqlQuery);
		while (resultSet.next()){
			outputString += resultSet.getString("name") + "....";
			outputString += resultSet.getString("level") + "\n";
		}
		System.out.println(outputString);
		resultSet.close();		
	}
	
	public static void query3() throws SQLException{
		//The names of all courses offered by the department of Computer Science
		Statement stmt = null;
		ResultSet resultSet = null;
		String sqlQuery = "";
		String outputString = "";
		sqlQuery = "SELECT name "
				+ "FROM courses " 
				+ "WHERE courses.department_code = 401 ";
		stmt = connect.createStatement();
		resultSet = stmt.executeQuery(sqlQuery);
		while (resultSet.next()){
			outputString += resultSet.getString("name") + "\n";
		}
		System.out.println(outputString);
		resultSet.close();		
	}
	
	public static void query4() throws SQLException{
		//All degree names and levels offered by the department Computer Science
		Statement stmt = null;
		ResultSet resultSet = null;
		String sqlQuery = "";
		String outputString = "";
		sqlQuery = "SELECT degrees.name, degrees.level "
				+ "FROM degrees " 
				+ "WHERE degrees.department_code = 401 ";
		stmt = connect.createStatement();
		resultSet = stmt.executeQuery(sqlQuery);
		while (resultSet.next()){
			outputString += resultSet.getString("name") + "....";
			outputString += resultSet.getString("level") + "\n";
		}
		System.out.println(outputString);
		resultSet.close();	
	}
	
	public static void query5() throws SQLException{
		//The names of all students who have a minor
		Statement stmt = null;
		ResultSet resultSet = null;
		String sqlQuery = "";
		String outputString = "";
		sqlQuery = "SELECT S.name "
				+ "FROM students S INNER JOIN minor M " 
				+ "ON M.snum = S.snum ";
		stmt = connect.createStatement();
		resultSet = stmt.executeQuery(sqlQuery);
		while (resultSet.next()){
			outputString += resultSet.getString("name") + "\n";
		}
		System.out.println(outputString);
		resultSet.close();	
	}
}
