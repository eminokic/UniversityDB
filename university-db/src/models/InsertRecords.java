package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecords {
	
	public static void main(String[] args) {
		try {
			setup();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@SuppressWarnings("unused")
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
		//insertion statements
		insert_students();
		insert_departments();
		insert_degrees();
		insert_major();
		insert_minor();
		insert_courses();
		insert_register();
	}
	
	
	@SuppressWarnings("null")
	public static void insert_students() throws SQLException{
		Statement stmt = null;
		stmt = connect.createStatement();
		String sql = "";
		int x = 0;
		
		while (x < 7){
			//students insertion
			stmt = connect.createStatement();
			sql = "INSERT INTO students ";
			switch (x) {
				case 0:
					sql += "VALUES (1001, 654651234, 'Randy', 'M', '2000/12/01', '301 E Hall', '5152700988', '121 Main', '7083066321')";
					break;
				case 1:
					sql += "VALUES (1002, 123097834, 'Victor', 'M', '2000/05/06', '270 W Hall', '5151234578', '702 Walnut', '7080366333')";
					break;
				case 2:
					sql += "VALUES (1003, 978012431, 'John', 'M', '1999/07/08', '201 W Hall', '5154132805', '888 University', '5152012011')";
					break;
				case 3:
					sql += "VALUES (1004, 746897816, 'Seth', 'M', '1998/12/30', '199 N Hall', '5158891504', '21 Green', '5154132907')";
					break;
				case 4:
					sql += "VALUES (1005, 186032894, 'Nicole', 'F', '2001/04/01', '178 S Hall', '5158891155', '13 Gray', '5157162071')";
					break;
				case 5: 
					sql += "VALUES (1006, 534218752, 'Becky', 'F', '2001/05/16', '12 N Hall', '5157083698', '189 Clark', '2034367632')";
					break;
				case 6:
					sql += "VALUES (1007, 432609519, 'Kevin', 'M', '2000/08/12', '75 E Hall', '5157082497', '89 National', '7182340772')";
					break;
			}
			stmt.executeUpdate(sql);
			x++;
		}
	}
	
	@SuppressWarnings("null")
	public static void insert_departments() throws SQLException{
		Statement stmt = null;
		stmt = connect.createStatement();
		String sql = "";
		int x = 0;
		
		while (x < 4){
			//departments insertion
			sql = "INSERT INTO departments ";
			switch (x) {
				case 0:
					sql += "VALUES (401, 'Computer Science', 5152982801, 'LAS')";
					break;
				case 1:
					sql += "VALUES (402, 'Mathematics',5152982802, 'LAS')";
					break;
				case 2:
					sql += "VALUES (403, 'Chemical Engineering', 5152982803, 'Engineering')";
					break;
				case 3:
					sql += "VALUES (404, 'Landscape Architect', 5152982804, 'Design')";
					break;
			}
			stmt.executeUpdate(sql);
			x++;
		}
	}
	
	@SuppressWarnings("null")
	public static void insert_degrees() throws SQLException{
		Statement stmt = null;
		stmt = connect.createStatement();
		String sql = "";
		int x = 0;
		
		while (x < 7){
			//degrees insertion
			switch (x) {
				case 0:
					sql = "INSERT INTO degrees " + "VALUES ('Computer Science', 'BS', 401)";
					break;
				case 1:
					sql = "INSERT INTO degrees " + "VALUES ('Software Engineering', 'BS', 401)";
					break;
				case 2:
					sql = "INSERT INTO degrees " + "VALUES ('Computer Science', 'MS', 401)";
					break;
				case 3:
					sql = "INSERT INTO degrees " + "VALUES ('Computer Science', 'PhD', 401)";
					break;
				case 4:
					sql = "INSERT INTO degrees " + "VALUES ('Applied Mathematics', 'MS', 402)";
					break;
				case 5:
					sql = "INSERT INTO degrees " + "VALUES ('Chemical Engineering', 'BS', 403)";
					break;
				case 6:
					sql = "INSERT INTO degrees " + "VALUES ('Landscape Architect', 'BS', 404)";
					break;
			}
			stmt.executeUpdate(sql);
			x++;
		}
	}
	
	@SuppressWarnings("null")
	public static void insert_major() throws SQLException{
		Statement stmt = null;
		stmt = connect.createStatement();
		String sql = "";
		int x = 0;
		
		while (x < 7){
			//major insertion
			sql = "INSERT INTO major ";
			switch (x) {
				case 0:
					sql += "VALUES (1001, 'Computer Science', 'BS')";
					break;
				case 1:
					sql += "VALUES (1002, 'Software Engineering', 'BS')";
					break;
				case 2:
					sql += "VALUES (1003, 'Chemical Engineering', 'BS')";
					break;
				case 3:
					sql += "VALUES (1004, 'Landscape Architect', 'BS')";
					break;
				case 4:
					sql += "VALUES (1005, 'Computer Science', 'MS')";
					break;
				case 5:
					sql += "VALUES (1006, 'Applied Mathematics', 'MS')";
					break;
				case 6:
					sql += "VALUES (1007, 'Computer Science', 'PhD')";
					break;
			}
			stmt.executeUpdate(sql);
			x++;
		}
	}
	
	@SuppressWarnings("null")
	public static void insert_minor() throws SQLException{
		Statement stmt = null;
		stmt = connect.createStatement();
		String sql = "";
		int x = 0;
		
		while (x < 3){
			//minor insertion
			sql = "INSERT INTO minor ";
			switch (x) {
				case 0:
					sql += "VALUES (1007, 'Applied Mathematics', 'MS')";
					break;
				case 1:
					sql += "VALUES (1005, 'Applied Mathematics', 'MS')";
					break;
				case 2:
					sql += "VALUES (1001, 'Software Engineering', 'BS')";
					break;
			}
			stmt.executeUpdate(sql);
			x++;
		}
	}
	
	@SuppressWarnings("null")
	public static void insert_courses() throws SQLException{
		Statement stmt = null;
		stmt = connect.createStatement();
		String sql = "";
		int x = 0;
		
		while (x < 7){
			//courses insertion
			sql = "INSERT INTO courses ";
			switch (x) {
				case 0:
					sql += "VALUES (113, 'Spreadsheet', 'Microsoft Excel and Access', 3, 'Undergraduate', 401)";
					break;
				case 1:
					sql += "VALUES (311, 'Algorithm', 'Design and Analysis', 3, 'Undergraduate', 401)";
					break;
				case 2:
					sql += "VALUES (531, 'Theory of Computation', 'Theorem and Probability', 3, 'Graduate', 401)";
					break;
				case 3:
					sql += "VALUES (363, 'Database', 'Design Principle', 3, 'Undergraduate', 401)";
					break;
				case 4:
					sql += "VALUES (412, 'Water Management', 'Water Management', 3, 'Undergraduate', 404)";
					break;
				case 5:
					sql += "VALUES (228, 'Special Topics', 'Interesting Topics about CE', 3, 'Undergraduate', 403)";
					break;
				case 6:
					sql += "VALUES (101, 'Calculus', 'Limit and Derivative', 4, 'Undergraduate', 402)";
					break;
			}
			stmt.executeUpdate(sql);
			x++;
		}
	}
	
	@SuppressWarnings("null")
	public static void insert_register() throws SQLException{
		Statement stmt = null;
		stmt = connect.createStatement();
		String sql = "";
		int x = 0;
		
		while (x < 7){
			//register insertion
			sql = "INSERT INTO register ";
			switch (x) {
				case 0:
					sql += "VALUES (1001, 363, 'Fall2020', 3)";
					break;
				case 1:
					sql += "VALUES (1002, 311, 'Fall2020', 4)";
					break;
				case 2:
					sql += "VALUES (1003, 228, 'Fall2020', 4)";
					break;
				case 3:
					sql += "VALUES (1004, 363, 'Spring2021', 3)";
					break;
				case 4:
					sql += "VALUES (1005, 531, 'Spring2021', 4)";
					break;
				case 5:
					sql += "VALUES (1006, 363, 'Fall2020', 3)";
					break;
				case 6:
					sql += "VALUES (1007, 531, 'Spring2021', 4)";
					break;
			}
			stmt.executeUpdate(sql);
			x++;
		}
	}
}
