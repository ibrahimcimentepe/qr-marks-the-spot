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
 * @author alke
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
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public adminPage() {
     //    listDataProvider1.setList(this.getMygames());
     //   this.defaultTableDataProvider.setArray(mygames);,
   //     listDataProvider1.setList(mygames);
//   dataTable1Model.setWrappedData(this.mygames);
 //   this.dropdown1DefaultItems1.setItems( (String[]) this.mygames.toArray());

         //String[] y = x.toArray(new String[0]);
    //     this.currentAbusementMessageId++;
    try {

            MySqlConnection con = new MySqlConnection();
            set =con.getAbusementMessage(getSessionBean1().abusementMessageId);
            while(set.next()){
            this.abusementMessage = set.getString("message");
            }
        }
        catch (Exception ex) {
          //  this.setGameName("fail");
          //  Logger.getLogger(gamePage.class.getName()).log(Level.SEVERE, null, ex);
        }
   //     getSessionBean1().abusementMessageId ++;
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
        MySqlConnection con = new MySqlConnection();
       this.setMySet(con.getGamesList());


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

    public String buttonSeeNextMessage_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
     //   this.currentAbusementMessageId++;
        int temp = getSessionBean1().abusementMessageId;
        temp++;
        getSessionBean1().abusementMessageId = temp;
         if(getSessionBean1().abusementMessageId>8)
        {
            getSessionBean1().abusementMessageId = 2;
        }

        
        return null;
    }

    public void textArea3_processValueChange(ValueChangeEvent event) {
    }

    public String backButton_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case1";
    }

    public String buttonEditGame_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        getSessionBean1().setGameNameToEdit(this.getGameNameToEdit());
        return "editGame";
        
    }

  
    
}

