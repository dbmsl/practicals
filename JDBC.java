/*
*1. import --->java.sql
*2. load and register the driver ---> com.jdbc.
*3. create connection
*4. create a statement
*5. execute the query
*6. process the results
*7. close
*/

import java.io.*;
import java.sql.*;

class GFG {
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/table_name"; // table details
		String username = "localhost";
		String password = "gfg123";
		String query = "select *from students"; 

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Established successfully");

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query); // Execute query
		rs.next();
		String name = rs.getString("name"); // Retrieve name from db

		System.out.println(name);

		st.close();
		con.close();
		System.out.println("Connection Closed....");
	}
}
