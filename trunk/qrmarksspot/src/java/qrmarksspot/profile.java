/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qrmarksspot;

import Classes.MySqlConnection;
import com.sun.rave.faces.data.DefaultSelectItemsArray;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import javax.faces.FacesException;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @version profile.java
 * @version Created on 04.Oca.2012, 03:07:51
 * @author 23
 */

public class profile extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private DefaultSelectItemsArray dropdown1DefaultItems = new DefaultSelectItemsArray();

    public DefaultSelectItemsArray getDropdown1DefaultItems() {
        return dropdown1DefaultItems;
    }

    public void setDropdown1DefaultItems(DefaultSelectItemsArray dsia) {
        this.dropdown1DefaultItems = dsia;
    }

    // </editor-fold>
    String username;
    boolean username_RO;

    public boolean isDate_RO() {
        return date_RO;
    }

    public void setDate_RO(boolean date_RO) {
        this.date_RO = date_RO;
    }

    public boolean isFacebook_RO() {
        return facebook_RO;
    }

    public void setFacebook_RO(boolean facebook_RO) {
        this.facebook_RO = facebook_RO;
    }

    public boolean isPassword_RO() {
        return password_RO;
    }

    public void setPassword_RO(boolean password_RO) {
        this.password_RO = password_RO;
    }

    public boolean isTwitter_RO() {
        return twitter_RO;
    }

    public void setTwitter_RO(boolean twitter_RO) {
        this.twitter_RO = twitter_RO;
    }

    public boolean isUsername_RO() {
        return username_RO;
    }

    public void setUsername_RO(boolean username_RO) {
        this.username_RO = username_RO;
    }

    public boolean isWeb_RO() {
        return web_RO;
    }

    public void setWeb_RO(boolean web_RO) {
        this.web_RO = web_RO;
    }
    String title="Welcome ";
    String password;
    boolean password_RO;
    String facebook;
    boolean facebook_RO;
    String twitter;
    boolean twitter_RO;
    String web;
    boolean web_RO;
    String date;
    boolean date_RO;
    String[] games;
    boolean apply_visible;

    public boolean isApply_visible() {
        return apply_visible;
    }

    public void setApply_visible(boolean apply_visible) {
        this.apply_visible = apply_visible;
    }

    public String[] getGames() {
        return games;
    }

    public void setGames(String[] games) {
        this.games = games;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }



    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public profile() {
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
        
        try{
            MySqlConnection con = new MySqlConnection();
            this.setUsername(this.getSessionBean1().getEffectiveUserName());
            this.setPassword(con.getUserInfobyUserName(username, "Password"));
            this.setDate(con.getUserInfobyUserName(username, "DateOfBirth"));
            this.setFacebook(con.getUserInfobyUserName(username, "Facebook"));
            this.setTwitter(con.getUserInfobyUserName(username, "Twitter"));
            this.setWeb(con.getUserInfobyUserName(username, "WebsiteOfUser"));
            this.setTitle(this.getTitle()+this.getUsername());
            this.setUsername_RO(true);
            this.setPassword_RO(true);
            this.setDate_RO(true);
            this.setFacebook_RO(true);
            this.setTwitter_RO(true);
            this.setWeb_RO(true);
            this.setApply_visible(false);
            
            //this.setGames(con.getGameNameOfUser(username));
            //this.setDropdown1DefaultItems(this.getGames());
            //this.dropdown1DefaultItems(this.getGames());
        }
        catch(Exception E){
            System.out.println("Error");
        }

        



        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("profile Initialization Failure", e);
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

    public String button1_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return "homePage";
    }

    public String button2_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        this.getSessionBean1().setLoggedIn(false);
        return "signOut";
    }

    public String button3_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        this.setUsername_RO(false);
        this.setPassword_RO(false);
        this.setDate_RO(false);
        this.setFacebook_RO(false);
        this.setTwitter_RO(false);
        this.setWeb_RO(false);
        this.setApply_visible(true);
        return null;
    }

    public String button4_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        this.setUsername_RO(true);
        this.setPassword_RO(true);
        this.setDate_RO(true);
        this.setFacebook_RO(true);
        this.setTwitter_RO(true);
        this.setWeb_RO(true);
        this.setApply_visible(false);
        try{
            MySqlConnection con=new MySqlConnection();



        }
        catch(Exception E){

        }


        return null;
    }
    
}
