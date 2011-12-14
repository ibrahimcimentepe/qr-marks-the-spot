package Classes;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
//import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySqlConnection {
	public static String hostURL = "titan.cmpe.boun.edu.tr:3306/";
	private static String driver = "com.mysql.jdbc.Driver";
    private static String database = "database1";
    private static String url = "jdbc:mysql://titan.cmpe.boun.edu.tr:3306/"+database+"";
    private static String user = "project1";
    private static String password = "d8rop";
    private static Connection con;

    public MySqlConnection() {
    	try
        {
            Class.forName(driver).newInstance();
        }
        catch(Exception e)
        {
			e.printStackTrace();
            System.exit(-1);
        }

        try
        {
            con = DriverManager.getConnection(url,user,password);
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

    public int getPlayGameID(int userID,int gameID){
        int res=-1;
    	try {
            Statement statement = con.createStatement();
            System.out.println("CONNECTION ESTABLISHED");
            ResultSet rs = statement.executeQuery("SELECT * FROM `playgame` WHERE `UserId` = '"+userID+"' and `GameId` = '"+gameID+"'");
            System.out.println("STATEMENT EXECUTED");
            res=rs.getInt("PlayGameId");
        } catch(Exception e) {
             System.out.println("Error");
             res=-1;
        }
    	return res;
    }

    public ResultSet getInfoOfCurrentStep(int gameId,int currentStep){
    	try {
            Statement statement = con.createStatement();
            System.out.println("CONNECTION ESTABLISHED");
            ResultSet rs = statement.executeQuery("SELECT * FROM `gamesteps` WHERE `GameId` = '"+gameId+"' and `StepNumber` = '"+currentStep+"'");
            System.out.println("STATEMENT EXECUTED");
            if(rs.next()){
	    		System.out.println("GAME FOUND");
	    	}
            return rs;
        } catch(Exception e) {
             System.out.println("Error");
             return null;
        }
    }


    public ResultSet getCurrentStep(int userID,int gameID){
        try {
            Statement statement = con.createStatement();
            System.out.println("CONNECTION ESTABLISHED");
            ResultSet rs = statement.executeQuery("SELECT * FROM `playgame` WHERE `GameId` = " + gameID + " and `UserId` = " + userID +"" );
	        System.out.println("STATEMENT EXECUTED,GAME FOUND");
            if(rs.next()){
	    		System.out.println("GAME FOUND");
	    	}
            return rs;
        } catch(Exception e) {
             System.out.println("Error");
             return null;
        }

    }

    public boolean addPlayGame(String username,int gameID)
    {
    try {
            Statement statement = con.createStatement();
            System.out.println("CONNECTION ESTABLISHED");
            int firstStep=1;
            int userID=this.getUserIdbyUserName(username);
			statement.executeUpdate("INSERT INTO `"+database+"`.`playgame` (`UserId`, `GameId`,`UserName`,`CurrentStepOfPlayer`) " +
                    "VALUES ('"+userID+"', '"+gameID+"','"+username+"','"+firstStep+"')");

        } catch(Exception e) {
             System.out.println("Error");
             return false;
        }
    	return true;
    }


    public boolean addGame(GameAttributes gameAtt){
    
        try {
            Statement statement = con.createStatement();
            System.out.println("CONNECTION ESTABLISHED");
            ResultSet rs = statement.executeQuery("SELECT * FROM `games` WHERE `GameName` = '"+gameAtt.gameName+"'");
            System.out.println("STATEMENT EXECUTED");
            if(rs.next())
            	return false; // sama name problem

			statement.executeUpdate("INSERT INTO `"+database+"`.`games` (`GameName`, `Description`, `NumberOfSteps` , `CurrentStep`" +
                    ", `Borders`, `Rating`, `NumberOfPlayers`, `CreatorName`, `CreaterId`, `IsFinished`, `StartLocation`) VALUES ('"+
					gameAtt.gameName+"', '"+gameAtt.description+"', '"+gameAtt.numberOfSteps+"', '"
                    +gameAtt.currentDesigningStep+"', '"+gameAtt.borders+"', '"+gameAtt.rating+"','"+gameAtt.numberOfPlayers+"'," +
                    "'"+gameAtt.CreatorName+"','"+gameAtt.CreaterId+"', '"+(gameAtt.isFinished ? 1:0)+"', '"+gameAtt.startingPoint+"')");

            String insertQuery = "insert into `database1`.`gametags` (`GameId`";
            for(int i = 1;i<=gameAtt.tags.size();i++){
                insertQuery += ", `TAG"+String.valueOf(i)+"`";
            }
            rs = statement.executeQuery("SELECT `GameId` FROM `games` WHERE `GameName` = '"+gameAtt.gameName+"'");
            System.out.println("STATEMENT EXECUTED");
            int gameId = 0;
            if(rs.next())
                gameId = rs.getInt("GameId");
            insertQuery += ") VALUES ('"+gameId+"'";
            for(int i=0;i<gameAtt.tags.size();i++){
                insertQuery += ", '"+gameAtt.tags.get(i)+"'";
            }
            insertQuery += ")";
            statement.executeUpdate(insertQuery);
			System.out.println(gameAtt.gameName + " " + gameAtt.CreatorName);
        } catch(Exception e) {
             System.out.println("Error During Adding A Game");
             return false;
        }
    	return true;
        
    }

    public ResultSet getGame(int gameId)
    {
        try {
            Statement statement = con.createStatement();
            System.out.println("CONNECTION ESTABLISHED");            
            ResultSet rs = statement.executeQuery("SELECT * FROM `games` WHERE `GameId` = " + gameId + "" );                                           
	        System.out.println("STATEMENT EXECUTED,GAME FOUND");
            if(rs.next()){
	    		System.out.println("NEWS FOUND");
	    	}
            return rs;           
        } catch(Exception e) {
             System.out.println("Error");
             return null;
        }

    }
    public boolean addGameStep(GameAttributes gameAtt, int step)
    {
        try {
            Statement statement = con.createStatement();
            System.out.println("CONNECTION ESTABLISHED");
            ResultSet rs = statement.executeQuery("SELECT `GameId` FROM `games` WHERE `GameName` = '"+gameAtt.gameName+"'");
            System.out.println("STATEMENT EXECUTED");
            int gameId = 0;
            if(rs.next()){
                gameId = rs.getInt("GameId");
            }

            GameAttributes.GameSteps gameStep = gameAtt.gameSteps.get(step-1);
			String insertQuery = "insert into `database1`.`gamesteps` (`GameId`, `StepNumber`, `LocationOfQrCode`,"
                    +" `PasswordOfStep`, `IsSolved`) VALUES ('"+gameId+"', '"+step+"', '"+gameStep.location+"', '"
                    +gameStep.password+"', '0')";
            statement.executeUpdate(insertQuery);
            System.out.println("STATEMENT EXECUTED");

			System.out.println(gameAtt.gameName + " " + gameAtt.CreatorName);
        } catch(Exception e) {
             System.out.println("Error During Adding A Game");
             return false;
        }
        return true;
    }

    public boolean addNews(String News, Date DateAndTime)
    {
    	try {
            Statement statement = con.createStatement();
            System.out.println("CONNECTION ESTABLISHED");

            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            //System.out.println(dateFormat.format(date));

            statement.executeUpdate("INSERT INTO `"+database+"`.`newsfeed` (`News`) VALUES ('"+
					News+"') ");
			//System.out.println(username + " " + password);
            return true;
        } catch(Exception e) {
             System.out.println("Error");
             return false;
        }
    	
    }

    public ResultSet getNews(int number){

        //MySqlConnection con = new MySqlConnection();
        //TODO: use the number
        try {
            Statement statement = con.createStatement();
            System.out.println("CONNECTION ESTABLISHED");
            ResultSet rs = statement.executeQuery("SELECT * FROM `newsfeed` ORDER BY DateAndTime DESC ");
	    	if(rs.next()){
	    		System.out.println("NEWS FOUND");
	    	}

            return rs;
        } catch(Exception e) {
             System.out.println("Error");

             return null;
        }
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
	    	ResultSet rs = statement.executeQuery("SELECT `users`.password FROM `users` WHERE `UserName` = '" + username + "'" );
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
    public boolean gameExists(String gamename)
    {
    	boolean found = false;
    	try{
	    	Statement statement = con.createStatement();
	    	ResultSet rs = statement.executeQuery("SELECT * FROM `games` WHERE `GameName` = '"+gamename+"'");
	    	if(rs.next()){
	    		System.out.println("GAME FOUND");
                found=true;
	    	}
            else{
                found=false;
            }
    	}
    	catch(Exception e){

    	}
        finally{
            return found;
        }
    }

    public boolean playGameExists(int userID,int gameID)
    {
    	boolean found = false;
    	try{
	    	Statement statement = con.createStatement();
	    	ResultSet rs = statement.executeQuery("SELECT * FROM `playgame` WHERE `GameId` = " + gameID + " and 'UserId' = " + userID + " ");
	    	if(rs.next()){
	    		System.out.println("GAME FOUND");
                found=true;
	    	}
            else{
                found=false;
            }
    	}
    	catch(Exception e){

    	}
        finally{
            return found;
        }
    }
    public String getGameNameByGameId(int gameId){

        String res="";
    	try{
	    	Statement statement = con.createStatement();
	    	ResultSet rs = statement.executeQuery("SELECT * FROM `games` WHERE `GameId` = "+gameId+"");
	    	if(rs.next()){
	    		System.out.println("GAME FOUND");
                res = rs.getString("GameName");
	    	}
    	}
    	catch(Exception e){

    	}
        finally{
            return res;
        }
    }

    public void incrementStep(int userId, int gameId){
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM `playgame` WHERE `GameId` = '"+gameId+"' and `UserId` = '"+userId+"'");
            if(rs.next()){
                int counter=rs.getInt("CurrentStepOfPlayer");
                counter++;
                statement.executeUpdate("UPDATE `playgame` SET `CurrentStepOfPlayer` = '" + counter + "' WHERE `GameId` = '" + gameId + "' and `UserId` = '" + userId + "' ");
            }
        }
        catch(Exception e){

        }
        
    }
    

    public int getUserIdbyUserName(String username){

        int userId = -1;
    	try{
	    	Statement statement = con.createStatement();
	    	ResultSet rs = statement.executeQuery("SELECT UserId FROM `users` WHERE `UserName` = '"+username+"'");
	    	if(rs.next()){
	    		System.out.println("USER FOUND");
                userId = rs.getInt("UserId");
	    	}
    	}
    	catch(Exception e){

    	}
        finally{
            return userId;
        }
    }

    public ResultSet getUserInformationbyUserName(String username){

        try {
            Statement st = con.createStatement();
            System.out.println("CONNECTION ESTABLISHED");

            ResultSet rs = st.executeQuery("SELECT * FROM `users` WHERE `UserName` = '"+username+"'" );

	        System.out.println("STATEMENT EXECUTED,USER FOUND");
            if(rs.next()){
	    		System.out.println("USER FOUND");
	    	}
            return rs;

        } catch(Exception e) {
             System.out.println("Error");
             return null;
        }
    }

    public String[] getGameNamebyGameTag(String tag)
    {
        String[] results=new String[3];
        try
        {
            String[] results2=new String[100];
            int i=0;
            Statement statement = con.createStatement();
	    	ResultSet rs = statement.executeQuery("SELECT games.GameName FROM games INNER JOIN gametags on games.GameId=gametags.GameId WHERE gametags.TAG1 =  '"+tag+"' OR gametags.TAG2 = '"+tag+"' OR gametags.TAG3 = '"+tag+"' OR gametags.TAG4 = '"+tag+"' OR gametags.TAG5 = '"+tag+"'");
	    	while(rs.next()){
	    		System.out.println("GAMES FOUND");
                results2[i]=rs.getString("GameName");
                i++;
	    	}
            if (i>3) results=new String[i];
            else results=new String[3];
            for(int j=0;j<i;j++)
            {
                results[j]=results2[j];
            }
        }
        catch(Exception e)
        {}
        finally
        {
            return results;
        }
    }

    public int getGameIdbyGameName(String gameName){
        int gameId = -1;
    	try{
	    	Statement statement = con.createStatement();
	    	ResultSet rs = statement.executeQuery("SELECT * FROM `games` WHERE `GameName` = '"+gameName+"'");
	    	if(rs.next()){
	    		System.out.println("GAME FOUND");
                gameId = rs.getInt(1);
	    	}
    	}
    	catch(Exception e){

    	}

        return gameId;
    
    }
    
    public int sizeOfGameBox(String username){
        int res = 0;
    	try{
	    	Statement statement = con.createStatement();
	    	ResultSet rs = statement.executeQuery("SELECT UserId FROM `playgame` WHERE `UserName` = '"+username+"'");
	    	while(rs.next()){
	    		System.out.println("GAME FOUND");
                res++;
	    	}
    	}
    	catch(Exception e){

    	}
        finally{
            return res;
        }
    }
    public int[] gameBoxList(String username){
        int sizeOfList=this.sizeOfGameBox(username);
        int res[]=new int[sizeOfList];
        int gameId;
        try{
	    	Statement statement = con.createStatement();
	    	ResultSet rs = statement.executeQuery("SELECT GameId FROM `playgame` WHERE `UserName` = '"+username+"'");
            int i=0;
            while(rs.next()){
	    		gameId=rs.getInt(2);
                res[i]=gameId;
                i++;
	    	}
    	}
    	catch(Exception e){

    	}
        finally{
            return res;
        }
    }

    public void sendAbusementReport(int userId, String message)
    {
        try {
            Statement statement = con.createStatement();
            System.out.println("CONNECTION ESTABLISHED");


            statement.executeUpdate("INSERT INTO `"+database+"`.`abusementMessages` (`userId`,`message`) VALUES (" + userId + " , " + "'" + message + "') " );
			//System.out.println(username + " " + password);
        //    return true;
        } catch(Exception e) {
             System.out.println("Error");
       //      return false;
        }

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if(con != null)
            con.close();
    }
}
