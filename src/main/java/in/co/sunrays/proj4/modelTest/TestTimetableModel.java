package in.co.sunrays.proj4.modelTest;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.sunrays.proj4.bean.TimetableBean;
import in.co.sunrays.proj4.bean.UserBean;
import in.co.sunrays.proj4.exception.ApplicationException;
import in.co.sunrays.proj4.exception.DuplicateRecordException;
import in.co.sunrays.proj4.model.TimetableModel;
import in.co.sunrays.proj4.model.UserModel;

/**
 * Test TimetableModel
 * @author Akanksha
 *
 */
public class TestTimetableModel {
	
	public static void main(String[] args) throws Exception {
		//testAdd();
		//testDelete();
		//testupdate();
		testcheckbysem();
		//testlist();
		//testFindbyupk();

		
	}
	/**
	 * 
	 * test checkbysem method
	 *
	 */
	private static void testcheckbysem() {
		try {
			TimetableBean bean = new TimetableBean();
			TimetableModel model = new TimetableModel();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
			model.checkBysemester(1, 1, "3rd", sdf.parse("03/03/2012"));
			 if (bean == null) {
                System.out.println("Test Find By PK fail");
            }
            System.out.println(bean.getId());
           System.out.println(bean.getCourse_Name());
           System.out.println(bean.getSubject_Name());
           System.out.println(bean.getSemester());
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	/**
	 * 
	 * test Delete method
	 *
	 */
	private static void testDelete() throws Exception {

			TimetableModel model = new TimetableModel();
			TimetableBean bean = model.findByPK(2);
			
			model.delete(bean);
			
			System.out.println("Done");
	}
	/**
	 * 
	 * test Findbyupk method
	 *
	 */
	private static void testFindbyupk() throws ApplicationException {
		// TODO Auto-generated method stub

		TimetableBean stb = new TimetableBean();

		TimetableModel stm = new TimetableModel();

		stb = stm.findByPK(2);

		System.out.println(stb.getId());
		System.out.println(stb.getCourse_Id());
		System.out.println(stb.getCourse_Name());
		System.out.println(stb.getCreatedBy());
		System.out.println(stb.getModifiedBy());
		System.out.println(stb.getCreatedDatetime());
		System.out.println(stb.getModifiedDatetime());

	}
	/**
	 * 
	 * test update method
	 *
	 */
	public static void testupdate() throws Exception, DuplicateRecordException {
		// TODO Auto-generated method stub
		
		TimetableModel tm = new TimetableModel();
		TimetableBean tb =  tm.findByPK(3);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dt = new Date();
		tb.setSemester("6th");
		//tb.setCourse_Name("CorporateJAva");
		//tb.setSubject_Id(1);
		//tb.setCourse_Id(1);
		//tb.setExam_Date(sdf.parse("03/03/2012"));
		
		
		tm.update(tb);
		}
	/**
	 * 
	 * test list method
	 *
	 */
	public static void testlist() throws Exception {
		// TODO Auto-generated method stub
		TimetableBean tb = new TimetableBean();
		TimetableModel tm = new TimetableModel();
		List list = new ArrayList();
		list = tm.list();
		Iterator it = list.iterator();
		while (it.hasNext()) {
			tb = (TimetableBean) it.next();
			System.out.println(tb.getCourse_Id());
			System.out.println(tb.getCourse_Name());
			// System.out.println(fb.getDescription());
			System.out.println(tb.getCreatedBy());
		}
	}

	/**
	 * 
	 * test Add method
	 *
	 */	
	public static void testAdd() throws Exception, DuplicateRecordException {
		// TODO Auto-generated method stub
		TimetableBean tb = new TimetableBean();
		TimetableModel tm = new TimetableModel();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		
		tb.setCourse_Id(2);
		//tb.setSubject_Name("Hindi");
		tb.setSubject_Id(3);
		tb.setExam_Date(sdf.parse("12/1/1993"));
		tb.setExam_Time("4:00PM");
		tb.setSemester("1st");
		tb.setCreatedBy("Admin");
		tb.setModifiedBy("Admin");
        tb.setCreatedDatetime(new Timestamp(new Date().getTime()));
        tb.setModifiedDatetime(new Timestamp(new Date().getTime()));
		
		tm.add(tb);

	}

}
