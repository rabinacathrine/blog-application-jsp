package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;
import utility.ConnectionManager;

public class UserDAO implements UserDAOInterface{

	@Override
	public int signup(User user) throws ClassNotFoundException, IOException {
		String INSERT_USER_SQL = "INSERT INTO USERSBLOG(email, password)VALUES(?,?)";
		int result = 0;
		try {
			Connection con = ConnectionManager.getConnection();
			PreparedStatement ps  = con.prepareStatement(INSERT_USER_SQL);
			ps.setString(1, user.getEmail());
			ps.setNString(2, user.getPassword());
			System.out.println(ps);
			result = ps.executeUpdate();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public boolean loginUser(User user) throws ClassNotFoundException, IOException {
		boolean status = false;
		try {
			Connection con = ConnectionManager.getConnection();
			PreparedStatement ps  = con.prepareStatement("select * from USERSBLOG where email = ? and password = ?");
			ps.setString(1, user.getEmail());
			ps.setNString(2, user.getPassword());
			System.out.println(ps);
			ResultSet rs = ps.executeQuery();
			status = rs.next();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	

}
