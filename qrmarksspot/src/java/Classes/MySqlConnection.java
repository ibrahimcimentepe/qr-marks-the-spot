package Classes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class MySqlConnection {
	public static String hostURL = "titan.cmpe.boun.edu.tr:8080/";

	private static String connecter = "com.mysql.jdbc.Driver";

    private static String database = "database1";

    private static String pfad = "jdbc:mysql://titan.cmpe.boun.edu.tr/"+database+"";

    private static String table = "users";

    private static String user = "project1";

    private static String pWord = "d8rop";

    private static Connection con;

    public MySqlConnection() {
    	try
        {
            Class.forName(connecter).newInstance();
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
            System.err.println("CONNECTION CANNOT BE ESTABLISHED");
        }
	}

    public boolean addUser(String username, String password, String birthDay)
    {
    	try
        {
            Statement statement = con.createStatement();
            System.out.println("CONNECTION ESTABLISHED");
            ResultSet rs = statement.executeQuery("SELECT * FROM `users` WHERE `UserName` = '"+username+"'");
            System.out.println("STATEMENT EXECUTED");
            if(rs.next())
            	return false;

			statement.executeUpdate("INSERT INTO `"+database+"`.`users` (`Password`, `UserName`, `DateOfBirth`) VALUES ('"+
					password+"', '"+username+"', '"+birthDay+" 00:00:00')");
			System.out.println(username + " " + password);
        }

        catch(Exception e)
        {
             System.out.println("Error");
             return false;
        }
    	return true;
    }

    public String getpassword(String username)
    {
    	String str = null;
    	try{
	    	Statement statement = con.createStatement();
	    	ResultSet rs = statement.executeQuery("SELECT * FROM "+table);

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
	    	ResultSet rs = statement.executeQuery("SELECT * FROM `users` WHERE `UserName` = '"+username+
					 		"' and `Password` = '"+password+"'");
	    	if(rs.next()){
	    		System.out.println("USER FOUND");
	    		String passwd = rs.getString("password");
	    		System.out.println("USER PASSWORD: "+passwd);
	    		if(passwd.equals(password)){
                    found = true;
                }
	    		else{
	    			found = false;
                }
	    	}
	    	else{
	    		found = false;
            }
    	}
    	catch(Exception e){

    	}
        finally{
            return found;
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if(con != null)
            con.close();
    }
}
