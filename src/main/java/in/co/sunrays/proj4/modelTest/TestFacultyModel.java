package in.co.sunrays.proj4.modelTest;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.sunrays.proj4.bean.FacultyBean;
import in.co.sunrays.proj4.bean.MarksheetBean;
import in.co.sunrays.proj4.bean.UserBean;
import in.co.sunrays.proj4.exception.ApplicationException;
import in.co.sunrays.proj4.model.FacultyModel;
import in.co.sunrays.proj4.model.UserModel;

/**
 * 
 * Test FacultyModel
 * @author Akanksha
 *
 */
public class TestFacultyModel {
	
	public static void main(String[] args) throws Exception {
		//testAdd();
		testUpdate();
		//testDelete();
		//testSearch();
		//testList();
		//testFindbyPK();
		
	}
	/**
	 * test FindbyPK method
	 *
	 */
	private static void testFindbyPK() {
		 try {
			 FacultyModel model = new FacultyModel();	           
			 FacultyBean bean = new FacultyBean();
	            int pk = 1;
	            bean = model.findByPK(pk);
	            if (bean == null) {
	                System.out.println("Test Find By PK fail");
	            }
	            System.out.println(bean.getId());
	            System.out.println(bean.getFirst_Name());
	            System.out.println(bean.getLast_Name());
	          
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
	}
	/**
	 * test List method
	 *
	 */
	private static void testList() {
		 try {
			 FacultyModel model = new FacultyModel();	           
			 FacultyBean bean = new FacultyBean();
	            List list = new ArrayList();
	            list = model.list(1, 10);
	            if (list.size() < 0) {
	                System.out.println("Test list fail");
	            }
	            Iterator it = list.iterator();
	            while (it.hasNext()) {
	                bean = (FacultyBean) it.next();
	                System.out.println(bean.getId());
	                System.out.println(bean.getFirst_Name());
	                System.out.println(bean.getLast_Name());
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
	 * test Search method
	 *
	 */
	private static void testSearch() {

		 try {
			 FacultyModel model = new FacultyModel();
	           
			 FacultyBean bean = new FacultyBean();
	            List list = new ArrayList();
	            bean.setFirst_Name("Mittal");
	            list = model.search(bean, 0, 0);
	            if (list.size() < 0) {
	                System.out.println("Test Serach fail");
	            }
	            Iterator it = list.iterator();
	            while (it.hasNext()) {
	                bean = (FacultyBean) it.next();
	                System.out.println(bean.getId());
	                System.out.println(bean.getFirst_Name());
	                System.out.println(bean.getLast_Name());
	                System.out.println(bean.getGender());
	                System.out.println(bean.getDOJ());
	            }

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
			FacultyBean bean = new FacultyBean();
            FacultyModel model = new FacultyModel();
            long pk = 3L;
            bean.setId(pk);
            model.delete(bean);
            System.out.println("Test Delete succ" + bean.getId());
           
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	/**
	 * test update method
	 *
	 */
	private static void testUpdate() throws Exception {
		
		FacultyModel fm = new FacultyModel();
		FacultyBean fb = fm.findByPK(1);
		/*
		 * fb.setFirst_Name("Akanksha"); fb.setLast_Name("Rawal");
		 * fb.setGender("Female");
		 */
		fb.setCollege_id(4);
		fm.update(fb);

		FacultyBean bean1 = fm.findByPK(1);
		
		System.out.println("Update");
		
	}
	/**
	 * test Add method
	 *
	 */
	private static void testAdd() throws Exception  {
		FacultyBean fb = new FacultyBean();
		FacultyModel fm = new FacultyModel();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		fb.setFirst_Name("Rupal");
		fb.setLast_Name("Arora");
		fb.setGender("Female");
		fb.setCollege_id(1);
		fb.setCourse_id(2);
		fb.setSubject_id(3);
		
		fb.setDOJ(sdf.parse("12/12/2012"));
		
		fb.setQualification("MBA");
		fb.setMobile_No("989989");
		fb.setCreatedDatetime(new Timestamp(new Date().getTime()));
		fb.setModifiedDatetime(new Timestamp(new Date().getTime()));
		fm.add(fb);
	}
	
	

}
