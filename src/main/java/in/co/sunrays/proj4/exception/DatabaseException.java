package in.co.sunrays.proj4.exception;
/**
 * DatabaseException is propogated by DAO classes when an unhandled Database
 * exception occurred
 * 
 * @author Akanksha
 *
 */
public class DatabaseException extends Exception  {
	 
	/****ErrorMessage****/ 
	public DatabaseException(String msg) {
	        super(msg);
	    }
}
