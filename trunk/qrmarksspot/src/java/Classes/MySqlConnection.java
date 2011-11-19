package Classes;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MySqlConnection {
	public static String hostURL = "titan.cmpe.boun.edu.tr:8080/";

	private static String connecter = "com.mysql.jdbc.Driver";

    private static String database = "database1";

    private static String pfad = "jdbc:mysql://titan.cmpe.boun.edu.tr:3306/"+database+"";

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
        System.err.println("DATABASE CONNECTION ESTABLISHED");
	}

    public boolean addUser(String username, String password, String birthDay)
    {
    	try {
            Statement statement = con.createStatement();
            System.out.println("CONNECTION ESTABLISHED");
            ResultSet rs = statement.executeQuery("SELECT * FROM `users` WHERE `UserName` = '"+username+"'");
            System.out.println("STATEMENT EXECUTED");
            if(rs.next())
            	return false;

			statement.executeUpdate("INSERT INTO `"+database+"`.`users` (`Password`, `UserName`, `DateOfBirth`) VALUES ('"+
					password+"', '"+username+"', '"+birthDay+" 00:00:00')");
			System.out.println(username + " " + password);
        } catch(Exception e) {
             System.out.println("Error");
             return false;
        }
    	return true;
    }

    public boolean updateUserPicture(String username, InputStream in)
    {
        String INSERT_PICTURE = "update `database1`.`users` set `Picture` = ? where `UserName` = ?";

        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(INSERT_PICTURE);
            System.out.println("Statement prepared");
            if(ps.isClosed())
                System.out.println("PS is closed");
            ps.setString(2, username);
            System.out.println("username is set");
            ps.setBinaryStream(1, in, in.available());
            System.out.println("Binary stream is set: " + in.available());
            ps.executeUpdate();
            ps.close();
            System.out.println("Statement executed");
        } catch (SQLException sqlex){
            System.err.println("An SQL exception occured during picture update "+sqlex);
            System.err.println(sqlex.getMessage()+"\n"+sqlex.getSQLState());
        } catch (IOException ioex){
            System.err.println("An IO exception has occured"+ioex);
        } finally {
            try {
                if(ps != null)
                    ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(MySqlConnection.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return false;
    }

    public boolean updateUserPicture(String username, String password, String birhtDay, InputStream in, String filePath)
    {
        String INSERT_PICTURE = "insert into `database1`.`users` (`Password`, `UserName`, `DateOfBirth`, `Picture`) values (?, ?, ?, ?)";
        
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(INSERT_PICTURE);
            System.out.println("Statement prepared");
            if(ps.isClosed())
                System.out.println("PS is closed");
            ps.setString(1, password);
            ps.setString(2, username);
            ps.setString(3, birhtDay+" 00:00:00");
            System.out.println("username is set");
            ps.setBinaryStream(4, in, in.available());
            System.out.println("Binary stream is set: " + in.available());
            ps.executeUpdate();
            ps.close();
            System.out.println("Statement executed");
        } catch (SQLException sqlex){
            System.err.println("An SQL exception occured during picture update "+sqlex);
            System.err.println(sqlex.getMessage()+"\n"+sqlex.getSQLState());
        } catch (IOException ioex){
            System.err.println("An IO exception has occured"+ioex);
        } finally {
            try {
                if(ps != null)
                    ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(MySqlConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return false;
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
