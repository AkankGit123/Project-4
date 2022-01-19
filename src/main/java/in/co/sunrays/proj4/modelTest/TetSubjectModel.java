package in.co.sunrays.proj4.modelTest;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.sunrays.proj4.bean.MarksheetBean;
import in.co.sunrays.proj4.bean.SubjectBean;
import in.co.sunrays.proj4.model.MarksheetModel;
import in.co.sunrays.proj4.model.SubjectModel;

/**
 * 
 * Test SubjetModel
 * @author Akanksha
 *
 */
public class TetSubjectModel {
	public static void main(String[] args) {
		testAdd();
		//testUpdate();
		//testDelete();
		//testSearch();
		//testList();
	}

/**
 *
 *test List method
 *
 */
	private static void testList() {
		try {
			SubjectBean bean = new SubjectBean();
			SubjectModel model = new SubjectModel();
            List list = new ArrayList();
            list = model.list(1, 6);
            if (list.size() < 0) {
                System.out.println("Test List fail");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bean = (SubjectBean) it.next();
                System.out.println(bean.getId());
                System.out.println(bean.getSubject_Name());
	            System.out.println(bean.getCourse_Name());
	            System.out.println(bean.getCourse_Id());
                System.out.println(bean.getCreatedBy());
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
	 *test Search method
	 *
	 */
	private static void testSearch() {
		try {
			SubjectBean bean = new SubjectBean();
			SubjectModel model = new SubjectModel();
			 List list = new ArrayList();
            bean.setSubject_Name("Hindi");
            list = model.search(bean, 1, 10);
            if (list.size() < 0) {
                System.out.println("Test Search fail");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bean = (SubjectBean) it.next();
                System.out.println(bean.getId());
	            System.out.println(bean.getSubject_Name());
	            System.out.println(bean.getCourse_Name());
	            System.out.println(bean.getCourse_Id());
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
	 *test Delete method
	 *
	 */
	private static void testDelete() {
		try {
			SubjectBean bean = new SubjectBean();
			SubjectModel model = new SubjectModel();
			bean.setId(2L);
			
			model.delete(bean);
			SubjectBean bean1 = model.findByPK(2L);
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
	 *test Update method
	 *
	 */
	private static void testUpdate() {
		  try {
			  SubjectModel model = new SubjectModel();
				SubjectBean bean= 	model.findByPK(1);
	            bean.setSubject_Name("English");
	            //bean.setCourse_Id(2);
	            bean.setDescription("English.....");
	             bean.setCreatedBy("Admin");
	             bean.setModifiedBy("Admin");
	             bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
	             bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
	             model.update(bean);

	            SubjectBean bean1 = model.findByPK(1);
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
	 *test Add method
	 *
	 */
	private static void testAdd() {
		try {
			SubjectBean bean = new SubjectBean();
			SubjectModel model = new SubjectModel();
			
			bean.setSubject_Name("Chemistry");
			//bean.setCourse_Name("coming from course table");
			bean.setCourse_Id(3);
			bean.setDescription("ChemistryExpert");
	         bean.setCreatedBy("Admin");
	         bean.setModifiedBy("Admin");
	         bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
	         bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
	         
	        long pk = model.add(bean);
	        
	        System.out.println("Test Add Success");
	        
	        SubjectBean bean1 = model.findByPK(pk);
	         
	         if (bean1 == null) {
	             System.out.println("Test add fail");
	         }
	     } catch (Exception e) {
	         e.printStackTrace();
	     }
		}
		
	}
