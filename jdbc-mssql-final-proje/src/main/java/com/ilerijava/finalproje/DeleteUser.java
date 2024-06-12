package com.ilerijava.finalproje;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteUser {

	public void deleteUser(String name) {
		String sorgu = "DELETE FROM Users WHERE name = ?";
		try(Connection con = DatabaseConnection.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sorgu)){
			pstmt.setString(1, name);
			pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
