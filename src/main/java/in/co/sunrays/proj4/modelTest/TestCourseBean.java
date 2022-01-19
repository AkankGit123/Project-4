package in.co.sunrays.proj4.modelTest;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.sunrays.proj4.bean.CourseBean;
import in.co.sunrays.proj4.model.CourseModel;
/**
 * Test For Course Model
 * @author Akanksha
 *
 */
public class TestCourseBean {
	public static void main(String[] args) {
		testAdd();
		//testUpdate();
		//testDelete();
		//testSearch();
		//testList();
	}
	
	/**
	 * 
	 * Test List method Course Model
	 *
	 */
	private static void testList() {
		try {
			CourseBean bean = new CourseBean();
			CourseModel model = new CourseModel();
            List list = new ArrayList();
            list = model.list(1, 6);
            if (list.size() < 0) {
                System.out.println("Test List fail");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bean = (CourseBean) it.next();
                System.out.println(bean.getId());
                System.out.println(bean.getCourse_Name());
	            System.out.println(bean.getDescription());
                System.out.println(bean.getDuration());
                System.out.println(bean.getCreatedDatetime());
                System.out.println(bean.getModifiedBy());
                System.out.println(bean.getModifiedDatetime());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	/**
	 * 
	 * Test Search method Course Model
	 *
	 */
	private static void testSearch() {
		try {
			CourseBean bean = new CourseBean();
			CourseModel model = new CourseModel();
			 List list = new ArrayList();
            bean.setCourse_Name("BE_English");
            list = model.search(bean, 1, 10);
            if (list.size() < 0) {
                System.out.println("Test Search fail");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bean = (CourseBean) it.next();
                System.out.println(bean.getId());
	            System.out.println(bean.getCourse_Name());
	            System.out.println(bean.getDescription());
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
	 * Test Delete method Course Model
	 *
	 */
	private static void testDelete() {
		try {
			CourseBean bean = new CourseBean();
			CourseModel model = new CourseModel();
			bean.setId(2L);
			
			model.delete(bean);
			CourseBean bean1 = model.findByPk(2);
			System.out.println("Test Delete Success");
			if (bean1 != null) {
		        System.out.println("Test Delete fail");
		    }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * Test Update method Course Model
	 *
	 */
	private static void testUpdate() {
		  try {
			  CourseModel model = new CourseModel();
			  CourseBean bean= 	model.findByPk(1);
	            bean.setCourse_Name("BE_English");
	            bean.setDescription("BEdkfldksjfkl.....");
	            bean.setDuration("dfdfffd");
	             bean.setCreatedBy("Admin");
	             bean.setModifiedBy("Admin");
	             bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
	             bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
	             model.update(bean);

	            CourseBean bean1 = model.findByPk(1);
	            System.out.println("Test Update succ");
	            if (bean1 != null) {
	                System.out.println("Test Update fail");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } 
		
	}
	/**
	 * 
	 * Test Add method Course Model
	 *
	 */
	private static void testAdd() {
		try {
			CourseBean bean = new CourseBean();
			CourseModel model = new CourseModel();
			
			bean.setCourse_Name("B.Tech");
			bean.setDescription("Bachelor of Technology");
			bean.setDuration("3 Year");
			bean.setCreatedBy("Admin");
	         bean.setModifiedBy("Admin");
	         bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
	         bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
	         
	        long pk = model.add(bean);
	        
	        System.out.println("Test Add Success");
	        
	        CourseBean bean1 = model.findByPk(pk);
	         
	         if (bean1 == null) {
	             System.out.println("Test add fail");
	         }
	     } catch (Exception e) {
	         e.printStackTrace();
	     }
		}
		
	}

