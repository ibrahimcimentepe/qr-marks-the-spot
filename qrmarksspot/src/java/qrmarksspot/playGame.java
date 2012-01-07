/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qrmarksspot;

import Classes.MySqlConnection;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import javax.faces.FacesException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.faces.event.ValueChangeEvent;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version playGame.java
 * @version Created on 04.Ara.2011, 18:55:23
 * @author 23
 */

public class playGame extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }

    // </editor-fold>
    //variables for textfields, pairs can be seen through JSP=>XML code
    String title;
    int playGameID;
    String gameName;
    int currentStep;
    int nofSteps;
    String currentStepString;
    String currentGameString;

    public String getCurrentGameString() {
        return currentGameString;
    }

    public void setCurrentGameString(String currentGameString) {
        this.currentGameString = currentGameString;
    }

    public int getNofSteps() {
        return nofSteps;
    }

    public void setNofSteps(int nofSteps) {
        this.nofSteps = nofSteps;
    }
    String location;
    String password;
    String givenPass;

    public String getGivenPass() {
        return givenPass;
    }

    public void setGivenPass(String givenPass) {
        this.givenPass = givenPass;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public playGame() {
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
        String temp1,temp2,temp3;
        int inttemp1,inttemp2,inttemp3;
        ResultSet temprs;
        clearTheBoxes();

        title="WELCOME "+this.getSessionBean1().effectiveUserName;
        // initially, we set all the textfields according to game specifications
        try{
            MySqlConnection con = new MySqlConnection();
            this.setGameName(con.getGameNameByGameId(this.getSessionBean1().getSelectedGameId()));
            this.setCurrentGameString("You are playing "+gameName);

            this.setNofSteps(con.getGame(this.getSessionBean1().getSelectedGameId()).getInt("NumberOfSteps"));
            inttemp1=this.getSessionBean1().getUserId();
            inttemp2=this.getSessionBean1().getSelectedGameId();
            temprs=con.getCurrentStep(inttemp1,inttemp2 );
            temprs.next();
            inttemp3=temprs.getInt("CurrentStepOfPlayer");
            this.setCurrentStep(inttemp3);

            this.setCurrentStepString("You are currently at step " + this.getCurrentStep());
            temprs=con.getInfoOfCurrentStep(this.getSessionBean1().getSelectedGameId(), currentStep);
            temprs.next();
            this.setLocation(String.format(temprs.getString("LocationOfQrCode")));
            temprs=con.getInfoOfCurrentStep(this.getSessionBean1().getSelectedGameId(), currentStep);
            temprs.next();
            this.setPassword(String.format(temprs.getString("PasswordOfStep")));
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("There is an error");
        } 

        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("playGame Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }
    //to clear all the textfields

    public void clearTheBoxes(){
        title="";
        playGameID=0;
        gameName="";
        currentStep=0;
        nofSteps=0;
        currentStepString="You are currently at step ";
        currentGameString="You are playing ";
    }
    //to fill all the boxes with the information of played game
    public void fillTheBoxes(){
        try{
            MySqlConnection con = new MySqlConnection();
            this.setGameName(con.getGameNameByGameId(this.getSessionBean1().getSelectedGameId()));
            this.setCurrentGameString(currentGameString=String.format(""+currentGameString+gameName));
            
            this.setNofSteps(con.getGame(this.getSessionBean1().getSelectedGameId()).getInt("NumberOfSteps"));
            this.setCurrentStep(con.getCurrentStep(this.getSessionBean1().getUserId(), this.getSessionBean1().getSelectedGameId()).getInt("CurrentStepOfPlayer"));

            this.setCurrentStepString(String.format(""+currentStepString + currentStep));
            this.setLocation(String.format(con.getInfoOfCurrentStep(this.getSessionBean1().getSelectedGameId(), currentStep).getString("LocationOfQrCode")));
            this.setPassword(String.format(con.getInfoOfCurrentStep(this.getSessionBean1().getSelectedGameId(), currentStep).getString("PasswordOfStep")));
        }catch(Exception e){
            System.out.println("There is an error");
        }        
    }

    public int getCurrentStep() {
        return currentStep;
    }



    public void setCurrentStep(int currentStep) {
        this.currentStep = currentStep;
    }

    public String getCurrentStepString() {
        return currentStepString;
    }

    public void setCurrentStepString(String currentStepString) {
        this.currentStepString = currentStepString;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPlayGameID() {
        return playGameID;
    }

    public void setPlayGameID(int playGameID) {
        this.playGameID = playGameID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    //when you click this button, you are using the found password to go to next level in the game
    public String nextButton_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        String result="";
        try{
            if(password.equalsIgnoreCase(givenPass)){
                if(currentStep==nofSteps){
                    result="success";
                    MySqlConnection con = new MySqlConnection();
                    con.setStepNegative(this.getSessionBean1().getUserId(), this.getSessionBean1().getSelectedGameId());
                }
                else{
                    result=null;
                    MySqlConnection con = new MySqlConnection();
                    con.incrementStep(this.getSessionBean1().getUserId(), this.getSessionBean1().getSelectedGameId());
                }
            }
            else{
                givenPass="Wrong password!";
                result=null;
            }

        }catch(Exception e){
            givenPass="Try Again!";
            System.out.println(e.getMessage());
        }



        //this.fillTheBoxes();

        return result;
    }

    public String homepage_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "toHome";
    }

    public String logout_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        this.getSessionBean1().setLoggedIn(false);
        return "logout";
    }

    
}

