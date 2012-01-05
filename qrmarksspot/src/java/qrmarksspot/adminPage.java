/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qrmarksspot;

import Classes.Game;
import Classes.GameBean;
import Classes.MySqlConnection;
import com.sun.data.provider.impl.ListDataProvider;
import com.sun.rave.faces.data.DefaultSelectItemsArray;
import com.sun.rave.faces.data.DefaultTableDataModel;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Table;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.model.DefaultOptionsList;
import com.sun.webui.jsf.model.DefaultTableDataProvider;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.FacesException;
import javax.faces.event.ValueChangeEvent;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version adminPage.java
 * @version Created on Dec 28, 2011, 7:15:29 PM
 * @author alikerimerkan
 */

public class adminPage extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }

    // </editor-fold>

     int rowCount = 0;
     public String[] labels = new String[20];
     public String gameToBePlayed;
     public String[] gameNames;

    public String[] getGameNames() {
        return gameNames;
    }

    public void setGameNames(String[] gameNames) {
        this.gameNames = gameNames;
    }

    public String getGameToBePlayed() {
        return gameToBePlayed;
    }

    public void setGameToBePlayed(String gameToBePlayed) {
        this.gameToBePlayed = gameToBePlayed;
    }





    
    String gameNameToEdit ="";
    String gameToBeDeleted ;
    private int currentAbusementMessageId = 2;
    String abusementMessage;
     ResultSet set;
    ResultSet mySet;

    public ResultSet getMySet() {
        return mySet;
    }

    public void setMySet(ResultSet mySet) {
        this.mySet = mySet;
    }

    public String getGameNameToEdit() {
        return gameNameToEdit;
    }

    public void setGameNameToEdit(String gameNameToEdit) {
        this.gameNameToEdit = gameNameToEdit;
    }

   

    public String getAbusementMessage() {
        return abusementMessage;
    }

    public void setAbusementMessage(String abusementMessage) {
        this.abusementMessage = abusementMessage;
    }

    public String getGameToBeDeleted() {
        return gameToBeDeleted;
    }

    public void setGameToBeDeleted(String gameToBeDeleted) {
        this.gameToBeDeleted = gameToBeDeleted;
    }


    GameBean bean = new GameBean();
   
    public List<Game>  mygames = GameBean.games;

  
    
    //String[] y = x.toArray(new String[0]);


    public List<Game> getMygames() {
        return mygames;
    }

    public void setMygames(List<Game> mygames) {
        this.mygames = mygames;
    }


    public GameBean getBean() {
        return bean;
    }

    public void setBean(GameBean bean) {
        this.bean = bean;
    }
    private ListDataProvider listDataProvider1 = new ListDataProvider();

    public ListDataProvider getListDataProvider1() {
        return listDataProvider1;
    }

    public void setListDataProvider1(ListDataProvider ldp) {
        this.listDataProvider1 = ldp;
    }
    private DefaultTableDataModel dataTable1Model = new DefaultTableDataModel();

    public DefaultTableDataModel getDataTable1Model() {
        return dataTable1Model;
    }

    public void setDataTable1Model(DefaultTableDataModel dtdm) {
        this.dataTable1Model = dtdm;
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
    private TextArea textArea3 = new TextArea();

    public TextArea getTextArea3() {
        return textArea3;
    }

    public void setTextArea3(TextArea ta) {
        this.textArea3 = ta;
    }
    private DefaultSelectItemsArray dropdown1DefaultItems = new DefaultSelectItemsArray();

    public DefaultSelectItemsArray getDropdown1DefaultItems() {
        return dropdown1DefaultItems;
    }

    public void setDropdown1DefaultItems(DefaultSelectItemsArray dsia) {
        this.dropdown1DefaultItems = dsia;
    }
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public adminPage() throws SQLException {
  
//    try {

//            MySqlConnection con = new MySqlConnection();
//            set =con.getAbusementMessage(getSessionBean1().abusementMessageId);
//            while(set.next()){
//            this.abusementMessage = set.getString("message");
//            }
//        }
//        catch (Exception ex) {
       
//        }




       
   
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
        
        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("adminPage Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
      //  MySqlConnection con = new MySqlConnection();
      // this.setMySet(con.getGamesList());
        int i;
         try
        {
            MySqlConnection con = new MySqlConnection();
            ResultSet rs = con.getAllGameNames();
            i = 0;

            String[] temp2 = new String[100];

            while(rs != null && rs.next()){

                temp2[i] = (rs.getString("GameName"));

                i++;
            }

            gameNames = new String[i]; //arbitrary length

            for(int a = 0;a<i;a++){
            //i is the length
                gameNames[a] = temp2[a];

            }

            this.dropdown1DefaultItems.setItems(this.getGameNames());

        }catch(Exception e){
        
            gameNames[0] = e.getMessage();
        }


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


    public String button1_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String imageHyperlink1_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String deleteGameButton_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.

   //     MySqlConnection.deleteGame(this.gameToBeDeleted);

        return null;
    }

 /**
 * Shows the next abusement message in the text area.
 *
 */
    public String buttonSeeNextMessage_action() throws SQLException {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
     //   this.currentAbusementMessageId++;
         this.rowCount = 0;
        MySqlConnection con = new MySqlConnection();
        ResultSet rs =con.getAbusementMessageList();
while ( rs.next() )
{
    // Process the row.
    rowCount++;
}


        
         if(getSessionBean1().abusementMessageId>this.rowCount+1)
        {
            getSessionBean1().abusementMessageId = 2;
        }


        try {

            MySqlConnection con2 = new MySqlConnection();
            set =con2.getAbusementMessage(getSessionBean1().abusementMessageId);

            while(set.next()){
            this.abusementMessage = set.getString("message");
            }
        }
        catch (Exception ex) {
          //  this.setGameName("fail");
          //  Logger.getLogger(gamePage.class.getName()).log(Level.SEVERE, null, ex);
        }

        int temp = getSessionBean1().abusementMessageId;
       temp++;
        getSessionBean1().abusementMessageId = temp;

        
        return null;
    }

    public void textArea3_processValueChange(ValueChangeEvent event) {
    }

 /**
 * navigates the page to home.jsp
 *
 */
    public String backButton_action() {
      
        return "case1";
    }

 /**
 * navigates the page to editGame.jsp
 *
 */
    public String buttonEditGame_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        getSessionBean1().setGameNameToEdit(this.getGameNameToEdit());
        return "editGame";
        
    }

    public void dropdown1_processValueChange(ValueChangeEvent vce) {
    //    this.gameNameToEdit = this.dr
    }

  
    
}

