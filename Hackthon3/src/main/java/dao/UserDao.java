package dao;

import java.sql.SQLException;

import pojos.User;

public interface UserDao {

	// method to authenticate user
	User authenticateUser(String email, String pwd) throws SQLException;

	// method to registeer user
	String registerUser(User u) throws SQLException;
}
