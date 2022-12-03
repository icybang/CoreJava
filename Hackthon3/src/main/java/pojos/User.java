package pojos;
/*
 * userId (PK) ,first name,last name , email,password,confirmPassword,role(enum), regAmount;
	 LocalDate/Date regDate;
	 byte[] image;
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//will be importing all annotations from this pkg
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity // mandatory cls level annotation meant for hibernate , to tell following is the
		// entity class , to be managed by hib frmwork
@Table(name = "users_tbl") // optional anno , meant to supply table name
public class User extends BaseEntity {

	@Column(name = "full_name", length = 50) // col name , varchar size : 20
	private String fullName;

	@Column(length = 30, unique = true) // unique constraint
	private String email;

	@Column(length = 20, nullable = false) // non null constraint
	private String password;

	@Column(length = 10, unique = true)
	private String phoneNo;

	@CreationTimestamp
	private LocalDate createdDate;

	@OneToMany(mappedBy = "user")
	private List<Blog> blogs = new ArrayList<>();

	// For hibernate : supply def ctor
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String fullName, String email, String password, String phoneNo) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.phoneNo = phoneNo;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

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

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public List<Blog> getBlogs() {
		return blogs;
	}

	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}

	@Override
	public String toString() {
		return "User [fullName=" + fullName + ", email=" + email + ", password=" + password + ", phoneNo=" + phoneNo
				+ ", createdDate=" + createdDate + "]";
	}

}
