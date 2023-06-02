package com.jdbcdemo.main;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class CallStoredProcMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id of product : ");
		int pid = sc.nextInt();
		
		try {
			//1) Load the database Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2) Get Connection with the database
			Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/cdac_adv_23?useSSL=false", 
			"root", "Singhjay@355");
			
			//3) Create CallableStatement to call stored procedure
			CallableStatement cs = con.prepareCall(
					"{call myproc(?,?)}");
			
			cs.setInt(1, pid);
			cs.registerOutParameter(2, Types.CHAR);
			
			//4) call the stored procedure
			cs.execute();
			
			//6) Process result from the stored procedure
			String nm = cs.getString(2);
			if(nm != null)
				System.out.println("name of product with given id : " + nm);
			else
				System.out.println("no such product found");
			
			//7) Close the database Connection.
			con.close();
		}
		catch(ClassNotFoundException | SQLException exc) {
			exc.printStackTrace();
		}
	}
}