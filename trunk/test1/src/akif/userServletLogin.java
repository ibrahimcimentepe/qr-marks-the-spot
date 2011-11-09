package akif;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class userServletLogin extends HttpServlet implements Servlet {

	//MySqlConnection connection = new MySqlConnection();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		user u =  new user();
		u.setUserName(req.getParameter("username"));
		u.setPassword(req.getParameter("pass"));
		
		boolean found = test.findUser(u);
		
		//connection.addUser(req.getParameter("username"),req.getParameter("pass"));
		
		resp.sendRedirect("http://localhost:8080/test1/main.jsp");
		
		//super.doPost(req, resp);
	} 	
	
}
