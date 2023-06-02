package com.jdbcdemo.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowAllMain {

	public static void main(String[] args) {
		try {
			//1) Load the database Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2) Get Connection with the database
			Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/cdac_adv_23?useSSL=false", 
			"root", "Singhjay@355");
			
			//3) Create Statement to execute query
			Statement st = con.createStatement();
			
			//4) Execute the query
			//5) Store result of the query into ResultSet
			ResultSet rs = st.executeQuery("SELECT * FROM product");
			
			//6) Process data from the ResultSet
			if(rs.isBeforeFirst()) {
				while(rs.next()) {
					System.out.println(rs.getInt(1) + " : " + 
					rs.getString("pname") + " : " + rs.getInt(3));
				}
			}
			else {
				System.out.println("no poducts found");
			}
			
			//7) Close the database Connection.
			con.close();
		}
		catch(ClassNotFoundException | SQLException exc) {
			exc.printStackTrace();
		}
	}
}



