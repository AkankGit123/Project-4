package in.co.sunrays.proj4.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.sunrays.proj4.util.ServletUtility;
/**
 *  Welcome functionality Controller. Performs operation for Show Welcome page
 *
 * @author Akanksha
 *
 */
@ WebServlet(name="WelcomeCtl", urlPatterns ={"/WelcomeCtl"})
public class WelcomeCtl extends BaseCtl{
	
	private static final long serialVersionUID = 1L;

    //private static Logger log = Logger.getLogger(WelcomeCtl.class);

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //log.debug("WelcomeCtl Method doGet Started");

        ServletUtility.forward(ORSView.WELCOME_VIEW, request, response);

       // log.debug("WelcomeCtl Method doGet Ended");
    }

    @Override
    protected String getView() {
        return ORSView.WELCOME_VIEW;
    }
}
