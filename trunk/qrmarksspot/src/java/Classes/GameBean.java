/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import org.apache.tomcat.util.modeler.ManagedBean;

//import Classes.MySqlConnection;
/**
 *
 * @author alke
 */
//@ManagedBean(name="GameBean1")
//@SessionScoped
public class GameBean implements Serializable{


    public List<Game>  games= new ArrayList<Game>();
    public ResultSet results;

    public ResultSet getResults() {
        return results;
    }

    public void setResults(ResultSet results) {
        this.results = results;
    }

    public static List<Game> getGames() {
        return games;
    }

    public static void setGames(List<Game> games) {
        GameBean.games = games;
    }

    public List<Game> getGameList() throws SQLException{

        try {
           MySqlConnection con = new MySqlConnection();
           ResultSet rs = con.getGamesList();
           this.results = rs;

           List<Game> list = new ArrayList<Game>();

           while(rs.next())
           {
               Game game = new Game();

               game.setBorders(rs.getString("Borders"));
               game.setCreaterId(rs.getInt("CreaterId"));
               game.setCreatorName(rs.getString("CreatorName"));
               game.setCurrentStep(rs.getInt("CurrentStep"));
               game.setDescription(rs.getString("Description"));
               game.setGameId(rs.getInt("GameId"));
               game.setGameName(rs.getString("GameName"));
               game.setIsFinished(rs.getInt("IsFinished"));
               game.setNumberOfPlayers(rs.getInt("NumberOfPlayers"));
               game.setNumberOfSteps(rs.getInt("NumberOfSteps"));
               game.setRating(rs.getInt("Rating"));
               game.setStartLocation(rs.getString("StartLocation"));

               list.add(game);

               games.add(game);
           }

        //   GameBean.games = list;
            return list;
        } catch(Exception e) {
             System.out.println("Error");

             return null;
        }


    }




}
