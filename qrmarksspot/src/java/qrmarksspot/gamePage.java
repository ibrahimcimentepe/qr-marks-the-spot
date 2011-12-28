/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qrmarksspot;

import Classes.MySqlConnection;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Label;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.FacesException;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version gamePage.java
 * @version Created on Dec 1, 2011, 3:28:10 AM
 * @author alke
 */

public class gamePage extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }

    // </editor-fold>
        
        String result = "bos"; //simdilik result set bos
        ResultSet selectedGame;

        int gameId ;   //simdilik bir game ID
        String gameName;
        String description;
        String startingPoint;
        String borders;
        int numberOfSteps;
        int currentStep;
        int numberOfPlayers;
        int rating ;
        String creatorName;
        String playButton="PLAY THIS GAME!";

    public String getPlayButton() {
        return playButton;
    }

    public void setPlayButton(String playButton) {
        this.playButton = playButton;
    }
        
        
    public String getBorders() {
        return borders;
    }

    public void setBorders(String borders) {
        this.borders = borders;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public int getCurrentStep() {
        return currentStep;
    }

    public void setCurrentStep(int currentStep) {
        this.currentStep = currentStep;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfSteps() {
        return numberOfSteps;
    }

    public void setNumberOfSteps(int numberOfSteps) {
        this.numberOfSteps = numberOfSteps;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public ResultSet getSelectedGame() {
        return selectedGame;
    }

    public void setSelectedGame(ResultSet selectedGame) {
        this.selectedGame = selectedGame;
    }

    public String getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(String startingPoint) {
        this.startingPoint = startingPoint;
    }
    public gamePage() {
    }

    /**
     * <p>Callback method that is called whenever a page is navigated to,
     * either directly via a URL, or indirectly via page navigation.
     * Customize this method to acquire resources that will be needed
     * for event handlers and lifecycle methods, whether or not this
     * page is performing post back processing.</p>
     * 
     * <p>Note that, if the current request is a postback, the property
     * values of the components do <strong>not</strong> represent any
     * values submitted with this request.  Instead, they represent the
     * property values that were saved for this view when it was rendered.</p>
     */
    @Override
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
            
        try {
            this.gameId = getSessionBean1().getSelectedGameId();
            MySqlConnection con = new MySqlConnection();
            this.selectedGame = con.getGame(this.gameId);
            
     //     this.result =this.selectedGame.getString("Description");
            
            this.gameName = this.selectedGame.getString("GameName");
            this.description = this.selectedGame.getString("Description");
            this.startingPoint = this.selectedGame.getString("StartLocation");
            this.borders = this.selectedGame.getString("Borders");
            this.numberOfSteps = this.selectedGame.getInt("NumberOfSteps");
            this.currentStep = this.selectedGame.getInt("CurrentStep");
            this.numberOfPlayers = this.selectedGame.getInt("NumberOfPlayers");
            this.rating = this.selectedGame.getInt("Rating");
            this.creatorName = this.selectedGame.getString("CreatorName");
            //oyun önceden oynanmış mı? ona göre buton farklılaşacak.
            if(!(con.playGameExists(this.getSessionBean1().getUserId(), this.getSessionBean1().getSelectedGameId())))
                this.playButton="PLAY THIS GAME!!!";
            else
                this.playButton="CONTINUE THIS GAME!!!";


         //   return null;
        } catch (SQLException ex) {
            this.setGameName("fail");
            Logger.getLogger(gamePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("gamePage Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }

    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
    @Override
    public void preprocess() {
    }

    /**
     * <p>Callback method that is called just before rendering takes place.
     * This method will <strong>only</strong> be called for the page that
     * will actually be rendered (and not, for example, on a page that
     * handled a postback and then navigated to a different page).  Customize
     * this method to allocate resources that will be required for rendering
     * this page.</p>
     */
    @Override
    public void prerender() {
    }

    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called (regardless of whether
     * or not this was the page that was actually rendered).  Customize this
     * method to release resources acquired in the <code>init()</code>,
     * <code>preprocess()</code>, or <code>prerender()</code> methods (or
     * acquired during execution of an event handler).</p>
     */
    @Override
    public void destroy() {
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    public String backButton_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "home";
    }

    public void bring_action() {

        try {
            this.gameId = getSessionBean1().getSelectedGameId();
            MySqlConnection con = new MySqlConnection();
            this.selectedGame = con.getGame(this.gameId);
            this.gameName = this.selectedGame.getString("GameName");
            this.description = this.selectedGame.getString("Description");
            this.startingPoint = this.selectedGame.getString("StartLocation");
            this.borders = this.selectedGame.getString("Borders");
            this.numberOfSteps = this.selectedGame.getInt("NumberOfSteps");
            this.currentStep = this.selectedGame.getInt("CurrentStep");
            this.numberOfPlayers = this.selectedGame.getInt("NumberOfPlayers");
            this.rating = this.selectedGame.getInt("Rating");
            this.creatorName = this.selectedGame.getString("CreatorName");

        } catch (SQLException ex) {
            Logger.getLogger(gamePage.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    public String buttonPlayGame_action() {

   //     getSessionBean1().set
   //     this.result = "sonuclar : gameId" + getSessionBean1().selectedGameId +"  userId "+ getSessionBean1().userId;
        String result="";
        try{
            MySqlConnection con = new MySqlConnection();
            if(!(con.playGameExists(this.getSessionBean1().getUserId(), this.getSessionBean1().getSelectedGameId())))
                con.addPlayGame(this.getSessionBean1().effectiveUserName, this.getSessionBean1().getSelectedGameId());
        }catch(Exception e){
            
        }
        if(this.getSessionBean1().loggedIn)
            result="playGame";
        else
            result="signUp";

        return result;
    }
    
}

