package akif;
import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class userServlet extends HttpServlet implements Servlet {

	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		user u =  new user();
		u.setUserName(req.getParameter("username"));
		u.setPassword(req.getParameter("pass"));
		
		
		
		super.doPost(req, resp);
	}

	
}
