package in.co.sunrays.proj4.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.co.sunrays.proj4.util.ServletUtility;

/**
 *  Main Controller performs session checking and logging operations before
 * calling any application controller. It prevents any user to access
 * application without login.
 * 
 * @author Akanksha
 *
 */
@WebFilter(filterName="FrontCtl" , urlPatterns= {"/ctl/*", "/doc/*"})
public class FrontController implements Filter{

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;

		HttpSession session = request.getSession();
		if(session.getAttribute("user")==null) {
			request.setAttribute("message", "Your Session has been expired, please login again");
		
		String str = request.getRequestURI();
		//System.out.println(str);
		session.setAttribute("uri", str);
		
		ServletUtility.forward(ORSView.LOGIN_VIEW, request, response);
		return;
		}else {
			chain.doFilter(req, resp);
		}
	}

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
