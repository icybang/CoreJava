package beans;

import java.sql.SQLException;

import dao.UserDaoImpl;
import pojos.User;

public class UserBean {

	// state
	// clnt's info (clnt's conversational state)
	private String fullName;
	private String phoneNo;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	private String email;
	private String password;
	// validated user details
	private User validatedUserDetails;
	private String message;
	// dao
	private UserDaoImpl userDao;

	// def ctor
	public UserBean() throws SQLException {
		// 1. create user dao instance
		userDao = new UserDaoImpl();
		System.out.println("user bean created!");
	}

	// setters n getters
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getValidatedUserDetails() {
		return validatedUserDetails;
	}

	public void setValidatedUserDetails(User validatedUserDetails) {
		this.validatedUserDetails = validatedUserDetails;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public UserDaoImpl getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDaoImpl userDao) {
		this.userDao = userDao;
	}

	// add B.L method for user authentication + authorization
	public String validateUser() throws SQLException {
		System.out.println("in validate user " + email + " " + password);// not null
		// invoke dao's method for auth
		validatedUserDetails = userDao.authenticateUser(email, password);
		if (validatedUserDetails == null) {
			// login failure
			message = "Invalid Login Pls retry!!!!!!!!!!!!!";
			return "login";

		}
		message = "Login Successful !";
		// => authentication success ---> role based authorization
		if (validatedUserDetails != null)
			return "blog";

		return "login";

	}

	public String registerUser() throws SQLException {
		System.out.println("In registerUser of UserBean");
		String next = null;
		// String fullName, String email, String password, String phoneNo
		next = userDao.registerUser(new User(fullName, email, password, phoneNo));

		return "blog";

	}
}
