package akif;
import java.util.ArrayList;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;


public class test {

	/**
	 * @param args
	 */
	
	private static ArrayList<user> users = new ArrayList<user>();
	
	
	public static void addUser(user user){
		
		users.add(user);
	}
	
	public static boolean findUser(user user){
		
		for(int i=0; i < users.size();i++){
			
			if(users.get(i).getUserName().equals(user.getUserName())){
				
				if(users.get(i).getPassword().equals(user.getPassword())){
					
					return true;
				}
				
			}
			
		}

		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		userServlet us = new userServlet();
		test newtestobject = new test();
		//newtestobject.addUser(us.doPost(req, resp));
		
	}

}
