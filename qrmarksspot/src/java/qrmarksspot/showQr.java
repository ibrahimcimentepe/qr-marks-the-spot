/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qrmarksspot;

import Classes.MySqlConnection;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.faces.FacesException;
import javax.faces.event.ValueChangeEvent;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version showQr.java
 * @version Created on Dec 14, 2011, 9:07:52 PM
 * @author alke
 */

public class showQr extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private SingleSelectOptionsList gameStepDropDownDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getGameStepDropDownDefaultOptions() {
        return gameStepDropDownDefaultOptions;
    }

    public void setGameStepDropDownDefaultOptions(SingleSelectOptionsList ssol) {
        this.gameStepDropDownDefaultOptions = ssol;
    }

    // </editor-fold>
    ArrayList<String> gameNames = new ArrayList();
    String selectedGameName = new String();
    String selectedGameStepQR = new String();
    String selectedGameStepName = new String();


    ArrayList<String> gamesteps_Numberofsteps = new ArrayList<String>();
    ArrayList<String> gamesteps_qrString = new ArrayList<String>();
    ArrayList<String> gameIDs = new ArrayList();


    public String getSelectedGameStepName() {
        return selectedGameStepName;
    }

    public void setSelectedGameStepName(String selectedGameStepName) {
        this.selectedGameStepName = selectedGameStepName;
    }
    public String getSelectedGameStepQR() {
        return selectedGameStepQR;
    }

    public void setSelectedGameStepQR(String selectedGameStepQR) {
        this.selectedGameStepQR = selectedGameStepQR;
    }
    public String getSelectedGameName() {
        return selectedGameName;
    }

    public void setSelectedGameName(String selectedGameName) {
        this.selectedGameName = selectedGameName;
    }



    public ArrayList<String> getGamesteps_Numberofsteps() {
        return gamesteps_Numberofsteps;
    }

    public void setGamesteps_Numberofsteps(ArrayList<String> gamesteps_Numberofsteps) {
        this.gamesteps_Numberofsteps = gamesteps_Numberofsteps;
    }

    public ArrayList<String> getGamesteps_qrString() {
        return gamesteps_qrString;
    }

    public void setGamesteps_qrString(ArrayList<String> gamesteps_qrString) {
        this.gamesteps_qrString = gamesteps_qrString;
    }


    public ArrayList<String> getGameIDs() {
        return gameIDs;
    }

    public void setGameIDs(ArrayList<String> gameIDs) {
        this.gameIDs = gameIDs;
    }

    public ArrayList<String> getGameNames() {
        return gameNames;
    }

    public void setGameNames(ArrayList<String> gameNames) {
        this.gameNames = gameNames;
    }




    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public showQr() {
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

       // for(int i = 0;i<labels.length;i++){

       //     labels[i] = " ";
       // }

        int i = 0;
        try{
            MySqlConnection con = new MySqlConnection();
            ResultSet rs = con.getGameNameByUserId(this.getSessionBean1().getUserId());
            while(rs.next()){

                gameNames.add(rs.getString("gameName"));
                gameIDs.add(rs.getString("gameId"));

                //SessionBean1["label"] = labels[i];
            }

        }catch(Exception e){

        }
        
        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("showQr Initialization Failure", e);
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
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
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
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    public void gameNameDropDown_processValueChange(ValueChangeEvent event) {

        gamesteps_Numberofsteps.clear();
        gamesteps_qrString.clear();

        try{
            MySqlConnection con = new MySqlConnection();

            int index = gameNames.indexOf(selectedGameName);

            ResultSet rs = con.getGameStepsByGameId(gameIDs.get(index).toString());
            while(rs.next()){

                gamesteps_Numberofsteps.add(rs.getString("StepNumber"));
                gamesteps_qrString.add(rs.getString("QrString"));

                //SessionBean1["label"] = labels[i];
            }

        }catch(Exception e){

        }
    }

    public void gameStepDropDown_processValueChange(ValueChangeEvent event) {

        int index = gamesteps_Numberofsteps.indexOf(selectedGameStepName);
        selectedGameStepQR = gamesteps_qrString.get(index);

    }
    
}

