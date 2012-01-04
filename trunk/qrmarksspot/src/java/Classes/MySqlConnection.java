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
/**
 * @version MySqlConnection.java
 * @version Created on 18.Kas.2011, 15:40:54
 * @author bilalacar,alikerimerkan,akifcemheren,ibrahimcimentepe,unsalgokdag
 */
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

 /**
 * Adds a new user to the database
 *
 *
 *
 * @param username name of the user to be added
 * @param password password of the user to be added
 * @param birthday birthday of the user to be added
 * @return            true if the user is added, otherwise false
 */
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

 /**
 * Returns the playgameid with taking userID and gameID
 *
 *
 *
 * @return PlayGameId from playgame table which determines a user with userId is playing the game with gameId
 */
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

/**
 * Returns the information about a game's given step.
 *
 *
 * @return  ResultSet containing a row from 'gamesteps' table
 */
    public ResultSet getInfoOfCurrentStep(int gameId,int currentStep){
    	try {
            Statement statement = con.createStatement();
            System.out.println("CONNECTION ESTABLISHED");
            ResultSet rs = statement.executeQuery("SELECT * FROM `gamesteps` WHERE `GameId` = '"+gameId+"' and `StepNumber` = '"+currentStep+"'");
            System.out.println("STATEMENT EXECUTED");
            
            return rs;
        } catch(Exception e) {
             System.out.println("Error");
             return null;
        }
    }

/**
 *Returns the current step of a user  in a game that is being played by him
 *
 * @return  Resultset that contains the resulting row data
 */
    public ResultSet getCurrentStep(int userID,int gameID){
        try {
            Statement statement = con.createStatement();
            System.out.println("CONNECTION ESTABLISHED");
            ResultSet rs = statement.executeQuery("SELECT * FROM `playgame` WHERE `GameId` = " + gameID + " and `UserId` = " + userID +"" );
	        System.out.println("STATEMENT EXECUTED,GAME FOUND");


            return rs;
        } catch(Exception e) {
             System.out.println("Error");
             return null;
        }

    }

/**
 *Inserts a new playgame row into the 'playgame' table.This means that
 * a user with 'username' has started to play a game with 'gameID'
 *
 * @return  true is a playgame row is inserted,false otherwise
 */
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

/**
 *Inserts a new game with attributes 'gameAtt' into the games table in database
 *
 * @return  true if the game is added succesfully,false otherwise
 */
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

/**
 *Returns the attributes of a game which is determined by 'gameId'
 *
 * @return  Resultset that contains the corresponding row data of the game
 */
    public ResultSet getGame(int gameId)
    {
        try {
            Statement statement = con.createStatement();
            System.out.println("CONNECTION ESTABLISHED");            
            ResultSet rs = statement.executeQuery("SELECT * FROM games WHERE GameId = "+Integer.toString(gameId));
	        System.out.println("STATEMENT EXECUTED,GAME FOUND");


            rs.next();
            return rs;
            
        } catch(Exception e) {
             System.out.println("Error");
             return null;
        }

    }

/**
 *Returns the attributes of a game which is queried by its name(i.e. 'gameName')
 *
 * @return  Resultset that contains the resulting row data of game attributes
 */
    public ResultSet getGameByGameName(String gameName)
    {
        try {
            Statement statement = con.createStatement();
            System.out.println("CONNECTION ESTABLISHED");
            ResultSet rs = statement.executeQuery("SELECT * FROM games WHERE GameName = '"+ gameName + "'");
	        System.out.println("STATEMENT EXECUTED,GAME FOUND");


            rs.next();
            return rs;

        } catch(Exception e) {
             System.out.println("Error");
             return null;
        }

    }

/**
 *Updates the attributes of a game which has id of 'gameId'
 *
 *
 */
    public void updateGame(int gameId,String gameName,String description,String startingPoint,String borders,int numberOfSteps,int currentStep,int numberOfPlayers,int rating )
    {
        try {
            Statement statement = con.createStatement();
            System.out.println("CONNECTION ESTABLISHED");

            statement.executeUpdate("UPDATE games SET GameName= '"+gameName+"' ,"+ " Description='"+description  + "' , " +
                                                      "StartLocation='"+ startingPoint +"' ," + "Borders ='" +borders + "' , " +
                                                      "NumberOfSteps='"+ numberOfSteps +"' ," + "CurrentStep ='" +currentStep + "' , " +
                                                      "NumberOfPlayers='" + numberOfPlayers + "' ," +"Rating='" + rating +"'" +
                    " WHERE GameId="+gameId);
			//System.out.println(username + " " + password);
          //  return true;
        } catch(Exception e) {
             System.out.println("Error");
           //  return false;
        }
    }


