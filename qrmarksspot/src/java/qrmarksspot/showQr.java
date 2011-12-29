/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qrmarksspot;

import Classes.MySqlConnection;
import com.sun.rave.web.ui.appbase.AbstractPageBean;

import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.faces.FacesException;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.servlet.http.HttpServletRequest;
import qr.QR;
import qrmarksspot.SessionBean1;
import com.sun.rave.faces.data.DefaultSelectItemsArray;

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

    // </editor-fold>
    String[] gameNames = new String[] {"game1","game2"};
    String selectedGameName = new String();
    String selectedGameStepQR = new String();
    String selectedGameStepName = new String();


    String [] gamesteps_Numberofsteps = new String[]{"1","2"};
    String [] gamesteps_qrString = new String[] {"step1","step2"};
    String [] gameIDs = new String[] {"1","2"};


    

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



    public String[] getGamesteps_Numberofsteps() {
        return gamesteps_Numberofsteps;
    }

    public void setGamesteps_Numberofsteps(String[] gamesteps_Numberofsteps) {
        this.gamesteps_Numberofsteps = gamesteps_Numberofsteps;
    }

    public String[] getGamesteps_qrString() {
        return gamesteps_qrString;
    }

    public void setGamesteps_qrString(String[] gamesteps_qrString) {
        this.gamesteps_qrString = gamesteps_qrString;
    }


    public String[] getGameIDs() {
        return gameIDs;
    }

    public void setGameIDs(String[] gameIDs) {
        this.gameIDs = gameIDs;
    }

    public String[] getGameNames() {
        return gameNames;
    }

    public void setGameNames(String[] gameNames) {
        this.gameNames = gameNames;
    }
    private DefaultSelectItemsArray dropdown1DefaultItems1 = new DefaultSelectItemsArray();

    public DefaultSelectItemsArray getDropdown1DefaultItems1() {
        return dropdown1DefaultItems1;
    }

    public void setDropdown1DefaultItems1(DefaultSelectItemsArray dsia) {
        this.dropdown1DefaultItems1 = dsia;
    }
    private DefaultSelectItemsArray dropdown1DefaultItems2 = new DefaultSelectItemsArray();

    public DefaultSelectItemsArray getDropdown1DefaultItems2() {
        return dropdown1DefaultItems2;
    }

    public void setDropdown1DefaultItems2(DefaultSelectItemsArray dsia) {
        this.dropdown1DefaultItems2 = dsia;
    }
    private DefaultSelectItemsArray dropdown1DefaultItems3 = new DefaultSelectItemsArray();

    public DefaultSelectItemsArray getDropdown1DefaultItems3() {
        return dropdown1DefaultItems3;
    }

    public void setDropdown1DefaultItems3(DefaultSelectItemsArray dsia) {
        this.dropdown1DefaultItems3 = dsia;
    }
    private DefaultSelectItemsArray dropdown2DefaultItems = new DefaultSelectItemsArray();

    public DefaultSelectItemsArray getDropdown2DefaultItems() {
        return dropdown2DefaultItems;
    }

    public void setDropdown2DefaultItems(DefaultSelectItemsArray dsia) {
        this.dropdown2DefaultItems = dsia;
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

       

        int i = 0;
        try
        {
            MySqlConnection con = new MySqlConnection();
            ResultSet rs = con.getGameNameByUserId(this.getSessionBean1().getUserId());

            while(rs != null && rs.next()){

            if(i >= gameNames.length) continue;

            gameIDs[i] = (rs.getString("GameId"));
            gameNames[i] = (rs.getString("GameName"));
            
            i++;
            }
            
            this.dropdown1DefaultItems1.setItems(this.getGameNames());
            if(gameNames.length > 0){
            
                this.selectedGameName = gameNames[0];
                newValueForGameName(selectedGameName);
            
            } 
            this.dropdown2DefaultItems.setItems(this.gamesteps_Numberofsteps);

            if(gamesteps_Numberofsteps.length > 0){

                this.selectedGameStepName = gamesteps_Numberofsteps[0];

                int  index = -1;
                for(i=0;i<gamesteps_Numberofsteps.length;i++){

                if(gamesteps_Numberofsteps[i].compareTo(selectedGameStepName) == 0){

                    index = i;
                }
            }
        if( (index != -1)){

            selectedGameStepQR = gamesteps_qrString[index];
        }
        else{
            selectedGameStepQR = "default";
        }
            }
        }
        catch(Exception e)
        {
            this.dropdown1DefaultItems1.setItems(new String [] {e.getMessage()});
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

    
    public void gameStepDropDown_processValueChange(ValueChangeEvent event) {

    }

    public String generateButton_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.

        QR code  = new QR();
        String message = selectedGameStepQR; //bu olmalı
        int heigth = 300 ;
        int width = 300 ;
        HttpServletRequest req = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();

        String filepath  = req.getPathTranslated().substring(0, req.getPathTranslated().lastIndexOf('\\')) + "\\"+ this.getSessionBean1().getUserId() +".png";
        //SessionBean1["QRpath"] = filepath;

        code.create(message, heigth, width, filepath);

        return "case2";
    }


    public void newValueForGameName(String val){

        try{
            MySqlConnection con = new MySqlConnection();

            int  index = -1;
            for(int i=0;i<gameNames.length;i++){

                if(gameNames[i].compareTo(val) == 0){

                    index = i;
                }
            }

            ResultSet rs = con.getGameStepsByGameId(gameIDs[index]);
            int i = 0;
            while(rs != null && rs.next()){

                if(i >= gamesteps_Numberofsteps.length) continue;

                gamesteps_Numberofsteps[i] = (rs.getString("StepNumber"));
                gamesteps_qrString[i] = (rs.getString("QrString"));

                i++;
            }

            this.dropdown2DefaultItems.setItems(this.getGamesteps_Numberofsteps());
        }catch(Exception e){
            this.dropdown2DefaultItems.setItems(new String[] {e.getMessage()});
        }
    }

    public void dropdown1_processValueChange(ValueChangeEvent vce) {

        newValueForGameName((String)vce.getNewValue());
        
    }

    public void dropdown2_processValueChange(ValueChangeEvent vce) {

        int  index = -1;
            for(int i=0;i<gamesteps_Numberofsteps.length;i++){

                if(gamesteps_Numberofsteps[i].compareTo(((String)vce.getNewValue())) == 0){

                    index = i;
                }
            }
        if( (index != -1)){

            selectedGameStepQR = gamesteps_qrString[index];
        }
        else{
            selectedGameStepQR = "default";
        }

    }
    
}

