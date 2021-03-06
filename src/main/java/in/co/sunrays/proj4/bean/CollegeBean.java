package in.co.sunrays.proj4.bean;


/**
 * College JavaBean encapsulates College attributes
 * 
 * @author Akanksha
 *
 */
public class CollegeBean extends BaseBean {
	 /**
     * name of college
     */ 	
	
	private String name;
	 /**
     * address of college
     */
		private String address;
		 /**
	     * state of college
	     */
		private String state;
		 /**
	     * city of college
	     */
		private String city;
		 /**
	     * Contact no of college
	     */
		private String phoneno;
		
		/**
	     * accessor
	     */
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		
		
		
		public String getPhoneno() {
			return phoneno;
		}
		public void setPhoneno(String phoneno) {
			this.phoneno = phoneno;
		}
		public String getKey() {
			return id + "";
		}
		public String getValue() {
			return name;
		}
		public int compareTo(BaseBean o) {
			return 0;
		}
		
		
		
		

	}



