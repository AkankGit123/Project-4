package in.co.sunrays.proj4.modelTest;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.sunrays.proj4.bean.RoleBean;
import in.co.sunrays.proj4.model.RoleModel;

/**
 * Test RoleModel
 * @author Akanksha
 *
 */
public class TestRoleModel {
	
	public static void main(String[] args) {
		//testAdd();
		//testUpdate();
		//testDelete();
		//testFindByPK();
		//testFindByName();
		//testSearch();
		//testList();
	}
	/**
	 * Test List method
	 *
	 */
	private static void testList() {

		 try {
			 RoleModel model = new RoleModel();
	            RoleBean bean = new RoleBean();
	            List list = new ArrayList();
	            list = model.list(1, 10);
	            if (list.size() < 0) {
	                System.out.println("Test list fail");
	            }
	            Iterator it = list.iterator();
	            while (it.hasNext()) {
	                bean = (RoleBean) it.next();
	                System.out.println(bean.getId());
	                System.out.println(bean.getName());
	                System.out.println(bean.getDescription());
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
			RoleModel model = new RoleModel();
            RoleBean bean = new RoleBean();
            List list = new ArrayList();
            bean.setName("Akanksha");
            list = model.Search(bean, 0, 0);
            if (list.size() < 0) {
                System.out.println("Test Serach fail");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bean = (RoleBean) it.next();
                System.out.println(bean.getId());
                System.out.println(bean.getName());
                System.out.println(bean.getDescription());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}
	/**
	 * Test FindByName method
	 *
	 */
	private static void testFindByName() {
		  try {
			  RoleModel model = new RoleModel();
			  RoleBean bean = new RoleBean();
	            bean = model.findByName("Praveen");
	            if (bean == null) {
	                System.out.println("Test Find By PK fail");
	            }
	            System.out.println(bean.getId());
	            System.out.println(bean.getName());
	            System.out.println(bean.getDescription());
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
			RoleModel model = new RoleModel();
            RoleBean bean = new RoleBean();
            long pk = 1L;
            bean = model.findByPK(pk);
            if (bean == null) {
                System.out.println("Test Find By PK fail");
            }
            System.out.println(bean.getId());
            System.out.println(bean.getName());
            System.out.println(bean.getDescription());
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
			RoleModel model = new RoleModel();
            RoleBean bean = new RoleBean();
            long pk = 2L;
            bean.setId(pk);
            model.delete(bean);
            RoleBean deletedbean = model.findByPK(pk);
            if (deletedbean != null) {
                System.out.println("Test Delete fail");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}
	/**
	 * Test update method
	 *
	 */
	private static void testUpdate() {

		  try {
			  RoleModel model = new RoleModel();
	            RoleBean bean = model.findByPK(3L);
	            bean.setName("Akanksha");
	            bean.setDescription("Rawal");
	            bean.setCreatedBy("Admin");
	            bean.setModifiedBy("Admin");
	            bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
	            bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
	            model.update(bean);

	            RoleBean updatedbean = model.findByPK(3L);
	            if (!"12".equals(updatedbean.getName())) {
	                System.out.println("Test Update fail");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
	}
	/**
	 * Test Add method
	 *
	 */
	private static void testAdd() {
		try {
            RoleBean bean = new RoleBean();
            RoleModel model = new RoleModel();
            // SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

            // bean.setId(1L);
            bean.setName("FACULTY");
            bean.setDescription("FACULTY");
            bean.setCreatedBy("Admin");
            bean.setModifiedBy("Admin");
            bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
            bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
            long pk = model.add(bean);
            RoleBean addedbean = model.findByPK(pk);
            if (addedbean == null) {
                System.out.println("Test add fail");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