/**
 *Returns the total games table in the database
 *
 * @return  Resultset that contains the resulting games
 */
    public ResultSet getGamesList()
    {
        try {
            Statement statement = con.createStatement();
            System.out.println("CONNECTION ESTABLISHED");
            ResultSet rs = statement.executeQuery("SELECT * FROM `games` " );
	        System.out.println("STATEMENT EXECUTED,GAMES FOUND");
    //        if(rs.next()){
	//    		System.out.println("NEWS FOUND");
	//    	}
            return rs;
        } catch(Exception e) {
             System.out.println("Error");
             return null;
        }

    }

/**
 *Adds a new step to gamesteps table in database.This means that a new gamestep is
 * created by the game creator in game creation phase
 *
 * @return  true if the gamestep is inserted succesfully,false otherwise
 */
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
                    +" `PasswordOfStep`, `IsSolved`, `QrString`) VALUES ('"+gameId+"', '"+step+"', '"+gameStep.location+"', '"
                    +gameStep.password+"', '0','" +gameStep.qrCodeOfStep+ "')";
            statement.executeUpdate(insertQuery);
            System.out.println("STATEMENT EXECUTED");

			System.out.println(gameAtt.gameName + " " + gameAtt.CreatorName);
        } catch(Exception e) {
             System.out.println("Error During Adding A Game");
             return false;
        }
        return true;
    }

/**
 *Adds a new News data to the newsfeed table in the database.
 *
 * @return  true if the news is added successfuly,false otherwise
 */
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

/**
 *Returns the news which has corresponding 'number'
 *
 * @return  ResultSet that conteains the News row data
 */
    public ResultSet getNews(int number){

        //MySqlConnection con = new MySqlConnection();
        //TODO: use the number
        try {
            Statement statement = con.createStatement();
            System.out.println("CONNECTION ESTABLISHED");
            ResultSet rs = statement.executeQuery("SELECT * FROM `newsfeed` ORDER BY DateAndTime DESC ");
	    	
            return rs;
        } catch(Exception e) {
             System.out.println("Error");

             return null;
        }
    }

 /**
 *Updates the picture of the user
 *
 * @return  true if the picture is inserted succesfully,false otherwise
 */
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

/**
 *Updates the picture of the user
 *
 * @return  true if the picture is inserted succesfully,false otherwise
 */
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

/**
 *Returns the given user's password
 *
 * @return  String that is the corresponding user password
 */
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

/**
 *Returns the given user's information
 *
 * @return  String array that holds corresponding user data
 */
    public String[] getInfoofUser(String username)
    {
    	String[] str = new String[6];
    	try{
	    	Statement statement = con.createStatement();
	    	ResultSet rs = statement.executeQuery("SELECT `users`.password FROM `users` WHERE `UserName` = '" + username + "'" );
	    	if(rs.next()){
	    		str[0] = rs.getString("Password");
                str[1] = rs.getString("UserName");
                str[2] = rs.getString("DateOfBirth");
                str[3] = rs.getString("WebsiteOfUser");
                str[4] = rs.getString("Twitter");
                str[5] = rs.getString("Facebook");
	    	}
    	}
    	catch(Exception e){
    	}
    	return str;
    }

/**
 *Checks whether a user with given username exists in database
 *
 * @return  true if user exists,false otherwise
 */
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

/**
 *Checks whether a game with given gamename exists in database
 *
 * @return  true if game exists,false otherwise
 */
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

