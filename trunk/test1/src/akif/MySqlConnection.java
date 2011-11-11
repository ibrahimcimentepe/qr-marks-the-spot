package akif;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class MySqlConnection {
	private static String connecter = "com.mysql.jdbc.Driver";

    private static String database = "Deneme";
    
    private static String pfad = "jdbc:mysql://localhost:3306/"+database+"";

    private static String table = "users";

    private static String user = "root";

    private static String pWord = "";

    private static Connection con;
    
    public MySqlConnection() {
    	try
        {
            Class.forName(connecter);
        }
        catch(Exception e)
        {
			e.printStackTrace();
            System.exit(-1);
        }
        
        try
        {
            con = DriverManager.getConnection(pfad,user,pWord);
        }
        catch(Exception e)
        {
            //System.exit(-1);
        }
	}
    
    public void addUser(String username, String password)
    {
    	try
        {
            Statement statement = con.createStatement();
			System.out.println(username + " " + password);
			statement.executeUpdate("INSERT INTO myusers VALUES('"+username+"','"+password+"')");
             
        }
    
        catch(Exception e)
        {
             System.out.println("Error");
        }
    }
    
    public String getpassword(String username)
    {
    	String str = null;
    	try{
	    	Statement statement = con.createStatement();
	    	ResultSet rs = statement.executeQuery("SELECT * FROM myusers");
	    	
	    	if(rs.next()){
	    		str = rs.getString(1);
	    		
	    	}
    	}
    	catch(Exception e){
    		
    	}
    	return str;
    }
    
    public boolean userExists(String username, String password)
    {
    	boolean found = false;
    	try{
	    	Statement statement = con.createStatement();
	    	ResultSet rs = statement.executeQuery("SELECT * FROM `myusers` WHERE `username` = '"+username+
					 		"' and `password` = '"+password+"'");
	    	
	    	if(rs.next()){
	    		System.out.println("USER FOUND");
	    		String passwd = rs.getString("password");
	    		System.out.println("USER PASSWORD: "+passwd);
	    		if(passwd.equals(password))
	    			found = true;
	    		else
	    			found = false;
	    	}
	    	else
	    		found = false;
    	}
    	catch(Exception e){
    		
    	}
    	return found;
    }
}
