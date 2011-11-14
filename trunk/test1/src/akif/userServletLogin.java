package akif;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import javax.servlet.http.HttpSessionEvent;

import com.mysql.jdbc.interceptors.SessionAssociationInterceptor;

public class userServletLogin extends HttpServlet implements Servlet {

	MySqlConnection connection = new MySqlConnection();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		user u =  new user();
		u.setUserName(req.getParameter("username"));
		u.setPassword(req.getParameter("pass"));
		
		boolean found = test.findUser(u);
		
		//boolean found = connection.userExists(req.getParameter("username"),req.getParameter("pass"));
		if(!found){
			
			resp.sendRedirect("http://localhost:8080/test1/loginUnsuccessfull.jsp");
		}else{
			
			req.getSession().setAttribute("user", u.getUserName());
			
			
			resp.sendRedirect("http://localhost:8080/test1/main.jsp");
			
		}
		
		//super.doPost(req, resp);
	} 	
	
}
