package in.co.sunrays.proj4.modelTest;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.sunrays.proj4.bean.MarksheetBean;
import in.co.sunrays.proj4.exception.DuplicateRecordException;
import in.co.sunrays.proj4.model.MarksheetModel;

/**
 * Test MarkshhetModel
 * @author Akanksha
 *
 */
public class TestMarksheetModel {
	
	public static void main(String[] args) throws Exception {
		
	//testAdd();
		//testDelete();
	testUpdate();
		//testFindByRollNo();
		//testFindByPK();
		//testSearch();
		//testMeritList();
		//testList();
	}
	/**
	 * Test List method
	 *
	 */
	private static void testList() {
		try {
            MarksheetBean bean = new MarksheetBean();
            MarksheetModel model = new MarksheetModel();
            List list = new ArrayList();
            list = model.list(1, 6);
            if (list.size() < 0) {
                System.out.println("Test List fail");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bean = (MarksheetBean) it.next();
                System.out.println(bean.getId());
                System.out.println(bean.getRollNo());
                System.out.println(bean.getName());
                System.out.println(bean.getPhysics());
                System.out.println(bean.getChemistry());
                System.out.println(bean.getMaths());
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
	 * Test MeritList method
	 *
	 */
	private static void testMeritList() {
		try {
            MarksheetBean bean = new MarksheetBean();
            MarksheetModel model = new MarksheetModel();
            List list = new ArrayList();
            list = model.getMeritList(1, 5);
            if (list.size() < 0) {
                System.out.println("Test List fail");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bean = (MarksheetBean) it.next();
                System.out.println(bean.getId());
	            
	            System.out.println(bean.getStudentId());
	            System.out.println(bean.getName());
	            System.out.println(bean.getPhysics());
	            System.out.println(bean.getChemistry());
	            System.out.println(bean.getMaths());
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
	 * Test Search method
	 *
	 */
	private static void testSearch() {
		try {
            MarksheetBean bean = new MarksheetBean();
            MarksheetModel model = new MarksheetModel();
            List list = new ArrayList();
            bean.setName("Ram");
            list = model.search(bean, 1, 10);
            if (list.size() < 0) {
                System.out.println("Test Search fail");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bean = (MarksheetBean) it.next();
                System.out.println(bean.getId());
	            
	            System.out.println(bean.getStudentId());
	            System.out.println(bean.getName());
	            System.out.println(bean.getPhysics());
	            System.out.println(bean.getChemistry());
	            System.out.println(bean.getMaths());
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
	 * Test FindByPK method
	 *
	 */
	private static void testFindByPK() {
		 try {
	            MarksheetBean bean = new MarksheetBean();
	            MarksheetModel model = new MarksheetModel();
	            long pk = 3L;
	            bean = model.findByPK(pk);
	            if (bean == null) {
	                System.out.println("Test Find By PK fail");
	            }
	            System.out.println(bean.getId());
	           
	            System.out.println(bean.getStudentId());
	            System.out.println(bean.getName());
	            System.out.println(bean.getPhysics());
	            System.out.println(bean.getChemistry());
	            System.out.println(bean.getMaths());
	            System.out.println(bean.getCreatedBy());
	            System.out.println(bean.getModifiedBy());
	            System.out.println(bean.getCreatedDatetime());
	            System.out.println(bean.getModifiedDatetime());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
	}
	/**
	 * Test FindByRollNo method
	 *
	 */
	private static void testFindByRollNo() {
		
		  try {
	           
	            MarksheetModel model = new MarksheetModel();
	            MarksheetBean bean = model.findByRollNo("33");
	            if (bean == null) {
	                System.out.println("Test Find By RollNo fail");
	            }
	            System.out.println(bean.getId());
	            
	            System.out.println(bean.getStudentId());
	            System.out.println(bean.getName());
	            System.out.println(bean.getPhysics());
	            System.out.println(bean.getChemistry());
	            System.out.println(bean.getMaths());
	            System.out.println(bean.getCreatedBy());
	            System.out.println(bean.getModifiedBy());
	            System.out.println(bean.getCreatedDatetime());
	            System.out.println(bean.getModifiedDatetime());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
	/**
	 * Test Update method
	 *
	 */
	private static void testUpdate() {
		  try {
			  
				MarksheetModel model = new MarksheetModel();
	            MarksheetBean bean = model.findByPK(10l);
	           bean.setRollNo("551");
	    		//bean.setStudentId(7L);
	    		//bean.setName("Nandini");
	    		// bean.setPhysics(98);
	           //  bean.setChemistry(97);
	            // bean.setMaths(90);
	            // bean.setCreatedBy("Admin");
	            // bean.setModifiedBy("Admin");
	            // bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
	           //  bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
	            model.update(bean);

	            MarksheetBean bean1 = model.findByPK(10L);
	            System.out.println("Test Update succ");
	            if (bean1 != null) {
	                System.out.println("Test Update fail");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } 
	}
	/**
	 * Test Delete method
	 *
	 */
	private static void testDelete() {
try {
	MarksheetBean bean = new MarksheetBean();
	MarksheetModel model = new MarksheetModel();
	bean.setId(2L);
	
	model.delete(bean);
	MarksheetBean bean1 = model.findByPK(2L);
	System.out.println("Test Delete Success");
	if (bean1 != null) {
        System.out.println("Test Delete fail");
    }
}catch(Exception e) {
	
}

		
	}
	/**
	 * Test Add method
	 *
	 */
	private static void testAdd() throws Exception {
		try {
		MarksheetBean bean = new MarksheetBean();
		MarksheetModel model = new MarksheetModel();
		
		bean.setRollNo("331");
		bean.setStudentId(5L);
		
		 bean.setPhysics(23);
         bean.setChemistry(45);
         bean.setMaths(44);
         bean.setCreatedBy("Admin");
         bean.setModifiedBy("Admin");
         bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
         bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
         
        long pk = model.add(bean);
        
        System.out.println("Test Add Success");
        
         MarksheetBean bean1 = model.findByPK(pk);
         
         if (bean1 == null) {
             System.out.println("Test add fail");
         }
     } catch (Exception e) {
         e.printStackTrace();
     }
	}

}
