package in.co.sunrays.proj4.bean;

/**
 *  Marksheet JavaBean encapsulates Marksheet attributes
 * 
 * @author Akanksha
 *
 */

public class MarksheetBean extends BaseBean {
	 /**
     * Rollno of Student
     **/
	private String rollNo ;
	
	private long studentId;
	/**
     * Name of Student
     **/
	private String name;
	 /**
     * Physics marks of Student
     **/
	private int physics;
	 /**
     * chemistry marks of Student
     **/
	private int chemistry;
	 /**
     * maths marks of Student
     **/
	private int maths;
	
	/**
     * accessor
     **/
	
	public long getStudentId() {
		return studentId;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public String getKey() {
		// TODO Auto-generated method stub
		return id + "";
	}
	public String getValue() {
		// TODO Auto-generated method stub
		return rollNo;
	}
	public int compareTo(BaseBean o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
