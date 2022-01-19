package in.co.sunrays.proj4.modelTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.sunrays.proj4.bean.CollegeBean;
import in.co.sunrays.proj4.exception.ApplicationException;
import in.co.sunrays.proj4.exception.DuplicateRecordException;
import in.co.sunrays.proj4.model.CollegeModel;
import in.co.sunrays.proj4.util.JDBCDataSource;

/**
 * Test For College Model
 * @author Akanksha
 *
 */
public class CollegeModelTest {
	
	public static void main(String[] args) throws Exception {
		//testAdd();
		//testUpdate();
		//testDelete();
		//testfindByName();
		//testfindByPK();
		testSearch();
		//testList();
	}

	/**
	 * test Search method
	 * 
	 *
	 */

	public static void testSearch() throws Exception{
        try {
            CollegeBean bean = new CollegeBean();
            CollegeModel model = new CollegeModel();
            List list = new ArrayList();
          bean.setName("Lnct");
           
            list = model.search(bean, 1, 10);
            if (list.size() < 0) {
                System.out.println("Test Search fail");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bean = (CollegeBean) it.next();
                System.out.println(bean.getId());
                System.out.println(bean.getName());
                System.out.println(bean.getAddress());
                System.out.println(bean.getState());
                System.out.println(bean.getCity());
                System.out.println(bean.getPhoneno());
                System.out.println(bean.getCreatedBy());
                System.out.println(bean.getCreatedDatetime());
                System.out.println(bean.getModifiedBy());
                System.out.println(bean.getModifiedDatetime());
            }
        } catch (ApplicationException e) {
            e.printStackTrace();
        }
    }

	/**
	 * test List method
	 * 
	 *
	 */
	private static void testList() throws Exception {
		
		CollegeBean bean = new CollegeBean();
		CollegeModel model = new CollegeModel();
		
		List list = new ArrayList();
		
		list = model.list(1,10);
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			bean = (CollegeBean) it.next();
			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getAddress());
			System.out.println(bean.getState());
			System.out.println(bean.getCity());
			System.out.println(bean.getPhoneno());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());
		}
		
	}
	
	/**
	 * test findByPK method
	 * 
	 *
	 */
	private static void testfindByPK() throws Exception {
		CollegeBean bean = new CollegeBean();
		CollegeModel model = new CollegeModel();

		bean = model.findbypk(3);
		
		System.out.println(bean.getId());
		System.out.println(bean.getName());
		System.out.println(bean.getAddress());
		System.out.println(bean.getState());
		System.out.println(bean.getCity());
		System.out.println(bean.getPhoneno());
		System.out.println(bean.getCreatedBy());
		System.out.println(bean.getModifiedBy());
		System.out.println(bean.getCreatedDatetime());
		System.out.println(bean.getModifiedDatetime());
	}

	/**
	 * test findByName method
	 * 
	 *
	 */
	private static void testfindByName() throws Exception {
		CollegeBean bean = new CollegeBean();
		CollegeModel model = new CollegeModel();
		bean = model.findbyname("Akanksha");
		if(bean == null) {
			System.out.println("Test Find By Name Fail");
		}
		System.out.println(bean.getId());
		System.out.println(bean.getName());
		System.out.println(bean.getAddress());
		System.out.println(bean.getState());
		System.out.println(bean.getCity());
		System.out.println(bean.getPhoneno());
		System.out.println(bean.getCreatedBy());
		System.out.println(bean.getModifiedBy());
		System.out.println(bean.getCreatedDatetime());
		System.out.println(bean.getModifiedDatetime());
	}

	/**
	 * test Delete method
	 * 
	 *
	 */
	private static void testDelete() throws Exception {
	
		CollegeModel model = new CollegeModel();
		CollegeBean bean = model.findbypk(5);
   		
   		model.delete(bean);
   		System.out.println("Test Delete Success");
   		
	}
	/**
	 * test Update method
	 * 
	 *
	 */
	private static void testUpdate() throws Exception {
		
    	
   		CollegeModel model = new CollegeModel();
   		CollegeBean bean = model.findbypk(4);
   		bean.setName("JIT_Boranwa");
   		bean.setAddress("Boranwa, Khargon");
   		bean.setState("MP");
   		bean.setCity("Boranwa");
   		bean.setPhoneno("69696969");
   		bean.setCreatedBy("Akanksha");
   		bean.setModifiedBy("Akanksha");
   		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
   		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
   		
   		model.update(bean);
   		System.out.println("Test Update Success");     
		
	}
	/**
	 * test Add method
	 * 
	 *
	 */
	private static void testAdd() throws Exception {
		CollegeBean bean = new CollegeBean();
		CollegeModel model = new CollegeModel();
		bean.setName("BORANWA");
		bean.setAddress("Ujjain ABC");
		bean.setState("MP");
		bean.setCity("Ujjain");
		bean.setPhoneno("98987891");
		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
		
		long pk = model.add(bean);
		
		System.out.println("Test Add Success");
		
		CollegeBean bean1 = model.findbypk(pk);
		
		if(bean1 == null) {
			System.out.println("Test Add Fail");
		}
	}
	/**
	 * test findByName method
	 * 
	 *
	 */
	public static CollegeBean findByName(String name) throws Exception {
    	Class.forName("com.mysql.jdbc.Driver");
        StringBuffer sql = new StringBuffer(
                "SELECT * FROM ST_COLLEGE WHERE NAME=?");
        CollegeBean bean = null;
        Connection conn = null;
        try {
            conn = JDBCDataSource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, name);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                bean = new CollegeBean();
                bean.setId(rs.getLong(1));
                bean.setName(rs.getString(2));
                bean.setAddress(rs.getString(3));
                bean.setState(rs.getString(4));
                bean.setCity(rs.getString(5));
                bean.setPhoneno(rs.getString(6));
                bean.setCreatedBy(rs.getString(7));
                bean.setModifiedBy(rs.getString(8));
                bean.setCreatedDatetime(rs.getTimestamp(9));
                bean.setModifiedDatetime(rs.getTimestamp(10));

            }
            rs.close();
        } catch (Exception e) {
        	e.printStackTrace();
            throw new ApplicationException(
                    "Exception : Exception in getting College by Name");
        } finally {
            JDBCDataSource.closeConnection(conn);
        }
       
        return bean;
    }
	
	

}
