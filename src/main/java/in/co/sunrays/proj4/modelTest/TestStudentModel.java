package in.co.sunrays.proj4.modelTest;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.sunrays.proj4.bean.CollegeBean;
import in.co.sunrays.proj4.bean.StudentBean;
import in.co.sunrays.proj4.exception.ApplicationException;
import in.co.sunrays.proj4.model.CollegeModel;
import in.co.sunrays.proj4.model.StudentModel;

/**
 * Test StudenetModel
 * @author Akanksha
 *
 */
public class TestStudentModel {
	
	public static void main(String[] args) throws Exception {
	//testAdd();
		//testUpdate();
		//testDelete();
	//testFindByPK();
		//testFindByEmailId();
		//testSearch();
		//testList();
	}

/**
 * test list method
 *
 */
	private static void testList() throws Exception {
		 try {
			 StudentModel model = new StudentModel();
	            StudentBean bean = new StudentBean();
	            List list = new ArrayList();
	            list = model.list(1, 10);
	            if (list.size() < 0) {
	                System.out.println("Test list fail");
	            }
	            Iterator it = list.iterator();
	            while (it.hasNext()) {
	                bean = (StudentBean) it.next();
	                System.out.println(bean.getId());
	                System.out.println(bean.getFirstName());
	                System.out.println(bean.getLastName());
	                System.out.println(bean.getDob());
	                System.out.println(bean.getMobileNo());
	                System.out.println(bean.getEmail());
	                System.out.println(bean.getCollegeId());
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
 * test Search method
 *
 */
	private static void testSearch() throws Exception {
		try {
			 StudentModel model = new StudentModel();
            StudentBean bean = new StudentBean();
            List list = new ArrayList();
            bean.setFirstName("ram");
            list = model.search(bean, 0, 0);
            if (list.size() < 0) {
                System.out.println("Test Serach fail");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bean = (StudentBean) it.next();
                System.out.println(bean.getId());
                System.out.println(bean.getFirstName());
                System.out.println(bean.getLastName());
                System.out.println(bean.getDob());
                System.out.println(bean.getMobileNo());
                System.out.println(bean.getEmail());
                System.out.println(bean.getCollegeId());
            }

        } catch (ApplicationException e) {
            e.printStackTrace();
        }
	}
	/**
	 * test FindByEmailId method
	 *
	 */
private static void testFindByEmailId() {

		try {
            StudentBean bean = new StudentBean();
            StudentModel model = new StudentModel();
            bean = model.findByEmailId("harshrrha@fgfgf.com");
            if (bean != null) {
                System.out.println("Test Find By EmailId fail");
            }
            System.out.println(bean.getId());
            System.out.println(bean.getCollegeId());
            System.out.println(bean.getCollegeName());
            System.out.println(bean.getFirstName());
            System.out.println(bean.getLastName());
            System.out.println(bean.getDob());
            System.out.println(bean.getMobileNo());
            System.out.println(bean.getEmail());
            System.out.println(bean.getCreatedBy());
            System.out.println(bean.getModifiedBy());
            System.out.println(bean.getCreatedDatetime());
            System.out.println(bean.getModifiedDatetime());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}
/**
 * test FindByPK method
 *
 */
	private static void testFindByPK() {

		 try {
	            StudentBean bean = new StudentBean();
	            StudentModel model = new StudentModel();
	            long pk = 1L;
	            bean = model.findByPK(pk);
	            if (bean == null) {
	                System.out.println("Test Find By PK fail");
	            }
	            System.out.println(bean.getId());
	            System.out.println(bean.getFirstName());
	            System.out.println(bean.getLastName());
	            System.out.println(bean.getDob());
	            System.out.println(bean.getMobileNo());
	            System.out.println(bean.getEmail());
	            System.out.println(bean.getCollegeId());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
	/**
	 * test Delete method
	 *
	 */
	private static void testDelete() {
		
		 try {
	            
	            StudentModel model = new StudentModel();
	            StudentBean bean = new StudentBean();
	            long pk = 6L;
	            bean.setId(pk);
	            model.delete(bean);
	            StudentBean deletedbean = model.findByPK(pk);
	            System.out.println("Tst Delete Successs");
	            if (deletedbean != null) {
	                System.out.println("Test Delete fail");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
	}
	/**
	 * test Update method
	 *
	 */
	private static void testUpdate() {
		
		 try {
			 	StudentModel model = new StudentModel();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	            StudentBean bean = model.findByPK(5L);
	            
	            bean.setCollegeId(3L);
	        	
	        	bean.setFirstName("NandiniK");
	            bean.setLastName("Nandan");
	            bean.setDob(sdf.parse("06/1/1994"));
	            bean.setMobileNo("225656");
	            bean.setEmail("Nandand@fgfgf.com");
	            bean.setCreatedBy("NandiniK@32");
	            bean.setModifiedBy("NandiniK@32");
	            bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
	            bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
	            model.update(bean);

	            StudentBean updatedbean = model.findByPK(5L);
	            if (!"rr".equals(updatedbean.getFirstName())) {
	                System.out.println("Test Update success");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	   
	}
	
	/**
	 * test Add method
	 *
	 */

	private static void testAdd()  {

try {
	StudentBean bean = new StudentBean();
	StudentModel model = new StudentModel();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	//bean.setId(3);
	bean.setCollegeId(3L);
	//bean.setCollegeName("took from college table");
	bean.setFirstName("Sanjay");
    bean.setLastName("Bhansali");
    bean.setDob(sdf.parse("06/11/1990"));
    bean.setMobileNo("515656");
    bean.setEmail("Sanjay@fgfgf.com");
    bean.setCreatedBy("Sanjay");
    bean.setModifiedBy("Sanjay");
    bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
    bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
    long pk = model.add(bean);
    StudentBean addedbean = model.findByPK(pk);
    if (addedbean == null) {
        System.out.println("Test add fail");
    }
}catch(Exception e) {
	e.printStackTrace();
}
		
	}

}
