package com.ilerijava.finalproje;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateUser {

	public void insertUser(String name, int age) {
		String sorgu = "INSERT INTO  Users(name,age) VALUES (? , ?)";
		
		try(Connection con = DatabaseConnection.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sorgu)){
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
