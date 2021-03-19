package com.database.java;

import java.sql.*;



/* Java Database Connectivity Steps
 * 1. IMPORT PACKAGE	--> java.sql.*
 * 2. LOAD AND REGISTER DRIVER	--> com.mysql.jdbc.driver
 * 3. CREATE CONNECTION OBJECT	--> connection
 * 4. CREATE A SATEMENT	--> statement
 * 5. EXECUTE STATEMENT/QUERY
 * 6. PROCESS THE RESULTS
 * 7. CLOSE STATEMENT AND CONNECTION
 */

public class Demo {
	
	public static void main(String args[]) throws Exception{
		
		String url = "jdbc:sqlserver://localhost:1433;databaseName=Sample";
		String uname = "sa";
		String pass = "123456";
		String query = "Select * from demo";
		
		//Class.forName("com.mysql.jdbc.Driver"); Deprecated from version 8
		//Driver class is loaded automatically above version 8
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		
		
		while(rs.next()) {
			System.out.print(rs.getInt(1) + " ");
			System.out.println(rs.getString("Name"));
		}
		
		
	}

}
