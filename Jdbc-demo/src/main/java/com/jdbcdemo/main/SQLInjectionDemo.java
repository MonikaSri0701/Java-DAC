package com.jdbcdemo.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SQLInjectionDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter name of product : ");
		String nm = sc.nextLine();
		
		System.out.print("enter id of product : ");
		int pid = sc.nextInt();
		
		try {
			//1) Load the database Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2) Get Connection with the database
			Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/cdac_adv_23?useSSL=false", 
			"root", "Singhjay@355");
			
			//3) Create Statement to execute query
			PreparedStatement st = con.prepareStatement(
			"SELECT * FROM product WHERE pname = ? AND pid = ?");
			st.setString(1, nm);
			st.setInt(2, pid);
			
			//4) Execute the query
			//5) Store result of the query into ResultSet
			ResultSet rs = st.executeQuery();
			
			//6) Process data from the ResultSet
			if(rs.isBeforeFirst()) {
				while(rs.next()) {
					System.out.println(rs.getInt(1) + " : " + 
					rs.getString("pname") + " : " + rs.getInt(3));
				}
			}
			else {
				System.out.println("no products found");
			}
			
			//7) Close the database Connection.
			con.close();
		}
		catch(ClassNotFoundException | SQLException exc) {
			exc.printStackTrace();
		}
	}
}






//PreparedStatement st = con.prepareStatement(
//"SELECT * FROM product WHERE "
//+ " name = ? AND id = ?");
//st.setString(1, nm);
//st.setInt(2, pid);
//ResultSet rs = st.executeQuery();



//Statement st = con.createStatement();
//ResultSet rs = st.executeQuery("SELECT * FROM product WHERE "
//+ " name = '" + nm + "'" + " AND id = " + pid);