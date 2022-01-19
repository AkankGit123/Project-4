package in.co.sunrays.proj4.exception;
/**
 *  DuplicateRecordException thrown when a duplicate record occurred
 *
 * @author Akanksha
 *
 */
public class DuplicateRecordException  extends Exception {
	//:ErrorMessage
	public DuplicateRecordException(String msg) {
        super(msg);
    }
}
