package com.ilerijava.finalproje;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateUser {

	public void updateUser(int id, String name, int age) {
		String sorgu = "UPDATE Users SET name = ? ,age = ? WHERE id = ?";
		
		try(Connection con= DatabaseConnection.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sorgu)){
			pstmt.setString(1,name);
			pstmt.setInt(2,age);
			pstmt.setInt(3, id);
			pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
				
	}
}
