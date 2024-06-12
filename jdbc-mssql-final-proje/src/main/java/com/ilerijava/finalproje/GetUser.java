package com.ilerijava.finalproje;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetUser {

	public void selectUsers() {
		String sorgu = "SELECT * FROM Users";
		try(Connection con = DatabaseConnection.getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sorgu)){
			while(rs.next()) {
				System.out.println(rs.getInt("id")+ "\t"+
									rs.getString("name") + "\t" + 
									rs.getInt("age"));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
