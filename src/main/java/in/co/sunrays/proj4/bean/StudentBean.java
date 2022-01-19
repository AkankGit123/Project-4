package in.co.sunrays.proj4.bean;

import java.util.Date;
/**
 * 
 * Student JavaBean encapsulates Student attributes
 * @author Akanksha
 *
 */
public class StudentBean extends BaseBean {

	/**
	 * firstname of student
	 *
	 */
	private String firstName;


/**
 * lastname of student
 *
 */
	
	private String lastName;
	/**
	 * date of birth of student
	 *
	 */
	private Date dob;

/**
 * mobileno of student
 *
 */
	private String mobileNo;
	/**
	 * email of student
	 *
	 */
	private String email;
	private long collegeId;
	/**
	 * collegename of student
	 *
	 */
	private String collegeName;	


/**
 * accessor of student
 *
 */
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date date) {
		this.dob = date;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(long collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getKey() {
		// TODO Auto-generated method stub
		return id + "";
	}
	public String getValue() {
		// TODO Auto-generated method stub
		return firstName;
	}
	public int compareTo(BaseBean o) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
