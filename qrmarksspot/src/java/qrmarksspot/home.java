package qrmarksspot;


import Classes.MySqlConnection;
import com.sun.rave.faces.data.DefaultSelectItemsArray;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Label;
import com.sun.webui.jsf.model.DefaultTableDataProvider;
import java.sql.ResultSet;
import javax.faces.FacesException;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.event.ValueChangeEvent;
import sun.swing.UIAction;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version home.java
 * @version Created on 18.Kas.2011, 15:40:54
 * @author bilalacar,alikerimerkan,akifcemheren,ibrahimcimentepe
 */
public class home extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }

    // </editor-fold>

     public String[] labels = new String[20];
     public String gameToBePlayed;
     public String[] gameNames;
     public String forumTag;
     public boolean forumVisible;

    public boolean isForumVisible() {
        return forumVisible;
    }

    public void setForumVisible(boolean forumVisible) {
        this.forumVisible = forumVisible;
    }

    public String getForumTag() {
        return forumTag;
    }

    public void setForumTag(String forumTag) {
        this.forumTag = forumTag;
    }
     

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
    public home() {
        
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

        setForumVisible(false);
        for(int i = 0;i<labels.length;i++){

            labels[i] = " ";
        }
        
        int i = 0;
        try{
            MySqlConnection con = new MySqlConnection();
            ResultSet rs = con.getNews(4);
            while(rs.next()){
        
                labels[i] = rs.getString("News")+" "+
                        rs.getTimestamp("DateAndTime").toString();
                i++;
                //SessionBean1["label"] = labels[i];
            }

        }catch(Exception e){
        
        }
        
               
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



        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("home Initialization Failure", e);
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

    protected String getLabel(int i){

        return labels[i];
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

 /**
 * navigates the page to signup.jsp
 *
 */
    public String signup_action() {
        return "signup";
    }
 /**
 * navigates the page to login.jsp
 *
 */
    public String login_action() {
        return "case3";
    }

 /**
 * navigates the page to tutorial.jsp
 *
 */
    public String tutorial_action() {
        
        return "case4";
    }

 /**
 * clears the session variables for the current user by calling
 * sessinBean's logout() method
 *
 */
    public String logoutLink_action() {
        getSessionBean1().logout();
        return null;
    }

 /**
 * navigates the page to search.jsp
 *
 */
    public String searchButton_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "case1";
    }

 /**
 * navigates the page to createGame.jsp
 *
 */
    public String gameCreateButton_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "createGame";
    }

    public String[] getLabels() {
        return labels;
    }

    public void setLabels(String[] labels) {
        this.labels = labels;
    }

 /**
 * navigates the page to profile.jsp
 *
 */
    public String profileName_action() {
        // TODO: Process the action. Return value is a navigation
         // case name where null will return to the same page.

        return "proflink";
    }

 /**
 * navigates the page to gamePage.jsp
 * if corresponding game is not found an error message is printed to screen
 *
 */
    public String goToGameButton_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        String result="";
        try{
            MySqlConnection con = new MySqlConnection();
            if(con.gameExists(gameToBePlayed)){
                this.getSessionBean1().setSelectedGameId(con.getGameIdbyGameName(gameToBePlayed));
                result="gamePage";
            }else{
                gameToBePlayed="There is no such game!";
                result="failPlay";
            }
        }catch(Exception e){
            System.out.println("Error, going to homepage");
            gameToBePlayed="There is no such game!";
            result="failPlay";
        }finally{
            return result;
        }
    }

 /**
 * navigates the page to abusementMessage.jsp
 *
 */
    public String hyperlink2_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "abusementMessage";
    }

 /**
 * navigates the page to showQr.jsp
 *
 */
    public String seeQrCodesButton_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "showQr";
    }

 /**
 * navigates the page to forum page
 *
 */
    public void button1_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        try
       {
           java.awt.Desktop.getDesktop().browse(new java.net.URI("http://titan.cmpe.boun.edu.tr:8080/jforum/forums/list.page"));
           setForumVisible(true);
           setForumTag("Our Forum Address: http://titan.cmpe.boun.edu.tr:8080/jforum/forums/list.page");
       }
       catch(Exception e)
       {

       }
    }

    public String button2_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public void dropdown1_processValueChange(ValueChangeEvent vce) {
        
        gameToBePlayed = (String) vce.getNewValue();
    }

    public void gameSearchTextField_processValueChange(ValueChangeEvent event) {
    }


}

