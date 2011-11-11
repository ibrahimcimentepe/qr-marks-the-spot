package akif;
import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class userServlet extends HttpServlet implements Servlet {

	MySqlConnection connection = new MySqlConnection();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		user u =  new user();
		u.setUserName(req.getParameter("username"));
		u.setPassword(req.getParameter("pass"));
		
		test.addUser(u);
		
		boolean added = connection.addUser(req.getParameter("username"),req.getParameter("pass"));
		
		if(added)
			resp.sendRedirect("http://localhost:8080/test1/main.jsp");
		else
			resp.sendRedirect("http://localhost:8080/test1/signUpUnsuccesful.jsp");
		
		//super.doPost(req, resp);
	}

	
}
