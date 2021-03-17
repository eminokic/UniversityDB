import java.sql.SQLException;
import java.util.Scanner;

import models.*;

public class main {

	public static void main(String[] args) {
		
		CreateTables createTablesTest = new CreateTables();
		InsertRecords insertRecordsTest = new InsertRecords();
		Query queryTest = new Query();
		ModifyRecords modifyRecordsTest = new ModifyRecords();
		DropTables dropTablesTest = new DropTables();
		
		Scanner s = new Scanner(System.in);
		while (true) {
			
			System.out.println("What would you like to do?\n");
			System.out.println("1: Create Tables\n");
			System.out.println("2: Insert Records\n");
			System.out.println("3: Modify Records\n");
			System.out.println("4: Query\n");
			System.out.println("5: Drop Tables\n");
			System.out.println("6: Exit\n");
			
			int choice = s.nextInt();
			
			switch (choice){
			case 1:
				try {
					createTablesTest.setup();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				//insert records
				try {
					insertRecordsTest.setup();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:
				//modify records
				try {
					modifyRecordsTest.setup();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				//query
				try {
					queryTest.setup();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 5:
				//drop tables
				try {
					dropTablesTest.setup();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 6:
				//exit
				s.close();
				System.exit(0);
				break;
			}
		}
	}

}
