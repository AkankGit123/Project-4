package in.co.sunrays.proj4.modelTest;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.sunrays.proj4.bean.UserBean;
import in.co.sunrays.proj4.model.UserModel;


/**
 * Test UserModel 
 * @author Akanksha
 *
 */
public class UserModelTest {
	
	public static void main(String[] args) throws Exception {
		testAdd();
		//testDelete();
		// testUpdate();
		//testFindByPK(); 
		//testFindByLogin() ;
		//testGetRoles();
		//testSearch();
		//testList();
		//testAuthenticate();
		//testRegisterUser(); 
		//testchangePassword();
		//testforgetPassword();  nhi chal rah h
	}
	/**
	 *
	 *test forgetPassword method
	 *
	 */
	private static void testforgetPassword() {
		UserModel model = new UserModel();
	    try {
	            boolean b = model.forgetPassword("Deepanshu@gmail.com");

	            System.out.println("Suucess : Test Forget Password Success");

	        } catch (Exception e) {
	            e.printStackTrace();
	        } 
		
	}
	/**
	 *
	 *test changePassword method
	 *
	 */
	private static void testchangePassword() throws Exception {
			UserModel model = new UserModel();
		    	    
            UserBean bean = model.findByLogin("SheenU@gmail.com");
            String oldPassword = bean.getPassword();
            bean.setId(1l);
            bean.setPassword("Sh123@34");
            bean.setConfirmPassword("Sh123@34");
            String newPassword = bean.getPassword();
            try {
                model.changePassword(1l, oldPassword, newPassword);
                System.out.println("password has been change successfully");
            } catch (Exception e) {
                e.printStackTrace();
            }

	}
	/**
	 *
	 *test RegisterUser method
	 *
	 */
	private static void testRegisterUser() {
		try {
			 UserModel model = new UserModel();
		        
            UserBean bean = new UserBean();
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

            // bean.setId(8L);
            bean.setFirstName("DeppakB");
            bean.setLastName("S");
            bean.setLogin("DeepakB@gmail.com");
            bean.setPassword("Deepak12@123");
            bean.setDob(sdf.parse("12/1/1993"));
            bean.setMobileNo("7767119898");
            bean.setRoleId(2L);
            bean.setUnSuccessfulLogin(3);
            bean.setGender("male");
            bean.setLastLogin(new Timestamp(new Date().getTime()));
            bean.setLock("Yes");
            bean.setRegisteredIP("as@3");
            bean.setLastLoginIP("LaatLog123");
            bean.setCreatedBy("Admin");
            bean.setModifiedBy("Admin");
            bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
            bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
            long pk = model.registerUser(bean);
            System.out.println("Successfully register");
            System.out.println(bean.getFirstName());
            System.out.println(bean.getLogin());
            System.out.println(bean.getLastName());
            System.out.println(bean.getDob());
            UserBean registerbean = model.findByPK(pk);
            if (registerbean != null) {
                System.out.println("Test registation fail");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
	}
	/**
	 *
	 *test Authenticate method
	 *
	 */
	private static void testAuthenticate() {
		 try {
			 UserModel model = new UserModel();
	            UserBean bean = new UserBean();
	            bean.setLogin("Sonu@gmail.com");
	            bean.setPassword("pass1234");
	            bean = model.authenticate(bean.getLogin(), bean.getPassword());
	            if (bean != null) {
	                System.out.println("Successfully login");

	            } else {
	                System.out.println("Invalied login Id & password");
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
	/**
	 *
	 *test List method
	 *
	 */
	private static void testList() {

		  try {
			  UserModel model = new UserModel();
		         
	            UserBean bean = new UserBean();
	            List list = new ArrayList();
	            list = model.list(1, 10);
	            if (list.size() < 0) {
	                System.out.println("Test list fail");
	            }
	            Iterator it = list.iterator();
	            while (it.hasNext()) {
	                bean = (UserBean) it.next();
	                System.out.println(bean.getId());
	                System.out.println(bean.getFirstName());
	                System.out.println(bean.getLastName());
	                System.out.println(bean.getLogin());
	                System.out.println(bean.getPassword());
	                System.out.println(bean.getDob());
	                System.out.println(bean.getRoleId());
	                System.out.println(bean.getUnSuccessfulLogin());
	                System.out.println(bean.getGender());
	                System.out.println(bean.getLastLogin());
	                System.out.println(bean.getLock());
	                System.out.println(bean.getMobileNo());
	                System.out.println(bean.getCreatedBy());
	                System.out.println(bean.getModifiedBy());
	                System.out.println(bean.getCreatedDatetime());
	                System.out.println(bean.getModifiedDatetime());
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
	}
	/**
	 *
	 *test Search method
	 *
	 */
	private static void testSearch() {
		 try {
			 UserModel model = new UserModel();
	           
	            UserBean bean = new UserBean();
	            List list = new ArrayList();
	            bean.setFirstName("SheenU");
	            list = model.search(bean, 0, 0);
	            if (list.size() < 0) {
	                System.out.println("Test Serach fail");
	            }
	            Iterator it = list.iterator();
	            while (it.hasNext()) {
	                bean = (UserBean) it.next();
	                System.out.println(bean.getId());
	                System.out.println(bean.getFirstName());
	                System.out.println(bean.getLastName());
	                System.out.println(bean.getLogin());
	                System.out.println(bean.getPassword());
	                System.out.println(bean.getDob());
	                System.out.println(bean.getRoleId());
	                System.out.println(bean.getUnSuccessfulLogin());
	                System.out.println(bean.getGender());
	                System.out.println(bean.getLastLogin());
	                System.out.println(bean.getLock());
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
	/**
	 *
	 *test GetRoles method
	 *
	 */
	private static void testGetRoles() {

		   try {
			   UserModel model = new UserModel();
	            UserBean bean = new UserBean();
	            List list = new ArrayList();
	            bean.setRoleId(1L);
	            list = model.getRoles(bean);
	            
	            if (list.size() < 0) {
	                System.out.println("Test Get Roles fail");
	            }
	           
	            Iterator it = list.iterator();
	           
	            while (it.hasNext()) {
	                bean = (UserBean) it.next();
	                System.out.println(bean.getId());
	                System.out.println(bean.getFirstName());
	                System.out.println(bean.getLastName());
	                System.out.println(bean.getLogin());
	                System.out.println(bean.getPassword());
	                System.out.println(bean.getDob());
	                System.out.println(bean.getRoleId());
	                System.out.println(bean.getUnSuccessfulLogin());
	                System.out.println(bean.getGender());
	                System.out.println(bean.getLastLogin());
	                System.out.println(bean.getLock());
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
	}
	/**
	 *
	 *test FindByLogin method
	 *
	 */
	private static void testFindByLogin() {

		try {
			UserModel model = new UserModel();
            UserBean bean = new UserBean();
            bean = model.findByLogin("Sonu@gmail.com");
            if (bean == null) {
                System.out.println("Test Find By PK fail");
            }
            System.out.println(bean.getId());
            System.out.println(bean.getFirstName());
            System.out.println(bean.getLastName());
            System.out.println(bean.getLogin());
            System.out.println(bean.getPassword());
            System.out.println(bean.getDob());
            System.out.println(bean.getRoleId());
            System.out.println(bean.getUnSuccessfulLogin());
            System.out.println(bean.getGender());
            System.out.println(bean.getLastLogin());
            System.out.println(bean.getLock());
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}
	/**
	 *
	 *test FindByPK method
	 *
	 */
	private static void testFindByPK() {

		 try {
			 	UserModel model = new UserModel();
	            UserBean bean = new UserBean();
	            long pk = 1L;
	            bean = model.findByPK(pk);
	            if (bean == null) {
	                System.out.println("Test Find By PK fail");
	            }
	            System.out.println(bean.getId());
	            System.out.println(bean.getFirstName());
	            System.out.println(bean.getLastName());
	            System.out.println(bean.getLogin());
	            System.out.println(bean.getPassword());
	            System.out.println(bean.getDob());
	            System.out.println(bean.getRoleId());
	            System.out.println(bean.getUnSuccessfulLogin());
	            System.out.println(bean.getGender());
	            System.out.println(bean.getLastLogin());
	            System.out.println(bean.getLock());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
	}
	/**
	 *
	 *test update method
	 *
	 */
	private static void testUpdate() {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("MM-DD-yyy");
			UserModel model = new UserModel();
            UserBean bean = model.findByPK(1L);
            
            bean.setFirstName("SheenU");
            bean.setLastName("Vyas");
            bean.setLogin("SheenU@gmail.com");
            bean.setPassword("pass8888");
            bean.setDob(sdf.parse("31-1-1992"));
            bean.setMobileNo("7768789999");
            bean.setRoleId(5L);
            bean.setUnSuccessfulLogin(2);
            bean.setGender("Female");
            bean.setLastLogin(new Timestamp(new Date().getTime()));
            bean.setLock("Yes");
            bean.setRegisteredIP("33A");
            bean.setLastLoginIP("LastSd");
            bean.setCreatedBy("Admin");
            bean.setModifiedBy("Admin");
            bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
            bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

            model.update(bean);

            UserBean updatedbean = model.findByPK(1L);
            if (!"sdfdsfd".equals(updatedbean.getLogin())) {
                System.out.println("Test Update Success");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}
	/**
	 *
	 *test Delete method
	 *
	 */
	private static void testDelete() {
		try {
            UserBean bean = new UserBean();
            UserModel model = new UserModel();
            long pk = 3L;
            bean.setId(pk);
            model.delete(bean);
            System.out.println("Test Delete succ" + bean.getId());
            UserBean deletedbean = model.findByPK(pk);
            if (deletedbean != null) {
                System.out.println("Test Delete fail");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	/**
	 *
	 *test Add method
	 *
	 */
	private static void testAdd() {
		 try {
	            UserBean bean = new UserBean();
	            UserModel model = new UserModel();
	            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

	            // bean.setId(5234L);
	            bean.setFirstName("dr");
	            bean.setLastName("Rathor");
	            bean.setLogin("Dokagk@gmail.com");
	            bean.setPassword("pass1234");
	            bean.setDob(sdf.parse("31-1-1992"));
	            bean.setMobileNo("7767689898");
	            bean.setRoleId(2L);
	            bean.setUnSuccessfulLogin(3);
	            bean.setGender("male");
	            bean.setLastLogin(new Timestamp(new Date().getTime()));
	            bean.setLock("Yes");
	            bean.setRegisteredIP("365d");
	            bean.setLastLoginIP("LastLoginIp03");
	            bean.setCreatedBy("Admin");
	            bean.setModifiedBy("Admin");
	            bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
	            bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
	            
	            long pk = model.add(bean);
	            UserBean addedbean = model.findByPK(pk);
	            System.out.println("Test add succ");
	            if (addedbean == null) {
	                System.out.println("Test add fail");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
	}

}