/**
 *Checks whether a playgame row given userID and gameID exists in database
 *
 * @return  true if playgame row exists,false otherwise
 */
    public boolean playGameExists(int userID,int gameID)
    {
    	boolean found = false;
    	try{
	    	Statement statement = con.createStatement();
	    	ResultSet rs = statement.executeQuery("SELECT * FROM `playgame` WHERE `GameId` = '" + gameID + "' and `UserId` = '" + userID + "'");
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

/**
 *Returns the name of a game given its 'gameId'
 *
 * @return  String that holds the name of the game
 */
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

/**
 *Increments the current step that a player has in a game.
 *
 */
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

 /**
 *Updates a user's data
 *
 */
    public void updateUser(String username,String newUsername,String password,String date,String web,String face,String twit){
        try{
            Statement statement=con.createStatement();
            ResultSet rs=statement.executeQuery("SELECT * FROM `users` WHERE `UserName` = '"+username+"'");
            if(rs.next()){
                statement.executeUpdate("UPDATE `users` SET `UserName` = '"+newUsername+"',`Password` = '"+password+"',`DateOfBirth` = '"+date+"',`WebsiteOfUser` = '"+web+"',`Twitter` = '"+twit+"',`Facebook` = '"+face+"' WHERE `UserName` = '"+username+"'");
            }

        }
        catch(Exception E){


        }

    }
    
/**
 *Returns the Id of a user given his 'username'
 *
 * @return  userId
 */
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

/**
 *Returns the Info of a user given his 'username'
 *
 * @return  userInfo
 */
    public String getUserInfobyUserName(String username,String info){

        String resultString;
        try {
            ResultSet rs = this.getUserInformationbyUserName(username);

            if(rs.next()){
                System.out.println("USER FOUND");
                resultString=rs.getString(info);
            }
            else{
                resultString=null;
            }


        } catch(Exception e) {
             System.out.println("Error");
             resultString=null;
        }

        return resultString;
    }

/**
 *Returns the Info of a user given his 'username'
 *
 * @return  userInfo
 */
    public ResultSet getUserInformationbyUserName(String username){

        try {
            Statement st = con.createStatement();
            System.out.println("CONNECTION ESTABLISHED");

            ResultSet rs = st.executeQuery("SELECT * FROM `users` WHERE `UserName` = '"+username+"'" );

	        System.out.println("STATEMENT EXECUTED,USER FOUND");
            
            return rs;

        } catch(Exception e) {
             System.out.println("Error");
             return null;
        }
    }

   
/**
 *Returns the Id of a game given its 'gameName'
 *
 * @return  gameId
 */
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

/**
 *Returns the Id of a user given his 'username'
 *
 * @return  userId
 */
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

/**
 *Inserts an abusement message to abusementMessages table in the database
 *
 */
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

/**
 *Returns the abusement message given its abusementMessageId
 *
 * @return  ResultSet that contains the corresponding abusement messsage
 */
    public ResultSet getAbusementMessage( int currentAbusementMessageId)
    {
       
        try
        {
            Statement statement = con.createStatement();
            System.out.println("CONNECTION ESTABLISHED");
            ResultSet rs = statement.executeQuery("SELECT * FROM abusementMessages WHERE messageId = "+currentAbusementMessageId);
           // if(rs.next()){
           // rs.getString("message");
	    	return rs;
           // }
           // return result;
        }
        catch(Exception e) {
             System.out.println("Error");
             return null;
        }
      
    }


/**
 *Returns list of the games that are created by a user with id of 'userId'
 *
 * @return  ResultSet that contains the corresponding rows from games table
 */
    public ResultSet getGameNameByUserId (int userId)
    {
        try
        {
            Statement statement = con.createStatement();
            System.out.println("CONNECTION ESTABLISHED");
            ResultSet rs = statement.executeQuery("SELECT * FROM games WHERE CreaterId = "+userId);
	    	return rs;
        }
        catch(Exception e) {
             System.out.println("Error");
             return null;
        }
    }

/**
 *Returns list of the games that are created by a user with name of 'userName'
 *
 * @return  String[] that contains the corresponding gamenames from games table
 */
    public String[] getGameNameByUserNameString (String userName)
    {
        String[] temp=new String[1];
        temp[0]="ErrorInQueryFunction";
        try
        {
            Statement statement = con.createStatement();
            System.out.println("CONNECTION ESTABLISHED");
            ResultSet rs = statement.executeQuery("SELECT GameName FROM games WHERE CreatorName = '"+userName+"'");
            rs.last();
            int size=rs.getRow();
            rs.first();
            temp= new String[size];
            for(int i=0;i<size;i++)
            {
                //System.out.println("GAMES FOUND");
                temp[i]=rs.getString(1);
                if(i<size-1) rs.next();
            }
        }
        catch(Exception e) {
             System.out.println("Error");
             temp= new String[2];
             temp[0]="QuerygivesException";
             temp[1]=e.toString();
        }
        return temp;
    }

/**
 *Returns list of the games that has number of steps equals to 'steps'
 *
 * @return  String[] that contains the corresponding rows from games table
 */
    public String[] getGameNameByMaxSteps (int steps)
    {
        String[] temp=new String[1];
        temp[0]="ErrorInQueryFunction";
        try
        {
            Statement statement = con.createStatement();
            System.out.println("CONNECTION ESTABLISHED");
            ResultSet rs = statement.executeQuery("SELECT GameName FROM games WHERE NumberOfSteps <= "+steps);
            rs.last();
            int size=rs.getRow();
            rs.first();
            temp= new String[size];
            for(int i=0;i<size;i++)
            {
                //System.out.println("GAMES FOUND");
                temp[i]=rs.getString(1);
                if(i<size-1) rs.next();
            }
        }
        catch(Exception e) {
             System.out.println("Error");
             temp= new String[2];
             temp[0]="QuerygivesException";
             temp[1]=e.toString();
        }
        return temp;
    }

/**
 *Returns list of the games that has the given 'rating'
 *
 * @return  String[] that contains the corresponding rows from games table
 */
    public String[] getGameNameByMaxRating (int rating)
    {
        String[] temp=new String[1];
        temp[0]="ErrorInQueryFunction";
        try
        {
            Statement statement = con.createStatement();
            System.out.println("CONNECTION ESTABLISHED");
            ResultSet rs = statement.executeQuery("SELECT GameName FROM games WHERE Rating <= "+rating);
            rs.last();
            int size=rs.getRow();
            rs.first();
            temp= new String[size];
            for(int i=0;i<size;i++)
            {
                //System.out.println("GAMES FOUND");
                temp[i]=rs.getString(1);
                if(i<size-1) rs.next();
            }
        }
        catch(Exception e) {
             System.out.println("Error");
             temp= new String[2];
             temp[0]="QuerygivesException";
             temp[1]=e.toString();
        }
        return temp;
    }

/**
 *Returns list of the games that has the tags equal to 'tag'
 *
 * @return  String[] that contains the corresponding rows from games table
 */
     public String[] getGameNamebyGameTag(String tag)
    {
        String[] results2;
        String[] results=null;
        try
        {
            results2=new String[100];
            int i=0;
            Statement statement = con.createStatement();
	    	ResultSet rs = statement.executeQuery("SELECT games.GameName FROM games INNER JOIN gametags on games.GameId=gametags.GameId WHERE gametags.TAG1 =  '"+tag+"' OR gametags.TAG2 = '"+tag+"' OR gametags.TAG3 = '"+tag+"' OR gametags.TAG4 = '"+tag+"' OR gametags.TAG5 = '"+tag+"'");
	    	while(rs.next()){
	    		System.out.println("GAMES FOUND");
                results2[i]=rs.getString("GameName");
                i++;
	    	}
            results=new String[i];
            /*
            if (i>30) results=new String[i];
            else results=new String[30];
            */
            for(int j=0;j<i;j++)
            {
                results[j]=results2[j];
            }
        }
        catch(Exception e)
        {
            results= new String[1];
            results[0]="errorInSQL";
        }

            return results;
    }

/**
 *Returns list of the gamesteps of a game with 'gameId'
 *
 * @return  ResultSet that contains the corresponding rows from gamesteps table
 */
    public ResultSet getGameStepsByGameId (String gameId)
    {
        try {
            Statement statement = con.createStatement();
            System.out.println("CONNECTION ESTABLISHED");
            ResultSet rs = statement.executeQuery("SELECT * FROM gamesteps WHERE GameId = '" + gameId +"'");
            

            return rs;
        } catch(Exception e) {
             System.out.println("Error");

             return null;
        }


    }

/**
 *Returns list of the games that are created by a user with name of 'username'
 *
 * @return  String[] that contains the corresponding rows from playgame table
 */
    public String[] getGameNameOfUser(String username)
    {
        String[] temp=new String[1];
        String[] resultString=new String[1];
        temp[0]="ErrorInQueryFunction";
        try
        {
            Statement statement = con.createStatement();
            System.out.println("CONNECTION ESTABLISHED");
            ResultSet rs = statement.executeQuery("SELECT PlayGameId FROM playgame WHERE UserName = '"+username+"'");
            rs.last();
            int size=rs.getRow();
            rs.first();
            temp= new String[size];
            resultString=new String[size];
            for(int i=0;i<size;i++)
            {
                //System.out.println("GAMES FOUND");
                //temp[i]=Integer.toString(rs.getInt("GameId"));
                resultString[i]=this.getGameNameByGameId(rs.getInt("GameId"));
                if(i<size-1) rs.next();
            }
        }
        catch(Exception e) {
             System.out.println("Error");
             temp= new String[2];
             temp[0]="QuerygivesException";
             temp[1]=e.toString();
        }
        return resultString;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if(con != null)
            con.close();
    }
}
